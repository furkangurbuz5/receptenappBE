package nl.applicatie.recept.restapi;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Enum.category;
import nl.applicatie.recept.filter.AantalCriteria;
import nl.applicatie.recept.filter.AndCriteria;
import nl.applicatie.recept.filter.CategorieCriteria;
import nl.applicatie.recept.filter.Criteria;
import nl.applicatie.recept.filter.LandCriteria;
import nl.applicatie.recept.filter.TijdCriteria;
import nl.applicatie.recept.model.Recept;
import nl.applicatie.recept.persist.ReceptRepository;
import nl.applicatie.recept.persist.ReceptService;

@RestController
public class ReceptEndpoint {
	private final ReceptRepository receptRepository;

	public ReceptEndpoint(final ReceptRepository receptRepository) {
		this.receptRepository = receptRepository;
	}

	@Autowired
	private ReceptService rs;

	@GetMapping("derecepten")
	public Iterable<Recept> geefAlleRecepten() {
		return rs.geefAlleRecepten();
	}

	@GetMapping("receptdetails/{receptid}")
	public Recept geefReceptDetails(@PathVariable("receptid") int receptid) {
		return rs.geefReceptDetails(receptid);
	}

	@PostMapping("voegrecepttoe")
	public void voegReceptToe(@RequestBody Recept recept) {
		rs.slaReceptOp(recept);
	}

	@DeleteMapping("verwijderrecept/{receptid}")
	public void verwijderRecept(@PathVariable("receptid") int receptid) {
		rs.verwijderRecept(receptid);
	}

	@PutMapping("recept/aanpassen/{receptid}/{nieuwenaam}")
	public void aanpassenRecept(@PathVariable("receptid") int receptid, @PathVariable("nieuwenaam") String nieuwenaam,
			@RequestBody Map<String, String> payload) {
		rs.aanpassen(receptid, nieuwenaam, payload);

	}

	@GetMapping("zoekreceptnaam/{naam}")
	public List<Recept> zoekReceptNaam(@PathVariable("naam") String naam) {
		return rs.zoekOpNaam(naam);
	}

	@GetMapping("/recepten/zoeken")
	public List<Recept> zoeken(@RequestParam(required = false) category categorie,
			@RequestParam(required = false) Integer aantal, @RequestParam(required = false) Integer tijd,
			@RequestParam(required = false) String land) {
		
		List<Recept> recepten = (List<Recept>) rs.geefAlleRecepten();
		
		Criteria filter = new CategorieCriteria(categorie);	
		if(aantal != null) filter = new AndCriteria(filter, new AantalCriteria(aantal));
		if(tijd != null) filter = new AndCriteria(filter, new TijdCriteria(tijd));
		if(!land.equals("")) filter = new AndCriteria(filter, new LandCriteria(land));
		
		return filter.meetCriteria(recepten);

//		 category categorie;
//		try {
//			categorie = category.valueOf(categorie);
//
//	

//		 if (categorie == category.Alle) {
//				if (Objects.nonNull(aantal) && Objects.nonNull(tijd) && Objects.nonNull(land)) {
//					return this.receptRepository.findByAantalAndLandAndTijdLessThan(aantal, land, tijd);
//				} else if (Objects.nonNull(aantal) && Objects.nonNull(tijd)) {
//					return this.receptRepository.findByTijdLessThanAndAantal(tijd, aantal);
//				} else if (Objects.nonNull(land) && Objects.nonNull(tijd)) {
//					return this.receptRepository.findByLandAndTijdLessThan(land, tijd);
//				} else if (Objects.nonNull(land) && Objects.nonNull(aantal)) {
//					return this.receptRepository.findByLandAndAantal(land, aantal);
//				} else if (Objects.nonNull(tijd)) {
//					return this.receptRepository.findByTijdLessThan(tijd);
//				} else if (Objects.nonNull(aantal)) {
//					return this.receptRepository.findByAantal(aantal);
//				} else if (Objects.nonNull(land)) {
//					return this.receptRepository.findByLand(land);
//				} else {
//					return (List<Recept>) rs.geefAlleRecepten();
//				}
//			} else {
//				if (Objects.nonNull(aantal) && Objects.nonNull(tijd) && Objects.nonNull(land)) {
//					return this.receptRepository.findByTijdLessThanAndCategorieenAndLandAndAantal(tijd, categorie, land,
//							aantal);
//				} else if (Objects.nonNull(aantal) && Objects.nonNull(tijd)) {
//					return this.receptRepository.findByCategorieenAndAantalAndTijdLessThan(categorie, aantal, tijd);
//				} else if (Objects.nonNull(aantal) && Objects.nonNull(land)) {
//					return this.receptRepository.findByCategorieenAndAantalAndLand(categorie, aantal, land);
//				} else if (Objects.nonNull(tijd) && Objects.nonNull(land)) {
//					return this.receptRepository.findByCategorieenAndLandAndTijdLessThan(categorie, land, tijd);
//				} else if (Objects.nonNull(aantal)) {
//					return this.receptRepository.findByCategorieenAndAantal(categorie, aantal);
//				} else if(Objects.nonNull(tijd)) {
//					return this.receptRepository.findByCategorieenAndTijdLessThan(categorie, tijd);
//				} else if(Objects.nonNull(land)) {
//					return this.receptRepository.findByCategorieenAndLand(categorie, land);
//			    } else {
//					return this.receptRepository.findByCategorieen(categorie);
//				}
//
//			}
			// else if (Objects.nonNull(aantal)) {
			// if (Objects.nonNull(tijd) && Objects.nonNull(land)) {
			// return this.receptRepository.findByAantalAndLandAndTijdLessThan(aantal, land,
			// tijd);
			// } else if (Objects.nonNull(tijd)) {
			// return this.receptRepository.findByTijdLessThanAndAantal(tijd, aantal);
			// } else if (Objects.nonNull(land)) {
			// return this.receptRepository.findByLandAndAantal(land, aantal);
			// } else {
			// return this.receptRepository.findByAantal(aantal);
			// }
			// } else if (Objects.nonNull(tijd)) {
			// if (Objects.nonNull(land)) {
			// return this.receptRepository.findByLandAndTijdLessThan(land, tijd);
			// } else {
			// return this.receptRepository.findByTijdLessThan(tijd);
			// } else if (Objects.nonNull(land)) {
			// return this.receptRepository.findByLand(land);
			// } else {
			// System.out.println("Geen filter mogelijk");
			// return (List<Recept>) rs.geefAlleRecepten();
			// }
		
		

	}
}
