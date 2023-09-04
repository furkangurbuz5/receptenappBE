package nl.applicatie.recept.restapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import nl.applicatie.recept.model.Recensie;
import nl.applicatie.recept.persist.RecensieService;

@RestController
public class RecensieEndpoint {

	@Autowired
	private RecensieService rs;
	
	
	//get
	@GetMapping("allerecensie")
	public Iterable<Recensie> alleRecensie() {
		return rs.geefAlleRecensie();
	}
	
	//post 
	@PostMapping("voegrecensietoe")
	public void voegMethode(@RequestBody Recensie recensie) {
		System.out.println("Recensie aangemaakt in DB");
		rs.slaRecensieOp(recensie);
	}
	
	//delete
	@DeleteMapping("verwijderrecensie/{recensieID}")
	public void verwijderRecensie(@PathVariable("recensieID")int recensieid) {
		rs.verwijderRecensie(recensieid);
	}
	
	
	@PutMapping("aanpassen/{recensieID}/{nieuwe_beoordeling}")
	public void aanpassenRecensie(@PathVariable("recensieID")int recensieid, @PathVariable("nieuwe_beoordeling")float nieuwe_recensie) {
		rs.aanpassen(recensieid, nieuwe_recensie);
	}
	
	@GetMapping("zoekrecensienaam/{naam}")
	public List<Recensie> zoekRecensieNaam(@PathVariable("naam")String naam){
		return rs.zoekOpNaam(naam);
	}
	
}
