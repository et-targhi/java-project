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

import ma.brandweb.gestion_tva.bean.Tva;
import ma.brandweb.gestion_tva.service.TvaService;

@RestController
@RequestMapping("impot-api/tva")
@CrossOrigin(origins = "http://localhost:4200")

public class TvaRest {
	@Autowired
	private TvaService tvaService;
	
	@GetMapping("/societe/ice/{ice}")
	public List<Tva> findBySocieteIce(@PathVariable String ice) {
		return tvaService.findBySocieteIce(ice);
	}
	@GetMapping("/")
	public List<Tva> findAll() {
		return tvaService.findAll();
	}
	@PostMapping("/")
	public void save(@RequestBody Tva tva) {
		tvaService.save(tva);
	}
	@DeleteMapping("/refirence/{refirence}")
	public int deletByRefirence(@PathVariable String refirence) {
		return tvaService.deletByRefirence(refirence);
	}

}
