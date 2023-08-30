package nl.applicatie.recept.persist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.applicatie.recept.model.Ingredient;

@Service
public class IngredientService {
	
	@Autowired
	private IngredientRepository ir;
	
	public void slaIngredientOp(Ingredient ingredient) {
		ir.save(ingredient);
	}
	
	public Iterable<Ingredient> geefAlleIngredient() {
		return ir.findAll();
	}

	public void verwijderIngredient(long id) {
		ir.deleteById(id);
	}
	
}
