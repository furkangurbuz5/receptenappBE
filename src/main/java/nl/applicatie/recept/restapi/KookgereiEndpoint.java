package nl.applicatie.recept.restapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import nl.applicatie.recept.model.Kookgerei;
import nl.applicatie.recept.persist.KookgereiService;

//dit is de controller 

@RestController
public class KookgereiEndpoint {
	
	@Autowired
	private KookgereiService kgs;
	
	@GetMapping("/voegkookgereitoe")
	public void testMethode() {
		System.out.println("Object aangemaakt in DB");
		kgs.slaKookgereiOp();
	}
	
	@GetMapping("/allekookgerei")
	public Iterable<Kookgerei> alleKookgerei() {
		System.out.println("Alle kookgerei getoond");
		return kgs.geefAlleKookgerei();
	}
	
	@GetMapping("/slaop")
	public void opslaanMethode() {
		System.out.println("Object aangemaakt in DB");
		kgs.slaKookgereiOp();
	}
	
	
	
	
}