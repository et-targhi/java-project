package ma.brandweb.gestion_tva.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.brandweb.gestion_tva.bean.Societe;
import ma.brandweb.gestion_tva.service.SocieteService;

@RestController
@RequestMapping("impot-api/societe")
@CrossOrigin(origins = "http://localhost:4200")

public class SocieteRest {
	@Autowired
	private SocieteService societeService;

	@GetMapping("/raison-social/{raisonSocial}")
	public Societe findByRaisonSocial(@PathVariable String raisonSocial) {
		return societeService.findByRaisonSocial(raisonSocial);
	}

	@GetMapping("/ice/{ice}")
	public Societe findByIce(@PathVariable String ice) {
		return societeService.findByIce(ice);
	}

	@GetMapping("/type-societe/libelle/{libelle}")
	public Societe findByTypeSocieteLibelle(@PathVariable String libelle) {
		return societeService.findByTypeSocieteLibelle(libelle);
	}

	@GetMapping("/")
	public List<Societe> findAll() {
		return societeService.findAll();
	}

	@PostMapping("/")
	public void save(@RequestBody Societe societe) {
		societeService.save(societe);
	}

	@DeleteMapping("/ice/{ice}")
	public int deletByIce(@PathVariable String ice) {
		return societeService.deletByIce(ice);
	}

}
