package nl.applicatie.recept.filter;

import java.util.List;

import nl.applicatie.recept.model.Recept;

public interface Criteria {
	public List<Recept> meetCriteria(List<Recept> recepten);
}
