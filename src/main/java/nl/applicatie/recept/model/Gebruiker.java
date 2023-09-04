package nl.applicatie.recept.model;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Gebruiker {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id; 
	
	private String naam;
	private String geboorteDatum;
	private String adresGegevens;
	private String eMail;
	private ArrayList<String> favoriet;
	private String nummer;
	
	
	
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	public String getGeboorteDatum() {
		return geboorteDatum;
	}
	public void setGeboorteDatum(String geboorteDatum) {
		this.geboorteDatum = geboorteDatum;
	}
	public String getAdresGegevens() {
		return adresGegevens;
	}
	public void setAdresGegevens(String adresGegevens) {
		this.adresGegevens = adresGegevens;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public ArrayList<String> getFavoriet() {
		return favoriet;
	}
	public void setFavoriet(ArrayList<String> favoriet) {
		this.favoriet = favoriet;
	}
	public String getNummer() {
		return nummer;
	}
	public void setNummer(String nummer) {
		this.nummer = nummer;
	}
	
	
}
