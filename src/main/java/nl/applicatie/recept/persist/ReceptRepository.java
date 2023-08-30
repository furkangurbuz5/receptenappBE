package nl.applicatie.recept.persist;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import nl.applicatie.recept.model.Recept;

@Component
public interface ReceptRepository extends CrudRepository<Recept,Long>{


	

	

}
