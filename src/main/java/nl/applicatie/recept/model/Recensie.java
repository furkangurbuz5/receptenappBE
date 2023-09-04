package nl.applicatie.recept.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Recensie {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String naam;
	private String titel;
	private String bericht;
	private float beoordeling;
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitel() {
		return titel;
	}
	public void setTitel(String titel) {
		this.titel = titel;
	}
	public String getBericht() {
		return bericht;
	}
	public void setBericht(String bericht) {
		this.bericht = bericht;
	}
	public float getBeoordeling() {
		return beoordeling;
	}
	public void setBeoordeling(float beoordeling) {
		this.beoordeling = beoordeling;
	}
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	
	
}
