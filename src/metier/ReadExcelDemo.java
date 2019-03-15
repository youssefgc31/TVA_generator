package metier;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//import java.text.SimpleDateFormat;
//import java.util.Iterator;

//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;

//import statements
public class ReadExcelDemo {
//	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		try {
			FileInputStream file = new FileInputStream(new File("/Users/mac/Desktop/canvas.xlsx"));

			// Create Workbook instance holding reference to .xlsx file
			XSSFWorkbook wb = new XSSFWorkbook(file);

			// Get first/desired sheet from the workbook
			XSSFSheet sh = wb.getSheetAt(0);

			System.out.println(wb.getSheetAt(0).getRow(0).getCell(16));
			System.out.println(wb.getSheetAt(0).getRow(1).getCell(16));
			System.out.println(wb.getSheetAt(0).getRow(2).getCell(16));
			System.out.println(wb.getSheetAt(0).getRow(3).getCell(16));
			System.out.println(wb.getSheetAt(0).getRow(4).getCell(16));

			//Contribuable from excel
			
	     	Contribuable contribuable = new Contribuable();
			//contribuable.setIF(wb.getSheetAt(0).getRow(1).getCell(16).getStringCellValue());
			// Reste à ajouter une variable pour identifier l'utilisateur(peuvent etre
			// envoyé comme paramettre)
	/*		Connection c = SingletonConnexion.getConnection();
		try {
				PreparedStatement statement = c.prepareStatement("INSERT INTO `CONTRIBUABLE`(`id_f`, `ID_User`) VALUES (?,?)");
				statement.setString(1, contribuable.getIF());
				statement.setString(2, contribuable.getUser());
				statement.executeUpdate();
				statement.close();
			} catch (MySQLIntegrityConstraintViolationException e) {

				e.printStackTrace();
			}
			catch (SQLException ex) {
                ex.printStackTrace();
              }
		*/	
			//Fournisseur from excel
			
	/*	for (int j = 1; j < 1000; j++) {
				Fournisseur fournisseur=new Fournisseur();
				
				fournisseur.setIff(wb.getSheetAt(0).getRow(j).getCell(6).getStringCellValue());
				fournisseur.setNom(wb.getSheetAt(0).getRow(j).getCell(7).getStringCellValue());
				fournisseur.setIce(wb.getSheetAt(0).getRow(j).getCell(8).getStringCellValue());

				Connection conn = SingletonConnexion.getConnection();
				try {
					PreparedStatement statement = conn.prepareStatement("INSERT IGNORE INTO `FOURNISSEUR`(`IDF`, `NAME`, `ICE`) VALUES (?,?,?)");
					statement.setString(1, fournisseur.getIff());
					statement.setString(2, fournisseur.getNom());
					statement.setString(3, fournisseur.getIce());
					statement.executeUpdate();
					statement.close();
				} catch (MySQLIntegrityConstraintViolationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				catch (SQLException ex) {
                ex.printStackTrace();
              }
			}
		*/	
			//Facture from excel
			for (int i = 1; i < 1000; i++) {
				Facture f = new Facture();
				// SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
				f.setOrdre((int) wb.getSheetAt(0).getRow(i).getCell(0).getNumericCellValue());
				f.setNum_facture(Integer.parseInt(wb.getSheetAt(0).getRow(i).getCell(1).getStringCellValue()));
				f.designation = wb.getSheetAt(0).getRow(i).getCell(2).getStringCellValue();
				f.mht = (float) wb.getSheetAt(0).getRow(i).getCell(3).getNumericCellValue();
				f.tva = (float) wb.getSheetAt(0).getRow(i).getCell(4).getNumericCellValue();
				f.ttc = (float) wb.getSheetAt(0).getRow(i).getCell(5).getNumericCellValue();
				f.tax = (float) wb.getSheetAt(0).getRow(i).getCell(9).getNumericCellValue();
				f.setId_paiment((int) wb.getSheetAt(0).getRow(i).getCell(10).getNumericCellValue());
				java.sql.Date d = java.sql.Date.valueOf(wb.getSheetAt(0).getRow(i).getCell(12).getStringCellValue());
				f.setDate_fac(d);
				java.sql.Date d2 = java.sql.Date.valueOf(wb.getSheetAt(0).getRow(i).getCell(11).getStringCellValue());
				f.setDate_pai(d2);
				// f.setDate_fac((java.sql.Date)
				// wb.getSheetAt(0).getRow(i).getCell(11).getDateCellValue());
				f.setIff(wb.getSheetAt(0).getRow(i).getCell(6).getStringCellValue());
				System.out.println(f.ordre);
				System.out.println(f.num_facture);
				System.out.println(f.designation);

				Connection co = SingletonConnexion.getConnection();
				try {
					PreparedStatement statement = co.prepareStatement(
							"INSERT INTO FACTURES( ORDRE, NUM_FACTURE, DESIGNATION, MHT, TVA, TTC, TAX,IDF, ID_PAIMENT, DPAI, DFAC) VALUES (  ?, ?, ?, ?, ?, ?, ?, ?, ? ,? ,?)");
					statement.setInt(1, f.getOrdre());
					statement.setInt(2, f.getNum_facture());
					statement.setString(3, f.getDesignation());
					statement.setFloat(4, f.getMht());
					statement.setFloat(5, f.getTva());
					statement.setFloat(6, f.getTtc());
					statement.setFloat(7, f.getTax());
					statement.setString(8, f.getIff());
					statement.setInt(9, f.getId_paiment());
					statement.setDate(10, (java.sql.Date) f.getDate_fac());
					statement.setDate(11, (java.sql.Date) f.getDate_pai());
					statement.executeUpdate();
					statement.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				file.close();
			}

			// Iterate through each rows one by one
			/*
			 * Iterator<Row> rowIterator = sh.iterator();
			 * 
			 * while (rowIterator.hasNext()) { Row row = rowIterator.next(); //For each row,
			 * iterate through all the columns Iterator<Cell> cellIterator =
			 * row.cellIterator(); Facture facture=new Facture();
			 * 
			 * while (cellIterator.hasNext()) { Cell cell = cellIterator.next(); //Check the
			 * cell type and format accordingly if(cell.getColumnIndex()<13) {
			 * if(cell.getColumnIndex()==0) { facture.setOrdre((int)
			 * cell.getNumericCellValue()); } if(cell.getColumnIndex()==0) {
			 * facture.setNum_facture((int) cell.getNumericCellValue()); }
			 * //if(cell.getColumnIndex()==1) { facture.setNum_facture((int)
			 * cell.getNumericCellValue()); } if(cell.getColumnIndex()==2) {
			 * facture.setDesignation(cell.getStringCellValue()); }
			 * if(cell.getColumnIndex()==3) { facture.setMht((float)
			 * cell.getNumericCellValue()); } if(cell.getColumnIndex()==4) {
			 * facture.setTva((float) cell.getNumericCellValue()); }
			 * if(cell.getColumnIndex()==5) { facture.setTtc((float)
			 * cell.getNumericCellValue()); } if(cell.getColumnIndex()==6) {
			 * facture.setTax((float) cell.getNumericCellValue()); }
			 * 
			 * 
			 * /* switch (cell.getCellType()) { case Cell.CELL_TYPE_NUMERIC:
			 * System.out.print(cell.getNumericCellValue() + "  "); break; case
			 * Cell.CELL_TYPE_STRING: System.out.print(cell.getStringCellValue() + "  ");
			 * break; }
			 * 
			 * 
			 * 
			 * } } Connection co=SingletonConnexion.getConnection(); try { PreparedStatement
			 * statement = co.
			 * prepareStatement("INSERT INTO FACTURE( ORDRE, NUM_FACTURE, DESIGNATION, MHT, TVA, TTC, TAX) VALUES ( ?, ?, ?, ?, ?, ?,? )"
			 * ); statement.setInt(1, facture.getOrdre()); statement.setInt(2,
			 * facture.getNum_facture()); statement.setString(3, facture.getDesignation());
			 * statement.setFloat(4, facture.getMht()); statement.setFloat(5,
			 * facture.getTva()); statement.setFloat(6, facture.getTtc());
			 * statement.setFloat(7, facture.getTax()); statement.executeUpdate();
			 * statement.close(); } catch (SQLException e) { // TODO Auto-generated catch
			 * block e.printStackTrace(); }
			 * 
			 * System.out.println(" "); } file.close();
			 */
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}