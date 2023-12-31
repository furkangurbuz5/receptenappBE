package nl.applicatie.recept.persist;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.applicatie.recept.model.Kookgerei;

@Service
public class KookgereiService {
	
	@Autowired
	private KookgereiRepository kr;
	
	public void slaKookgereiOp(Kookgerei kookgerei) {
		kr.save(kookgerei);
	}
	
	public Iterable<Kookgerei> geefAlleKookgerei() {
		return kr.findAll();
	}

	public void verwijderKookgerei(long kookgereiid) {
		kr.deleteById(kookgereiid);
	}

	public void aanpassen(long kookgereiid, String nieuwe_naam, Map<String,String> payload) {
		Kookgerei Temp = kr.findById(kookgereiid).get();
		Temp.setNaam(nieuwe_naam);
		Temp.setMateriaal(payload.get("nieuwe_materiaal"));
		Temp.setPrijs(Double.parseDouble(payload.get("nieuwe_prijs")));
		Temp.setType(payload.get("nieuwe_type"));
		Temp.setWebshopLink(payload.get("nieuwe_webshoplink"));
	
		kr.save(Temp);
	}

	public List<Kookgerei> zoekOpNaam(String naam) {
		return kr.findByNaamContaining(naam);
	}

	public List<Kookgerei> zoekOpPrijs(double prijs) {
		return kr.findByPrijs(prijs);
	}
	
	public List<Kookgerei> listPrijs(double prijs){
		return kr.zoekPrijs(prijs);
	}
	
}
