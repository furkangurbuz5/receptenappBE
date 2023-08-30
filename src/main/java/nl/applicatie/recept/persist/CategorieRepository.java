package nl.applicatie.recept.persist;

import org.springframework.data.repository.CrudRepository;

import nl.applicatie.recept.model.Categorie;

public interface CategorieRepository extends CrudRepository<Categorie, Long>{

}
