package metier;


import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder= {"ord","num","des","mht","tva","ttc","reff","tx","mp","date"})
public class Rd {
	

	int ord;
	int num;
	String des;
	float mht;float tva;
	float ttc;
	Reff reff;
	float tx;
	Mp mp;
	
	Date date;
	public int getOrd() {
		return ord;
	}@XmlElement
	public void setOrd(int ord) {
		this.ord = ord;
	}
	public int getNum() {
		return num;
	}@XmlElement
	public void setNum(int num) {
		this.num = num;
	}
	
	public String getDes() {
		return des;
	}@XmlElement
	public void setDes(String des) {
		this.des = des;
	}
	public float getMht() {
		return mht;
	}@XmlElement
	public void setMht(float mht) {
		this.mht = mht;
	}
	public float getTva() {
		return tva;
	}@XmlElement
	public void setTva(float tva) {
		this.tva = tva;
	}
	public float getTtc() {
		return ttc;
	}@XmlElement
	public void setTtc(float ttc) {
		this.ttc = ttc;
	}
	public Reff getReff() {
		return reff;
	}@XmlElement
	public void setReff(Reff reff) {
		this.reff = reff;
	}
	public float getTx() {
		return tx;
	}@XmlElement
	public void setTx(float tx) {
		this.tx = tx;
	}
	
	public Mp getMp() {
		return mp;
	}
	@XmlElement
	public void setMp(Mp mp) {
		this.mp = mp;
	}
	public Date getDate() {
		return date;
	}
	@XmlElement
	public void setDate(Date date) {
		this.date = date;
	}
	

}
