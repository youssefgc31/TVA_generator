package metier;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;



		public class ReleveDeductions {

	List<Rd> rd= new ArrayList<Rd>();

	public List<Rd> getRd() {
		return rd;
	}
 @XmlElement
	public void setRd(List<Rd> factures) {
		this.rd = factures;
	}
	
}
