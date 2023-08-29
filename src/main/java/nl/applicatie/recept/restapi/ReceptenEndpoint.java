package nl.applicatie.recept.restapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import nl.applicatie.recept.model.Recepten;
import nl.applicatie.recept.persist.ReceptenService;

@RestController
public class ReceptenEndpoint {
	@Autowired
	ReceptenService rs;
	
	@GetMapping("derecepten")
	public Iterable<Recepten>geefAlleRecepten(){
		return rs.geefAlleRecepten();
	}
	
	@PostMapping("voegrecepttoe")
	public void voegReceptToe(@RequestBody Recepten recept) {
		rs.slaReceptOp(recept);
	}
	
}
