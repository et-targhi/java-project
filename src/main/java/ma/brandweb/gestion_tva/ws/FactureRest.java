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

import ma.brandweb.gestion_tva.bean.Facture;
import ma.brandweb.gestion_tva.service.FactureService;

@RestController
@RequestMapping("impot-api/facture")
@CrossOrigin(origins = "http://localhost:4200")

public class FactureRest {
	@Autowired
	private FactureService factureService;

	@GetMapping("/refirence/{refirence}")
	public Facture fidByRefirence(@PathVariable String refirence) {
		return factureService.fidByRefirence(refirence);
	}

	@GetMapping("/trimester/{trimester}/annee/{annee}")
	public List<Facture> findByTrimesterAndAnnee(@PathVariable int trimester, @PathVariable int annee) {
		return factureService.findByTrimesterAndAnnee(trimester, annee);
	}

	@GetMapping("/gain/trimester/{trimester}/annee/{annee}/societe/ice/{ice}")
	public List<Facture> findGainByTrimesterAndAnneeAndSocieteIce(@PathVariable int trimester,@PathVariable int annee,@PathVariable String ice) {
		return factureService.findGainByTrimesterAndAnneeAndSocieteIce(trimester, annee, ice);
	}
	
	@GetMapping("/charge/trimester/{trimester}/annee/{annee}/societe/ice/{ice}")
	public List<Facture> findChargeByTrimesterAndAnneeAndSocieteIce(@PathVariable int trimester,@PathVariable int annee,@PathVariable String ice) {
		return factureService.findChargeByTrimesterAndAnneeAndSocieteIce(trimester, annee, ice);
	}
	
	@GetMapping("/societe/ice/{ice}")
	public List<Facture> findBySocieteIce(@PathVariable String ice) {
		return factureService.findBySocieteIce(ice);
	}

	@PostMapping("/")
	public void save(@RequestBody Facture facture) {
		factureService.save(facture);
	}

	@GetMapping("/")
	public List<Facture> findAll() {
		return factureService.findAll();
	}

	@DeleteMapping("/refirence/{refirence}")
	public int deletByRefirence(@PathVariable String refirence) {
		return factureService.deletByRefirence(refirence);
	}

}
