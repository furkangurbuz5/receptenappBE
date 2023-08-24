package nl.applicatie.recept.persist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.applicatie.recept.model.Kookgerei;

@Service
public class KookgereiService {
	
	@Autowired
	private KookgereiRepository kr;
	
	
	
	public void slaKookgereiOp() {
		kr.save(new Kookgerei());
	}
	
	public Iterable<Kookgerei> geefAlleKookgerei() {
		return kr.findAll();
	}
	
}
