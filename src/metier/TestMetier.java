package metier;
import java.sql.Date;
import java.util.List;
public class TestMetier {

	public static void main(String[] args) {
		ICatalogueMetier metier= new CatalogueMetierImpl();
		Date date1= new Date(0);
		Date date2= new Date(0);
		Facture f=new Facture( 54, 7, "mars", 1234, 67, 7, 89, 900, "1", date1, date2);
		metier.addFacture(f);
		Facture f2=new Facture(90, 78, "facture07/12", 9, 90, 93, 34, 34, "2", date1, date2);
		metier.addFacture(f2);
		//System.out.println(f.getOrdre());
     	//List<Facture> factures=metier.listFactures();
     	//System.out.println(f.getFacture_id());
     	//System.out.println(f2.getFacture_id());
		//System.out.println("-------------------------");
		//for(Facture F:factures) {
			//System.out.println(F.getDesignation());
		//}
		/*Facture f=metier.getFacture("12");
		f.setNum_facture(848);
	    metier.updateFacture(f);
		System.out.println("-------------------------");
		System.out.println(f.getOrdre());
		*/
		//metier.deleteFacture(3);
	
	}

}
