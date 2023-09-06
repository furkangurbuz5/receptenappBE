package nl.applicatie.recept.persist;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import nl.applicatie.recept.model.Recept;


public interface ReceptRepository extends CrudRepository<Recept,Long>{

	List<Recept> findByNaamContaining(String naam);
	List<Recept> findByTijd(int tijd);

	

	

}
