package nl.applicatie.recept.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Kookgerei {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	//rijen
	private long kookgereiID;
	
	//kolommen 
	private String webshopLink;
	private String type;
	private String naam;
	private String materiaal;
	private double prijs;
	
	/* types:
	Bestek:
		Vorken.
		Lepels.
	Pannen.
	Messen.
	Serveertangen.
	Snijbladen / planken.
	Opschep lepels.
	Zeven.
	Gardes.  
	 */
	
	//Getters en setters
	public long getKookgereiID() {
		return kookgereiID;
	}
	public void setKookgereiID(long kookgereiID) {
		this.kookgereiID = kookgereiID;
	}
	public String getWebshopLink() {
		return webshopLink;
	}
	public void setWebshopLink(String webshopLink) {
		this.webshopLink = webshopLink;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	public String getMateriaal() {
		return materiaal;
	}
	public void setMateriaal(String materiaal) {
		this.materiaal = materiaal;
	}
	public double getPrijs() {
		return prijs;
	}
	public void setPrijs(double prijs) {
		this.prijs = prijs;
	}
	
	
	
	
	
}
