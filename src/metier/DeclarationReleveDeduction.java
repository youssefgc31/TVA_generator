package metier;




import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder= {"identifiantFiscal","annee","periode","regime","releveDeductions"})
public class DeclarationReleveDeduction {
	
	     String identifiantFiscal;
	     int annee;
	     int periode;
	     int regime;
         ReleveDeductions releveDeductions;
        
		public String getIdentifiantFiscal() {
			return identifiantFiscal;
		}
	     public ReleveDeductions getReleveDeductions() {
			return releveDeductions;
		}
	     @XmlElement
		public void setReleveDeductions(ReleveDeductions releveDeductions) {
			this.releveDeductions = releveDeductions;
		}
		@XmlElement
		public void setIdentifiantFiscal(String identifiantFiscal) {
			this.identifiantFiscal = identifiantFiscal;
		}
		public int getAnnee() {
			return annee;
		}
		@XmlElement
		public void setAnnee(int annee) {
			this.annee = annee;
		}
		public int getPeriode() {
			return periode;
		}
		@XmlElement
		public void setPeriode(int periode) {
			this.periode = periode;
		}
		public int getRegime() {
			return regime;
		}
		@XmlElement
		public void setRegime(int regime) {
			this.regime = regime;
		}
		
	    

}
