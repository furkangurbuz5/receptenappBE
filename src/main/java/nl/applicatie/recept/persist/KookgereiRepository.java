package nl.applicatie.recept.persist;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import nl.applicatie.recept.model.Kookgerei;

@Component
public interface KookgereiRepository extends CrudRepository<Kookgerei, Long>{
	
}
