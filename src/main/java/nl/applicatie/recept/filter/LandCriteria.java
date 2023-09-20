package nl.applicatie.recept.filter;

import java.util.ArrayList;
import java.util.List;

import nl.applicatie.recept.model.Recept;

public class LandCriteria implements Criteria {
	private String land;
	
	public LandCriteria(String land) {
		this.land = land;
	}
	
	@Override
	public List<Recept> meetCriteria(List<Recept> recepten) {
		List<Recept> filteredRecepten = new ArrayList<Recept>();
		
		for (Recept recept : recepten) {
			if (recept.getLand().equals(this.land)) {
				filteredRecepten.add(recept);
			}
		}

		return filteredRecepten;
	}
}
