package nl.applicatie.recept.persist;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.applicatie.recept.model.Recensie;

@Service
public class RecensieService {

	@Autowired
	private RecensieRepository rr; 
	
	public void slaRecensieOp(Recensie recensie) {
		rr.save(recensie);
	}
	
	public Iterable<Recensie> geefAlleRecensie() {
		return rr.findAll();
	}

	public void verwijderRecensie(long recensieid) {
		rr.deleteById(recensieid);
	}

	public void aanpassen(long recensieid, float nieuwe_beoordeling) {
		Recensie Temp = rr.findById(recensieid).get();
		Temp.setBeoordeling(nieuwe_beoordeling);
		rr.save(Temp);
	}

	public List<Recensie> zoekOpNaam(String naam) {
		return rr.findByNaamContaining(naam);
	}
	
}
