package ma.brandweb.gestion_tva.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ma.brandweb.gestion_tva.bean.Facture;
import ma.brandweb.gestion_tva.dao.FactureRepository;

@Service
public class FactureService {
	@Autowired
	private FactureRepository factureRepository;

	public Facture fidByRefirence(String refirence) {
		return factureRepository.findByRefirence(refirence);
	}

	public List<Facture> findByTrimesterAndAnnee(int trimester, int annee) {
		return factureRepository.findByTrimesterAndAnnee(trimester, annee);
	}

	public List<Facture> findGainByTrimesterAndAnneeAndSocieteIce(int trimester, int annee, String ice) {
		return findByTrimesterAndAnneeAndSocieteIceAndType(trimester, annee, ice, 1);
	}

	public List<Facture> findChargeByTrimesterAndAnneeAndSocieteIce(int trimester, int annee, String ice) {
		return findByTrimesterAndAnneeAndSocieteIceAndType(trimester, annee, ice, 2);
	}

	private List<Facture> findByTrimesterAndAnneeAndSocieteIceAndType(int trimester, int annee, String ice, int type) {
		return factureRepository.findByTrimesterAndAnneeAndSocieteIceAndType(trimester, annee, ice, type);
	}

	public List<Facture> findBySocieteIce(String ice) {
		return factureRepository.findBySocieteIce(ice);
	}

	public void save(Facture facture) {
		factureRepository.save(facture);
	}

	public List<Facture> findAll() {
		return factureRepository.findAll();
	}

	@Transactional
	public int deletByRefirence(String refirence) {
		return factureRepository.deleteByRefirence(refirence);
	}

}
