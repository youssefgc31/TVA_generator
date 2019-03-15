package web;

import java.util.ArrayList;
import java.util.List;

import metier.Contribuable;
import metier.Facture;
import metier.Fournisseur;

public class FactureModel {

private List<Facture> factures=new ArrayList<Facture>();
private String msgErr;
private String mode="add";
private String motCle;
private Fournisseur fournisseur=new Fournisseur();
private Facture facture=new Facture();
private Contribuable contribuable=new Contribuable();
public Fournisseur getFournisseur() {
	return fournisseur;
}
public void setFournisseur(Fournisseur fournisseur) {
	this.fournisseur = fournisseur;
}

public Contribuable getContribuable() {
	return contribuable;
}
public void setContribuable(Contribuable contribuable) {
	this.contribuable = contribuable;
}

public String getMode() {
	return mode;
}
public void setMode(String mode) {
	this.mode = mode;
}
public String getMsgErr() {
	return msgErr;
}
public void setMsgErr(String msgErr) {
	this.msgErr = msgErr;
}
public Facture getFacture() {
	return facture;
}
public void setFacture(Facture facture) {
	this.facture = facture;
}
public String getMotCle() {
	return motCle;
}
public void setMotCle(String motCle) {
	this.motCle = motCle;
}
public List<Facture> getFactures() {
	return factures;
}
public void setFactures(List<Facture> factures) {
	this.factures = factures;
}
}
