package nl.applicatie.recept.restapi;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import nl.applicatie.recept.model.Recept;
import nl.applicatie.recept.persist.ReceptService;

@RestController
public class ReceptEndpoint {
	@Autowired
	private ReceptService rs;
	
	@GetMapping("derecepten")
	public Iterable<Recept>geefAlleRecepten(){
		return rs.geefAlleRecepten();
	}
	
	@PostMapping("voegrecepttoe")
	public void voegReceptToe(@RequestBody Recept recept) {
		rs.slaReceptOp(recept);
	}
	
	@DeleteMapping("verwijderrecept/{receptid}") 
	public void verwijderRecept(@PathVariable("receptid")int receptid) {
		rs.verwijderRecept(receptid);
	}
	
	@PutMapping("aanpassen/{receptid}/{nieuwenaam}")
	public void aanpassenRecept(@PathVariable("receptid")int receptid,@PathVariable("nieuwenaam")String nieuwenaam, @RequestBody Map<String, String> payload) {
		rs.aanpassen(receptid,nieuwenaam, payload);
		
	}
	
}
