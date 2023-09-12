package nl.applicatie.recept.persist;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import Enum.category;
import nl.applicatie.recept.model.Recept;


public interface ReceptRepository extends CrudRepository<Recept,Long>{

	List<Recept> findByNaamContaining(String naam);
	List<Recept> findByTijdLessThan(int tijd);
	List<Recept> findByCategorieen(category categorie);
	List<Recept> findByLand(String land);
	List<Recept> findByAantal(int aantal);
	List<Recept> findByTijdLessThanAndCategorieenAndLandAndAantal(int tijd, category categorie, String land, int aantal);
	List<Recept> findByCategorieenAndAantal(category categorie, int aantal);
	List<Recept> findByCategorieenAndLand(category categorie, String land);
	List<Recept> findByCategorieenAndTijdLessThan(category categorie, int tijd);
	List<Recept> findByLandAndAantal(String land, int aantal);
	List<Recept> findByTijdLessThanAndAantal(int tijd, int aantal);
	List<Recept> findByLandAndTijdLessThan(String land, int tijd);
	List<Recept> findByCategorieenAndAantalAndLand(category categorie, int aantal, String land);
	List<Recept> findByCategorieenAndAantalAndTijdLessThan(category categorie, int aantal, int tijd);
	List<Recept> findByCategorieenAndLandAndTijdLessThan(category categorie, String land, int tijd);
	List<Recept> findByAantalAndLandAndTijdLessThan(int aantal, String land, int tijd);

	

	

}
