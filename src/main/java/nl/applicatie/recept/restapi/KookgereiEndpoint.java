package nl.applicatie.recept.restapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import nl.applicatie.recept.model.Kookgerei;
import nl.applicatie.recept.persist.KookgereiService;

//dit is de controller 

@RestController
public class KookgereiEndpoint {
	
	@Autowired
	private KookgereiService kgs;
	
	//get
	@GetMapping("allekookgerei")
	public Iterable<Kookgerei> alleKookgerei() {
		//System.out.println("Alle kookgerei getoond");
		return kgs.geefAlleKookgerei();
	}
	
	//post 
	@PostMapping("voegkookgereitoe")
	public void voegMethode(@RequestBody Kookgerei kookgerei) {
		System.out.println("Kookgerei aangemaakt in DB");
		kgs.slaKookgereiOp(kookgerei);
	}
	
	//delete
	@DeleteMapping("verwijderkookgerei/{kookgereiID}")
	public void verwijderKookgerei(@PathVariable("kookgereiID")int kookgereiid) {
		kgs.verwijderKookgerei(kookgereiid);
	}
}