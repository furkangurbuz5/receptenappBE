package nl.applicatie.recept.persist;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import nl.applicatie.recept.model.Categorie;

public interface CategorieRepository extends CrudRepository<Categorie, Long>{

	// Zoeken op naam (Matched de hele naam)
	List<Categorie> findByNaam(String naam);
	
	// Zoekt die op gedeelte van de naam
	List<Categorie> findByNaamContaining(String naam);
	
	int countByNaam(String naam);
	
	int countByNaamContaining(String naam);
	
}
