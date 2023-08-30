package nl.applicatie.recept.persist;

import org.springframework.data.repository.CrudRepository;

import nl.applicatie.recept.model.Kookgerei;



public interface KookgereiRepository extends CrudRepository<Kookgerei, Long>{
	
}
