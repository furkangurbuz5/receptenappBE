package nl.applicatie.recept.persist;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.applicatie.recept.model.Gebruiker;

@Service
public class GebruikerService {

	@Autowired
	private GebruikerRepository gr; 
	
	public void slaGebruikerOp(Gebruiker gebruiker) {
		gr.save(gebruiker);
	}
	
	public Iterable<Gebruiker> geefAlleGebruiker() {
		return gr.findAll();
	}

	public void verwijderGebruiker(long gebruikerid) {
		gr.deleteById(gebruikerid);
	}

	public void aanpassen(long gebruikerid, String nieuwe_naam) {
		Gebruiker Temp = gr.findById(gebruikerid).get();
		Temp.setNaam(nieuwe_naam);
		gr.save(Temp);
	}

	public List<Gebruiker> zoekOpNaam(String naam) {
		return gr.findByNaamContaining(naam);
	}

	public Optional<Gebruiker> findByEmailAndWachtwoord(String email, String password) {
		return gr.findByEmailAndWachtwoord(email, password);
	}
	
}
