package nl.applicatie.recept.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Recept {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String naam;
	private int tijd;
	private int aantal;
	private String ingredienten;
	private String bereiding;
	private String land;
	private int calorieen;
	
	@ManyToOne(optional = false)
	private Categorie categorie;

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
	public String getBereiding() {
		return bereiding;
	}
	public void setBereiding(String bereiding) {
		this.bereiding = bereiding;
	}
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
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
