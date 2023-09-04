package nl.applicatie.recept.persist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.applicatie.recept.model.Categorie;

@Service
public class CategorieService {

	@Autowired
	private CategorieRepository cr;
	
	public void slaCategorieOp(Categorie categorie) {
		cr.save(categorie);
	}
	
	public Iterable<Categorie> geefAlleCategorie() {
		return cr.findAll();
	}
	
	public void verwijderCategorie(long id) {
		cr.deleteById(id);
	}
	
	public Iterable<Categorie> zoekOpCategorie(String categorie) {
		return cr.findByNaam(categorie);
	}
}
