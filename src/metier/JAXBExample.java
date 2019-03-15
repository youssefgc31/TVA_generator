package metier;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import java.util.ArrayList;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class JAXBExample {
	public static void main(String[] args) {

		
     DeclarationReleveDeduction declarationReleveDeduction =new DeclarationReleveDeduction();
     ReleveDeductions relevedeductions= new ReleveDeductions();
     ArrayList<Rd> rds= new ArrayList<Rd> ();
     relevedeductions.setRd(rds);
      
      Rd rd=new Rd();
      Rd rd2=new Rd();
      Reff reff=new Reff();
      Mp mp=new Mp();
      Date date=new Date();
      
      SimpleDateFormat formater =new SimpleDateFormat("yy-MM-dd");
      try {
		date=formater.parse("12-12-2010");
	} catch (ParseException e1) {
		
		e1.printStackTrace();
	}
     // formater.format(date);
      
      
      declarationReleveDeduction.setAnnee(2103);
      declarationReleveDeduction.setPeriode(1);
      declarationReleveDeduction.setRegime(12);
      declarationReleveDeduction.setReleveDeductions(relevedeductions);
      rds.add(rd);
      rds.add(rd2);
      //  declarationReleveDeduction.setIdentifiantFiscal("gg");

      
      rd.setOrd(3);
      rd.setNum(12);
      rd.setDes("des");
      rd.setMht(12);
      rd.setTva(20);
      rd.setTtc(123);
      rd.setReff(reff);
      reff.setIff(123);
      reff.setNom("ONE");
      reff.setIce(13);
      rd.setTx(12);
      rd.setMp(mp);
      mp.setId(13);
      rd.setDate(date);
	  
      rd2.setOrd(3);
      rd2.setNum(12);
      rd2.setDes("des");
      rd2.setMht(12);
      rd2.setTva(20);
      rd2.setTtc(123);
      rd2.setReff(reff);
      reff.setIff(123);
      reff.setNom("ONE");
      reff.setIce(13);
      rd2.setTx(12);
      rd2.setMp(mp);
      mp.setId(13);
      rd2.setDate(date);

	  try {

		File file = new File("simple_tva.xml");
		JAXBContext jaxbContext = JAXBContext.newInstance(DeclarationReleveDeduction.class);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

		// output pretty printed
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		jaxbMarshaller.marshal(declarationReleveDeduction, file);
		jaxbMarshaller.marshal(declarationReleveDeduction, System.out);

	      } catch (JAXBException ex) {
		ex.printStackTrace();
	      }

	}
}