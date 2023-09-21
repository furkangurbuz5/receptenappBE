package nl.applicatie.recept.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Ingredient_I {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id; 
	
	private String naam;
	private String voedingswaarde;
	private String eenheid;
	private String allergeen;
	private boolean halal;

	//-------------------------------------------------
	public long getId() {
		return id;
	}
	//-------------------------------------------------
	public void setId(long id) {
		this.id = id;
	}
	//-------------------------------------------------
	public String getNaam() {
		return naam;
	}
	//-------------------------------------------------
	public void setNaam(String naam) {
		this.naam = naam;
	}
	//-------------------------------------------------
	public String getVoedingswaarde() {
		return voedingswaarde;
	}
	//-------------------------------------------------
	public void setVoedingswaarde(String voedingswaarde) {
		this.voedingswaarde = voedingswaarde;
	}
	//-------------------------------------------------
	public String getEenheid() {
		return eenheid;
	}
	//-------------------------------------------------
	public void setEenheid(String eenheid) {
		this.eenheid = eenheid;
	}
	//-------------------------------------------------
	public String getAllergeen() {
		return allergeen;
	}
	//-------------------------------------------------
	public void setAllergeen(String allergeen) {
		this.allergeen = allergeen;
	}
	//-------------------------------------------------
	public boolean isHalal() {
		return halal;
	}
	//-------------------------------------------------
	public void setHalal(boolean halal) {
		this.halal = halal;
	}
	//-------------------------------------------------
}
