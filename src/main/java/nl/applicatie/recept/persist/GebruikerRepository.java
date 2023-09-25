package nl.applicatie.recept.persist;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import nl.applicatie.recept.model.Gebruiker;

public interface GebruikerRepository extends CrudRepository<Gebruiker, Long>{

	List<Gebruiker> findByNaamContaining(String naam);

	Optional<Gebruiker> findByEmailAndWachtwoord(String email, String password);

}
