package ma.brandweb.gestion_tva.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ma.brandweb.gestion_tva.bean.TypeSociete;
import ma.brandweb.gestion_tva.dao.TypeSocieteRepository;

@Service
public class TypeSocieteService {
	@Autowired
	private TypeSocieteRepository typeSocieteRepository;
	
	public TypeSociete findByLibelle(String libelle) {
		return typeSocieteRepository.findByLibelle(libelle);
	}
	@Transactional
	public int deletByLibelle(String libelle) {
		return typeSocieteRepository.deleteByLibelle(libelle);
	}
	public List<TypeSociete> findAll(){
		return typeSocieteRepository.findAll();
	}
	public int save(TypeSociete typeSociete) {
		typeSocieteRepository.save(typeSociete);
		return 1;
	}
}
