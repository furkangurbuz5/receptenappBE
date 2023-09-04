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

import nl.applicatie.recept.model.Kookgerei;
import nl.applicatie.recept.persist.KookgereiService;

//dit is de controller 

@RestController
public class KookgereiEndpoint {
	
	@Autowired
	private KookgereiService ks;
	
	//get
	@GetMapping("allekookgerei")
	public Iterable<Kookgerei> alleKookgerei() {
		//System.out.println("Alle kookgerei getoond");
		return ks.geefAlleKookgerei();
	}
	
	//post 
	@PostMapping("voegkookgereitoe")
	public void voegMethode(@RequestBody Kookgerei kookgerei) {
		System.out.println("Kookgerei aangemaakt in DB");
		ks.slaKookgereiOp(kookgerei);
	}
	
	//delete
	@DeleteMapping("verwijderkookgerei/{kookgereiID}")
	public void verwijderKookgerei(@PathVariable("kookgereiID")int kookgereiid) {
		ks.verwijderKookgerei(kookgereiid);
	}
	
	
	
	@PutMapping("aanpassen/{kookgereiID}/{nieuwe_naam}")
	public void aanpassenKookgerei(@PathVariable("kookgereiID")int kookgereiid, @PathVariable("nieuwe_naam")String nieuwe_naam) {
		ks.aanpassen(kookgereiid, nieuwe_naam);
	}
	
	@GetMapping("zoeknaam/{naam}")
	public List<Kookgerei> zoekKookgereiNaam(@PathVariable("naam")String naam){
		return ks.zoekOpNaam(naam);
	}
	
	@GetMapping("zoekprijs/{prijs}")
	public List<Kookgerei> zoekKookgereiPrijs(@PathVariable("prijs")double prijs){
		return ks.zoekOpPrijs(prijs);
	}
	

	
}










