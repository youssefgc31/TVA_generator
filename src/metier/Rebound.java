/*package metier;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;



import java.util.ArrayList;
import java.util.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class rebound {
	
	public static void main(String[] args) {
	ArrayList<Rd> relevee=new ArrayList<Rd>();

    int identifiantFiscal=1;
    int annee=2012;
    int periode=12;
    int regime=1;
    
    
   
    
    
	//public void Generer(ArrayList<Rd> relevee, int identifiantFiscal, int annee, int periode, int regime) {
		
		
		    DeclarationReleveDeduction declarationReleveDeduction =new DeclarationReleveDeduction();
		    ReleveDeductions relevedeductions= new ReleveDeductions();
		    relevee= new ArrayList<Rd> ();
		    relevedeductions.setRd(relevee);
		    
		      
		      Reff reff=new Reff();
		      Mp mp=new Mp();
		      Date date=new Date();
		      

			  reff.setIff(123);
	    	      reff.setNom("ONE");
	    	      reff.setIce(13);
	    	      mp.setId(13);
		      
		       
		      SimpleDateFormat formater =new SimpleDateFormat("yy-MM-dd");
		      try {
				date=formater.parse("12-12-2010");
			} catch (ParseException e1) {
				
				e1.printStackTrace();
			}
		     // formater.format(date);
		      declarationReleveDeduction.setIdentifiantFiscal(identifiantFiscal);
		      declarationReleveDeduction.setAnnee(annee);
		      declarationReleveDeduction.setPeriode(periode);
		      declarationReleveDeduction.setRegime(regime);
		      declarationReleveDeduction.setReleveDeductions(relevedeductions);
		      
		      
		      Connection co=SingletonConnexion.getConnection();
				try {
					PreparedStatement statement = co.prepareStatement("SELECT * FROM FACTURE");
					ResultSet resultSet = statement.executeQuery();
					while (resultSet.next()) {
						Rd rd=new Rd();
						rd.setOrd(resultSet.getInt("ordre"));
						rd.setNum(resultSet.getInt("num_facture"));
						rd.setDes(resultSet.getString("designation"));
						rd.setMht(resultSet.getFloat("mht"));
						rd.setTtc(resultSet.getFloat("ttc"));
						rd.setTva(resultSet.getFloat("tva"));
						rd.setTx(resultSet.getFloat("tax"));
						rd.setDate(date);
						rd.setMp(mp);
						rd.setReff(reff);
						
						relevee.add(rd);
					}statement.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
						
		      
		  /*   for(Rd rd:relevee) {
		    	      rd.setOrd(3);
		    	      rd.setNum(12);
		    	      rd.setDes("des");
		    	      rd.setMht(12);
		    	      rd.setTva(20);
		    	      rd.setTtc(123);
		    	      rd.setReff(reff);
		    	      
		    	      rd.setTx(12);
		    	      rd.setMp(mp);
		    	     
		    	      rd.setDate(date);
		      }
*/
/*			  try {

				File file = new File("/Users/mac/desktop/simple_tva.xml");
				JAXBContext jaxbContext = JAXBContext.newInstance(DeclarationReleveDeduction.class);
				Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

				// output pretty printed
				jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

				jaxbMarshaller.marshal(declarationReleveDeduction, file);
				jaxbMarshaller.marshal(declarationReleveDeduction, System.out);

			      } catch (JAXBException ex) {
				ex.printStackTrace();
			      }
	}
	
	
    	
    }



//EXCEL
package metier;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

 




//import statements
public class ReadExcelDemo 
{
  @SuppressWarnings("deprecation")
public static void main(String[] args) 
  {
      try
      {
          FileInputStream file = new FileInputStream(new File("/Users/mac/Desktop/canvas.xlsx"));

          //Create Workbook instance holding reference to .xlsx file
          XSSFWorkbook wb = new XSSFWorkbook(file);

          //Get first/desired sheet from the workbook
          XSSFSheet sh = wb.getSheetAt(0);

          
          System.out.println(wb.getSheetAt(0).getRow(0).getCell(16));
          System.out.println(wb.getSheetAt(0).getRow(1).getCell(16));
          System.out.println(wb.getSheetAt(0).getRow(2).getCell(16));
          System.out.println(wb.getSheetAt(0).getRow(3).getCell(16));
          System.out.println(wb.getSheetAt(0).getRow(4).getCell(16));
          
          
          
          //Iterate through each rows one by one
       Iterator<Row> rowIterator = sh.iterator();
       
          while (rowIterator.hasNext()) 
          {
              Row row = rowIterator.next();
              //For each row, iterate through all the columns
              Iterator<Cell> cellIterator = row.cellIterator();
               
              while (cellIterator.hasNext()) 
              {
                  Cell cell = cellIterator.next();
                  //Check the cell type and format accordingly
                  if( cell.getColumnIndex()<13) {
                  switch (cell.getCellType()) 
                  {
                      case Cell.CELL_TYPE_NUMERIC:
                          System.out.print(cell.getNumericCellValue() + "  ");
                          break;
                      case Cell.CELL_TYPE_STRING:
                          System.out.print(cell.getStringCellValue() + "  ");
                          break;
                  }
                  Facture facture=new Facture();
                  Connection co=SingletonConnexion.getConnection();
          		try {
          			PreparedStatement statement = co.prepareStatement("INSERT INTO FACTURE(IDFACTURE, ORDRE, NUM_FACTURE, DESIGNATION, MHT, TVA, TTC, TAX) VALUES (?, ?, ?, ?, ?, ?, ?,? )");
          			statement.setInt(1, facture.getFacture_id());
          	        statement.setInt(2, facture.getOrdre());
          	        statement.setInt(3, facture.getNum_facture());
          	        statement.setString(4, facture.getDesignation());
          	        statement.setFloat(5, facture.getMht());
          	        statement.setFloat(6, facture.getTva());
          	        statement.setFloat(7, facture.getTtc());
          	        statement.setFloat(8, facture.getTax());
          	        statement.executeUpdate();
          	        statement.close();
          		} catch (SQLException e) {
          			// TODO Auto-generated catch block
          			e.printStackTrace();
          		}

              }
              }
              System.out.println(" ");
          }   
          file.close();
      } 
      catch (Exception e) 
      {
          e.printStackTrace();
      }
  }
}*/
