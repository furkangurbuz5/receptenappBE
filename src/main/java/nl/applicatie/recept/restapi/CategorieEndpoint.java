package nl.applicatie.recept.restapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import nl.applicatie.recept.model.Categorie;
import nl.applicatie.recept.persist.CategorieService;

@RestController
public class CategorieEndpoint {
	@Autowired
	CategorieService cs;
	
	@GetMapping("toonallecategorie")
	public Iterable<Categorie> toonAlleCategorie() {
		return cs.geefAlleCategorie();
	}
	
	@GetMapping("zoekopcategorie/{categorie}")
	public Iterable<Categorie> zoekOpCategorie(@PathVariable("categorie")String categorie){
		return cs.zoekOpCategorie(categorie);
	}

	@PostMapping("voegcategorietoe")
	public void voegCategorie(@RequestBody Categorie categorie) {
		cs.slaCategorieOp(categorie);
	}
	
	@DeleteMapping("verwijdercategorie/{id}")
	public void verwijderCategorie(@PathVariable("id")int id) {
		cs.verwijderCategorie(id);
	}

}
