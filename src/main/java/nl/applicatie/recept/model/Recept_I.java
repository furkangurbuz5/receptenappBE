package nl.applicatie.recept.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import Enum.category;

@Entity
public class Recept_I {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String naam;
	private int tijd;
	private int aantal;
	private String ingredienten;
	private String bereiding;
	private String land;
	//@Enumerated(EnumType.STRING)
	//private category categorieen;
	private int calorieen;
	@ManyToMany
	private List<Ingredient_I> ingredient_i;
	//-------------------------------------------------
	public List<Ingredient_I> getIngredient_i() {
		return ingredient_i;
	}
	//-------------------------------------------------
	public void setIngredient_i(List<Ingredient_I> ingredient_i) {
		this.ingredient_i = ingredient_i;
	}
	//-------------------------------------------------
	public Long getId() {
		return id;
	}
	//-------------------------------------------------
	public void setId(Long id) {
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
	public int getTijd() {
		return tijd;
	}
	//-------------------------------------------------
	public void setTijd(int tijd) {
		this.tijd = tijd;
	}
	//-------------------------------------------------
	public int getAantal() {
		return aantal;
	}
	//-------------------------------------------------
	public void setAantal(int aantal) {
		this.aantal = aantal;
	}
	//-------------------------------------------------
	public String getIngredienten() {
		return ingredienten;
	}
	//-------------------------------------------------
	public void setIngredienten(String ingredienten) {
		this.ingredienten = ingredienten;
	}
	//-------------------------------------------------
	public String getBereiding() {
		return bereiding;
	}
	//-------------------------------------------------
	public void setBereiding(String bereiding) {
		this.bereiding = bereiding;
	}
	//-------------------------------------------------
	public String getLand() {
		return land;
	}
	//-------------------------------------------------
	public void setLand(String land) {
		this.land = land;
	}
	//-------------------------------------------------
	/*
	public category getCategorieen() {
		return categorieen;
	}
	//-------------------------------------------------
	public void setCategorieen(category categorieen) {
		this.categorieen = categorieen;
	}
	*/
	//-------------------------------------------------
	public int getCalorieen() {
		return calorieen;
	}
	//-------------------------------------------------
	public void setCalorieen(int calorieen) {
		this.calorieen = calorieen;
	}
	//------------------------------------------------	
}
