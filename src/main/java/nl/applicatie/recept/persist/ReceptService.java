package nl.applicatie.recept.persist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.applicatie.recept.model.Recept;

@Service
public class ReceptService {
	@Autowired
	private ReceptRepository re;
	
	public Iterable<Recept> geefAlleRecepten() {
		return re.findAll();
	}
	
	public void verwijderRecept(long receptid) {
		re.deleteById(receptid);
	}
	public void slaReceptOp(Recept recept) {
		re.save(recept);
	}
}
