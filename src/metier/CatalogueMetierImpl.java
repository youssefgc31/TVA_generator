package metier;



import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CatalogueMetierImpl implements ICatalogueMetier {

	
	@Override
	public void login(Log log){
		Connection co=SingletonConnexion.getConnection();
		try{
			PreparedStatement statement = co.prepareStatement("select * from ONCF.users where login=? and pass=?");
			statement.setString(1, log.getUsers());
	        statement.setString(2, log.getPass());
	        statement.executeUpdate();
	        statement.close();
                    
		}
	   catch (SQLException e) {
		
		e.printStackTrace();}
	
	}
	@Override
	public void addFournisseur(Fournisseur fo) {
		Connection co=SingletonConnexion.getConnection();
		try {
			PreparedStatement statement = co.prepareStatement("INSERT INTO FOURNISSEUR ( IDF, NAME, ICE) VALUES (?,?,?)");
	       
	        statement.setString(1, fo.getIff());
	        statement.setString(2, fo.getNom());
	        statement.setString(3, fo.getIce());
	 
	        statement.executeUpdate();
   	        
				
	        statement.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

		
	}
	
	@Override
	public void addFacture(Facture facture) {
	
		Connection co=SingletonConnexion.getConnection();
		try {
			PreparedStatement statement = co.prepareStatement("INSERT INTO FACTURES (ORDRE, NUM_FACTURE, DESIGNATION, MHT, TVA, TTC, TAX, IDF, DPAI, DFAC,ID_PAIMENT) VALUES (?,?,?,?,?,?,?,?,?,?,?)");
	        statement.setInt(1, facture.getOrdre());
	        statement.setInt(2, facture.getNum_facture());
	        statement.setString(3, facture.getDesignation());
	        statement.setFloat(4, facture.getMht());
	        statement.setFloat(5, facture.getTva());
	        statement.setFloat(6, facture.getTtc());
	        statement.setFloat(7, facture.getTax());
	        statement.setString(8, facture.getIff()); 
	        statement.setDate(9, (Date) facture.getDate_fac());
	        statement.setDate(10, (Date) facture.getDate_pai());
	        statement.setInt(11, facture.getId_paiment());
	        statement.executeUpdate();
   	        
				
	        statement.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}

	@Override
	public void updateFacture(Facture facture) {
		
		Connection co=SingletonConnexion.getConnection();
		try {
			PreparedStatement statement = co.prepareStatement("UPDATE FACTURES SET ordre = ?, num_facture = ?,designation = ? ,MHT = ?,TVA = ?,TTC = ?,TAX = ? where idfacture=?");
			
	        statement.setInt(1, facture.getOrdre());
	        statement.setInt(2, facture.getNum_facture());
	        statement.setString(3, facture.getDesignation());
	        statement.setFloat(4, facture.getMht());
	        statement.setFloat(5, facture.getTva());
	        statement.setFloat(6, facture.getTtc());
	        statement.setFloat(7, facture.getTax());
	        statement.setInt(8, facture.getFacture_id());
	        statement.executeUpdate();
	        statement.close();
	        
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void deleteFacture(int id) {
		
		Connection co=SingletonConnexion.getConnection();
		try {
			PreparedStatement statement = co.prepareStatement("DELETE FROM FACTURES WHERE id_facture = ?");
			
	        statement.setInt(1, id);
	       statement.executeUpdate();
	        statement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

	@Override
	public Facture getFacture(String des) {
		Facture facture = null;
		
		Connection co=SingletonConnexion.getConnection();
		try {
			PreparedStatement statement = co.prepareStatement("SELECT * FROM FACTURES where DESIGNATION=?");
			statement.setString(1, des);
			ResultSet resultSet = statement.executeQuery();
			if (resultSet.next()) {
				facture=new Facture ();
				 facture.setFacture_id(resultSet.getInt("IDFACTURE"));
	        	     facture.setOrdre(resultSet.getInt("ORDRE"));
                 facture.setNum_facture(resultSet.getInt("NUM_FACTURE"));
                 facture.setDesignation(resultSet.getString("DESIGNATION"));
                 facture.setMht(resultSet.getInt("MHT"));
                 facture.setTva(resultSet.getInt("TVA"));
                 facture.setTtc(resultSet.getInt("TTC"));
                 facture.setTax(resultSet.getInt("TAX"));
                 facture.setIff(resultSet.getString("IDF"));
                 facture.setDate_fac(resultSet.getDate("DFAC"));
                 facture.setDate_pai(resultSet.getDate("DPAI"));
                 facture.setId_paiment(resultSet.getInt("ID_PAIMENT"));
                 
                 
                 
                
			}statement.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		if (facture==null) throw new RuntimeException("Facture" +des+ "Introuvable");		
		return facture;
	}

	@Override
	public List<Facture> listFactures() {
		List<Facture> Factures = new ArrayList<Facture>();
		Connection co=SingletonConnexion.getConnection();
		try {
			PreparedStatement statement = co.prepareStatement("SELECT * FROM FACTURES");
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				 Facture facture = new Facture ();

	        	     facture.setOrdre(resultSet.getInt("ORDRE"));
                 facture.setNum_facture(resultSet.getInt("NUM_FACTURE"));
                 facture.setDesignation(resultSet.getString("DESIGNATION"));
                 facture.setMht(resultSet.getInt("MHT"));
                 facture.setTva(resultSet.getInt("TVA"));
                 facture.setTtc(resultSet.getInt("TTC"));
                 facture.setTax(resultSet.getInt("TAX"));
                 facture.setIff(resultSet.getString("IDF"));
                 facture.setDate_fac(resultSet.getDate("DFAC"));
                 facture.setDate_pai(resultSet.getDate("DPAI"));
                 facture.setId_paiment(resultSet.getInt("ID_PAIMENT"));
              
                 Factures.add(facture);
			}statement.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
				
		return Factures;
	}

	@Override
	public List<Facture> listFacturesMC(String mc) {
		List<Facture> Factures = new ArrayList<Facture>();
		Connection co=SingletonConnexion.getConnection();
		try {
			PreparedStatement statement = co.prepareStatement("SELECT * FROM FACTURES where DESIGNATION like ? ");
			statement.setString(1,"%"+mc+"%");
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				 Facture facture = new Facture ();
				 facture.setFacture_id(resultSet.getInt("ID_FACTURE"));
	        	     facture.setOrdre(resultSet.getInt("ORDRE"));
                 facture.setNum_facture(resultSet.getInt("NUM_FACTURE"));
                 facture.setDesignation(resultSet.getString("DESIGNATION"));
                 facture.setMht(resultSet.getInt("MHT"));
                 facture.setTva(resultSet.getInt("TVA"));
                 facture.setTtc(resultSet.getInt("TTC"));
                 facture.setTax(resultSet.getInt("TAX"));
                 facture.setIff(resultSet.getString("IDF"));
                 facture.setDate_fac(resultSet.getDate("DFAC"));
                 facture.setDate_pai(resultSet.getDate("DPAI"));
                 facture.setId_paiment(resultSet.getInt("ID_PAIMENT"));
              
                 Factures.add(facture);
			}statement.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
				
		return Factures;
	}

	

}
