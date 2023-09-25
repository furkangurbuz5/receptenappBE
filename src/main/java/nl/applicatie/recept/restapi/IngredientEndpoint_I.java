package nl.applicatie.recept.restapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import nl.applicatie.recept.model.Ingredient_I;
import nl.applicatie.recept.persist.IngredientService_I;

@RestController
public class IngredientEndpoint_I {

	@Autowired
	private IngredientService_I isi;
	//-------------------------------------------------
	@GetMapping("alleingredienten")
	public Iterable<Ingredient_I> haalAlleIngredientenOp() {
		return isi.geefAlleIngredienten();
	}
	//-------------------------------------------------
	@GetMapping("associeer_ingredient_recept/{idingredient}/{idrecept}")
	public void associeerIngredientRecept(@PathVariable("idingredient") int idingredientA, @PathVariable("idrecept") int idreceptA) {
		isi.associeer(idingredientA, idreceptA);
	}
	//-------------------------------------------------

}
