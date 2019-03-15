package metier;

import javax.xml.bind.annotation.XmlElement;

public class Mp {
int id;

public int getId() {
	return id;
}
@XmlElement
public void setId(int id) {
	this.id = id;
}
}
