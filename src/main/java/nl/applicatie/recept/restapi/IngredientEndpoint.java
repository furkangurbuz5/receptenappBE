package nl.applicatie.recept.restapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import nl.applicatie.recept.model.Ingredient;
import nl.applicatie.recept.persist.IngredientService;

//dit is de controller 

@RestController
public class IngredientEndpoint {
	
	@Autowired
	private IngredientService is;
	
	//get
	@GetMapping("alleingredient")
	public Iterable<Ingredient> alleIngredient() {
		return is.geefAlleIngredient();
	}
	
	//post 
	@PostMapping("voegingredienttoe")
	public void voegMethode(@RequestBody Ingredient ingredient) {
		System.out.println("Ingredient aangemaakt in DB");
		is.slaIngredientOp(ingredient);
	}
	
	//delete
	@DeleteMapping("verwijderingredient/{id}")
	public void verwijderIngredient(@PathVariable("id")int id) {
		is.verwijderIngredient(id);
	}
}










