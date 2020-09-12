package ma.brandweb.gestion_tva.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ma.brandweb.gestion_tva.bean.Societe;
import ma.brandweb.gestion_tva.dao.SocieteRepository;

@Service
public class SocieteService {
	@Autowired
	private SocieteRepository societeRepository;
	
	public Societe findByRaisonSocial(String raisonSocial) {
		return societeRepository.findByRaisonSocial(raisonSocial);
	}

	public Societe findByIce(String ice) {
		return societeRepository.findByIce(ice);
	}

	public Societe findByTypeSocieteLibelle(String libelle) {
		return societeRepository.findByTypeSocieteLibelle(libelle);
	}
	
	public List<Societe> findAll(){
		return societeRepository.findAll();
	}
	
	public void save(Societe societe) {
		societeRepository.save(societe);
	}
	@Transactional
	public int deletByIce(String ice) {
		return societeRepository.deleteByIce(ice);
	}
}
