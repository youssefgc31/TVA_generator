package metier;

import java.io.Serializable;
import java.sql.Date;

public class Facture implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	public Facture(int ordre, int num_facture, String designation, float mht, float tva, float ttc, float tax,
			int id_paiment, String iff, Date dTAE_PAIMENT, Date dAT_FACTURE) {
		super();
		this.id_paiment = id_paiment;
		this.date_pai = dTAE_PAIMENT;
		this.date_fac = dAT_FACTURE;
		this.facture_id = idfacture++;
		this.ordre = ordre;
		this.num_facture = num_facture;
		this.designation = designation;
		this.mht = mht;
		this.tva = tva;
		this.ttc = ttc;
		this.tax = tax;
		this.iff = iff;
	}


	public int getId_paiment() {
		return id_paiment;
	}

	public void setId_paiment(int id_paiment) {
		this.id_paiment = id_paiment;
	}

	
	public Date getDate_pai() {
		return date_pai;
	}


	public void setDate_pai(Date date_pai) {
		this.date_pai = date_pai;
	}


	public Date getDate_fac() {
		return date_fac;
	}


	public void setDate_fac(Date date_fac) {
		this.date_fac = date_fac;
	}


	public int getFacture_id() {
		return facture_id;
	}

	public void setFacture_id(int facture_id) {
		this.facture_id = facture_id;
	}

	public int getOrdre() {
		return ordre;
	}

	public void setOrdre(int ordre) {
		this.ordre = ordre;
	}

	public int getNum_facture() {
		return num_facture;
	}

	public void setNum_facture(int num_facture) {
		this.num_facture = num_facture;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public float getMht() {
		return mht;
	}

	public void setMht(float mht) {
		this.mht = mht;
	}

	public float getTva() {
		return tva;
	}

	public void setTva(float tva) {
		this.tva = tva;
	}

	public float getTtc() {
		return ttc;
	}

	public void setTtc(float ttc) {
		this.ttc = ttc;
	}

	public float getTax() {
		return tax;
	}

	public void setTax(float tax) {
		this.tax = tax;
	}


	public String getIff() {
		return iff;
	}

	public void setIff(String iff) {
		this.iff = iff;
	}

	public Facture() {
		super();
	}
	protected String designation;
	protected float mht;
	protected float tva;
	protected float ttc;
	protected float tax;
	protected int id_paiment;
	protected Date date_pai;
	protected Date date_fac;
	protected int facture_id;
	protected static int idfacture;
	protected int ordre;
	protected int num_facture;
	protected String iff;
}
