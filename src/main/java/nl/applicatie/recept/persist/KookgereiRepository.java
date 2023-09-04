package nl.applicatie.recept.persist;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import nl.applicatie.recept.model.Kookgerei;

// https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#reference


public interface KookgereiRepository extends CrudRepository<Kookgerei, Long>{
	
	//types altijd afhankelijk van de field 
	List<Kookgerei> findByNaam(String naam);
	List<Kookgerei> findByPrijs(double prijs); 
	
	//contains 
	List<Kookgerei> findByNaamContaining(String naam);
	
	@Query("SELECT k FROM Kookgerei k WHERE k.prijs LIKE %?1%")
	List<Kookgerei> zoekPrijs(double prijs);
	
	
}
