package nl.applicatie.recept.persist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.applicatie.recept.model.Ingredient_I;
import nl.applicatie.recept.model.Recept_I;

@Service
public class IngredientService_I {
	@Autowired
	private IngredientRepository_I iri;
	@Autowired
	private ReceptRepository_I rri;
	//-------------------------------------------------
	public void slaIngredientOp(Ingredient_I ingredient_i) {
		iri.save(ingredient_i);
	}
	//-------------------------------------------------
	public Iterable<Ingredient_I> geefAlleIngredienten() {
		return iri.findAll();
	}
	//-------------------------------------------------
	public void associeer(long idingredientA, long idreceptA) {
		Recept_I r = rri.findById(idreceptA).get();
		Ingredient_I i = iri.findById(idingredientA).get();
		r.getIngredient_i().add(i);
		rri.save(r);
		//Recept_I t = rri.save(r);
	}
	//-------------------------------------------------
}
