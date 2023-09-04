package nl.applicatie.recept.persist;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import nl.applicatie.recept.model.Gebruiker;

public interface GebruikerRepository extends CrudRepository<Gebruiker, Long>{

	List<Gebruiker> findByNaamContaining(String naam);
	

}
