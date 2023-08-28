package nl.applicatie.recept.persist;

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
	
}
