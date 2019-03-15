package metier;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
@XmlType(propOrder= {"iff","nom","ice"})
public class Reff {
int iff;
String nom;
int ice;

public int getIff() {
	return iff;
}
@XmlElement
public void setIff(int iff) {
	this.iff = iff;
}

public String getNom() {
	return nom;
}
@XmlElement
public void setNom(String nom) {
	this.nom = nom;
}
public int getIce() {
	return ice;
}
@XmlElement
public void setIce(int ice) {
	this.ice = ice;
}
}
