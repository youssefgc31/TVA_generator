package metier;

public class Contribuable {
private int Id_Contribuable;
private static int ContribuableId;
private String IF;
private String user;
private int annee;
private int regime;
private int periode;
public int getAnnee() {
	return annee;
}
public void setAnnee(int annee) {
	this.annee = annee;
}
public int getRegime() {
	return regime;
}
public void setRegime(int regime) {
	this.regime = regime;
}
public int getPeriode() {
	return periode;
}
public void setPeriode(int periode) {
	this.periode = periode;
}
public String getUser() {
	return user;
}
public void setUser(String user) {
	this.user = user;
}
public int getId_Contribuable() {
	return Id_Contribuable;
}
public void setId_Contribuable(int id_Contribuable) {
	Id_Contribuable = id_Contribuable;
}
public static int getContribuableId() {
	return ContribuableId;
}
public static void setContribuableId(int contribuableId) {
	ContribuableId = contribuableId;
}
public String getIF() {
	return IF;
}
public void setIF(String iF) {
	IF = iF;
}
}
