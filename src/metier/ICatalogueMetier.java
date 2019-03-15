package metier;

import java.util.List;

public interface ICatalogueMetier {
public void addFournisseur(Fournisseur fo);	
public void addFacture(Facture facture);
public void updateFacture(Facture facture);
public void deleteFacture(int id);
public Facture getFacture(String des);
public List<Facture> listFactures();
public List<Facture> listFacturesMC(String mc);
public void login(Log log);
}
