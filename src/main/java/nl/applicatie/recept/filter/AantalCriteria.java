package nl.applicatie.recept.filter;

import java.util.ArrayList;
import java.util.List;

import nl.applicatie.recept.model.Recept;

public class AantalCriteria implements Criteria {

	private int aantal;

	public AantalCriteria(int aantal) {
		this.aantal = aantal;
	}

	@Override
	public List<Recept> meetCriteria(List<Recept> recepten) {
		List<Recept> filteredRecepten = new ArrayList<Recept>();

		for (Recept recept : recepten) {
			if (recept.getAantal() >= this.aantal) {
				filteredRecepten.add(recept);
			}
		}

		return filteredRecepten;
	}
}
