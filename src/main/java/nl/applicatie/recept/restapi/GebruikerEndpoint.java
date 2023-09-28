package nl.applicatie.recept.restapi;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import nl.applicatie.recept.dto.LoginRequestDto;
import nl.applicatie.recept.model.Gebruiker;
import nl.applicatie.recept.persist.GebruikerService;

@RestController
public class GebruikerEndpoint {

	
	@Autowired
	private GebruikerService gs;
	

	//get
	@GetMapping("allegebruiker")
	public Iterable<Gebruiker> alleGebruiker() {
		//System.out.println("Alle kookgerei getoond");
		return gs.geefAlleGebruiker();
	}
	
	//post 
	@PostMapping("voeggebruikertoe")
	public void voegMethode(@RequestBody Gebruiker gebruiker) {
		System.out.println("Gebruiker aangemaakt in DB");
		System.out.println(gebruiker.getWachtwoord());
		gs.slaGebruikerOp(gebruiker);
	}
	
	//delete
	@DeleteMapping("verwijdergebruiker/{gebruikerID}")
	public void verwijderGebruiker(@PathVariable("gebruikerID")int gebruikerid) {
		gs.verwijderGebruiker(gebruikerid);
	}
	
	@PutMapping("aanpassen/{gebruikerID}/{nieuwe_naam}")
	public void aanpassenGebruiker(@PathVariable("kookgereiID")int gebruikerid, @PathVariable("nieuwe_naam")String nieuwe_naam) {
		gs.aanpassen(gebruikerid, nieuwe_naam);
	}

	@GetMapping("zoekgebruikernaam/{naam}")
	public List<Gebruiker> zoekGebruikerNaam(@PathVariable("naam")String naam){
		return gs.zoekOpNaam(naam);
	}

	@PostMapping("gebruiker/login")
	public boolean login(@RequestBody LoginRequestDto dto ) {
		if (dto.getEmail() == null || dto.getEmail().isBlank())
			return false;

		if (dto.getPassword() == null || dto.getPassword().isBlank())
			return false;

		Optional<Gebruiker> optional = gs.findByEmailAndWachtwoord(dto.getEmail(), dto.getPassword());
		if (optional.isEmpty()) {
			return false;
		}

		return true;
	}

}
