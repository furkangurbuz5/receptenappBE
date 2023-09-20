package nl.applicatie.recept.filter;

import java.util.ArrayList;
import java.util.List;

import nl.applicatie.recept.model.Recept;

public class TijdCriteria implements Criteria{
	
	private int tijd;
	
	public TijdCriteria(int tijd) {
		this.tijd = tijd;
	}
	
	@Override
	public List<Recept> meetCriteria(List<Recept> recepten) {
		List<Recept> filteredRecepten = new ArrayList<Recept>();
		for(Recept recept : recepten) {
			if(this.tijd >= recept.getTijd()) {
				filteredRecepten.add(recept);
			}
		}
		return filteredRecepten;
	}

}
