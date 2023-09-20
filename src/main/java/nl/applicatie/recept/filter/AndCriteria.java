package nl.applicatie.recept.filter;

import java.util.List;

import nl.applicatie.recept.model.Recept;

public class AndCriteria implements Criteria {
	
	private Criteria critOne, critTwo;

	public AndCriteria(Criteria critOne, Criteria critTwo) {
		this.critOne = critOne;
		this.critTwo = critTwo;
	}
	
	@Override
	public List<Recept> meetCriteria(List<Recept> recepten) {
		List<Recept> filterOneRecepten = this.critOne.meetCriteria(recepten);
		List<Recept> filterTwo = this.critTwo.meetCriteria(filterOneRecepten);
		return filterTwo;
	}

}
