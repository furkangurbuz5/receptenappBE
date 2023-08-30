package nl.applicatie.recept.persist;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import nl.applicatie.recept.model.Recepten;

@Component
public interface ReceptenRepository extends CrudRepository<Recepten,Long>{


	

	

}
