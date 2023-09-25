package nl.applicatie.recept.restapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import nl.applicatie.recept.model.Recept_I;
import nl.applicatie.recept.persist.ReceptService_I;

@RestController
public class ReceptEndpoint_I {

	@Autowired
	private ReceptService_I rs_i;
	//-------------------------------------------------
	@GetMapping("allerecepten")
	public Iterable <Recept_I> alleRecepten() {		
		return rs_i.geefAlleRecepten();
	}
	//-------------------------------------------------
}
