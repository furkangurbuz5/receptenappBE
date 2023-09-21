package nl.applicatie.recept.persist;

import java.util.Map;
import java.util.Optional;
import java.util.List;

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

	public void aanpassen(int receptid, String nieuwenaam, Map<String, String> payload) {
		Recept Temp = re.findById(Integer.toUnsignedLong(receptid)).get();
		Temp.setNaam(nieuwenaam);
		Temp.setAantal(Integer.parseInt(payload.get("aantal")));
		Temp.setCalorieen(Integer.parseInt(payload.get("calorieen")));
		Temp.setIngredienten(payload.get("ingredienten"));
		Temp.setBereiding(payload.get("bereiding"));
		Temp.setLand(payload.get("land"));
		Temp.setTijd(Integer.parseInt(payload.get("tijd")));
		re.save(Temp);
	}

	public List<Recept> zoekOpNaam(String naam) {
		return re.findByNaamContaining(naam);
	}

	public Recept geefReceptDetails(long receptid) {
		return re.findById(receptid).get();
	}
}


