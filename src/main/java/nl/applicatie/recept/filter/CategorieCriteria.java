package nl.applicatie.recept.filter;

import java.util.ArrayList;
import java.util.List;

import nl.applicatie.recept.model.Recept;
import Enum.category;

public class CategorieCriteria implements Criteria {
	private category category;

	public CategorieCriteria(category category) {
		this.category = category;
	}

	@Override
	public List<Recept> meetCriteria(List<Recept> recepten) {
		
		if (category == category.Alle) return recepten;		

		List<Recept> filteredRecepten = new ArrayList<Recept>();

		for (Recept recept : recepten) {
			if (recept.getCategorieen() == this.category) {
				filteredRecepten.add(recept);
			}
		}

		return filteredRecepten;

	}

}
