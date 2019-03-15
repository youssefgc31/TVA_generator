package metier;
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

public class Generateur {
	
	/*public static void main(String[] args) {
	

    int identifiantFiscal=1;
    int annee=2012;
    int periode=12;
    int regime=1;
    
    
   
   */ 
    
public void Generer(String identifiantFiscal, int annee, int periode, int regime) {
		
		
		    DeclarationReleveDeduction declarationReleveDeduction =new DeclarationReleveDeduction();
		    ReleveDeductions relevedeductions= new ReleveDeductions();
		    ArrayList<Rd>  relevee= new ArrayList<Rd> ();
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
				
				try {

					File file = new File("/Users/mac/desktop/Simpletva.xml");
				JAXBContext jaxbContext = JAXBContext.newInstance(DeclarationReleveDeduction.class);
				Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

				// output pretty printed
				jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

				jaxbMarshaller.marshal(declarationReleveDeduction, file);
				jaxbMarshaller.marshal(declarationReleveDeduction, System.out);

			      } catch (JAXBException ex) {
				ex.printStackTrace();
			      }
			//  return file;	  
	}
	
	
    	
    }



