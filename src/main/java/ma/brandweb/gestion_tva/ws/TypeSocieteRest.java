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

import ma.brandweb.gestion_tva.bean.TypeSociete;
import ma.brandweb.gestion_tva.service.TypeSocieteService;

@RestController
@RequestMapping("impot-api/type-societe")
@CrossOrigin(origins = "http://localhost:4200")
public class TypeSocieteRest {
	@Autowired
	private TypeSocieteService typeSocieteService;
	@GetMapping("/")
	public List<TypeSociete> findAll() {
		return typeSocieteService.findAll();
	}
	@GetMapping("/libelle/{libelle}")
	public TypeSociete findByLibelle(@PathVariable String libelle) {
		return typeSocieteService.findByLibelle(libelle);
	}
	@DeleteMapping("/libelle/{libelle}")
	public int deletByLibelle(@PathVariable String libelle) {
		return typeSocieteService.deletByLibelle(libelle);
	}
	@PostMapping("/")
	public int save(@RequestBody TypeSociete typeSociete) {
		typeSocieteService.save(typeSociete);
		return 1;
	}
	
	
}
