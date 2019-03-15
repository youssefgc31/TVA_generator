package metier;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class WriteXMLFile {

    public static void main(String[] args) {

      try {

        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

        // root elements
        Document doc = docBuilder.newDocument();
        Element rootElement = doc.createElement("DeclarationReleveDeduction");
        doc.appendChild(rootElement);

        // staff elements
        Element identifiantFiscal = doc.createElement("identifiantFiscal");
        rootElement.appendChild(identifiantFiscal);
        
        Element annee = doc.createElement("annee");
        rootElement.appendChild(annee);
        
        Element periode = doc.createElement("periode");
        rootElement.appendChild(periode);
        
        Element regime= doc.createElement("regime");
        rootElement.appendChild(regime);
        
        Element releveDeductions =doc.createElement("releveDeductions");
        rootElement.appendChild(releveDeductions);
        
        //annee.appendChild(doc.createTextNode("yong"));
        
        
       
        Element rd = doc.createElement("rd");
        releveDeductions.appendChild(rd);
        
        Element ord= doc.createElement("ord");
        rd.appendChild(ord);
        Element num= doc.createElement("num");
        rd.appendChild(num);
        Element des= doc.createElement("des");
        rd.appendChild(des);
        Element mht= doc.createElement("mht");
        rd.appendChild(mht);
        Element tva= doc.createElement("tva");
        rd.appendChild(tva);
        Element ttc= doc.createElement("ttc");
        rd.appendChild(ttc);
        
        Element reff= doc.createElement("reff");
        rd.appendChild(reff);
        
        Element iff= doc.createElement("if");
        reff.appendChild(iff);
        Element nom= doc.createElement("nom");
        reff.appendChild(nom);
        Element ice= doc.createElement("ice");
        reff.appendChild(ice);
        
        Element tx= doc.createElement("tx");
        rd.appendChild(tx);
        
        Element mp= doc.createElement("mp");
        rd.appendChild(mp);
        
        Element dpai= doc.createElement("dpai");
        mp.appendChild(dpai);
        Element dfac= doc.createElement("dfac");
        mp.appendChild(dfac);
       

        // write the content into xml file
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File("/Users/mac/desktop/myfile.xml"));

        // Output to console for testing
        // StreamResult result = new StreamResult(System.out);

        transformer.transform(source, result);

        System.out.println("File saved!");

      } catch (ParserConfigurationException pce) {
        pce.printStackTrace();
      } catch (TransformerException tfe) {
        tfe.printStackTrace();
      }
    }
}