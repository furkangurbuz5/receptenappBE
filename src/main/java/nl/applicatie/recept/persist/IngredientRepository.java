package nl.applicatie.recept.persist;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import nl.applicatie.recept.model.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, Long>{
	
	List<Ingredient> findByHalalIsTrue();
	
	List<Ingredient> findByHalalIsFalse();
	
	List<Ingredient> findByHalal(boolean halal);
	
}
