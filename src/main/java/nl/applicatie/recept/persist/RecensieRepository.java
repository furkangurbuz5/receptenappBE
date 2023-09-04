package nl.applicatie.recept.persist;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import nl.applicatie.recept.model.Recensie;

public interface RecensieRepository extends CrudRepository<Recensie, Long> {

	List<Recensie> findByNaamContaining(String naam);
	

	
}
