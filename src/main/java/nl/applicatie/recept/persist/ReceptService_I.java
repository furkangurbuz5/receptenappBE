package nl.applicatie.recept.persist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.applicatie.recept.model.Recept_I;

@Service
public class ReceptService_I {
	@Autowired
	private ReceptRepository_I rr_i;
	//-------------------------------------------------
	public Iterable<Recept_I> geefAlleRecepten() {
		return rr_i.findAll();
	}
	//-------------------------------------------------
}
