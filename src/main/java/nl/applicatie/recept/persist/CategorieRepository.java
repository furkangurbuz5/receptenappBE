package nl.applicatie.recept.persist;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import nl.applicatie.recept.model.Categorie;

public interface CategorieRepository extends CrudRepository<Categorie, Long>{
	
	// Zoeken op naam (matches hele naam)
	List<Categorie> findByNaam(String naam);
	
	// Zoeken op gedeelte van naam
	List<Categorie> findByNaamContaining(String naam);
	
	int countByNaam(String naam);
	
	int countByNaamContaining(String naam);
	
}
