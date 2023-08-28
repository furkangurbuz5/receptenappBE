package nl.applicatie.recept.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Recepten {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	
	String naam;
	int tijd;
	int aantal;
	String ingredienten;
	String land;
	int calorieen;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	public int getTijd() {
		return tijd;
	}
	public void setTijd(int tijd) {
		this.tijd = tijd;
	}
	public int getAantal() {
		return aantal;
	}
	public void setAantal(int aantal) {
		this.aantal = aantal;
	}
	public String getIngredienten() {
		return ingredienten;
	}
	public void setIngredienten(String ingredienten) {
		this.ingredienten = ingredienten;
	}
	public String getLand() {
		return land;
	}
	public void setLand(String land) {
		this.land = land;
	}
	public int getCalorieen() {
		return calorieen;
	}
	public void setCalorieen(int calorieen) {
		this.calorieen = calorieen;
	}
	
	
}
