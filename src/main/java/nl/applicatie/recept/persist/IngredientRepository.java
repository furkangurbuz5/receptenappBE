package nl.applicatie.recept.persist;

import org.springframework.data.repository.CrudRepository;

import nl.applicatie.recept.model.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, Long>{
	
}
