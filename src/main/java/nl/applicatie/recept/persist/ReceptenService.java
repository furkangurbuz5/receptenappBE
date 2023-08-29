package nl.applicatie.recept.persist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.applicatie.recept.model.Recepten;

@Service
public class ReceptenService {
	@Autowired
	ReceptenRepository re;
	
	public Iterable<Recepten> geefAlleRecepten() {
		return re.findAll();
	}
	
	public void verwijderRecept(long receptid) {
		re.deleteById(receptid);
	}
	public void slaReceptOp(Recepten recept) {
		re.save(recept);
	}
}
