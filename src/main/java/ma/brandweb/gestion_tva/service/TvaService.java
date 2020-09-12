package ma.brandweb.gestion_tva.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ma.brandweb.gestion_tva.bean.Facture;
import ma.brandweb.gestion_tva.bean.Societe;
import ma.brandweb.gestion_tva.bean.Tva;
import ma.brandweb.gestion_tva.dao.TvaRepository;

@Service
public class TvaService {
	@Autowired
	private TvaRepository tvaRepository;
	@Autowired
	FactureService factureService;
	@Autowired
	SocieteService societeService;
	public List<Tva> findBySocieteIce(String ice){
		return tvaRepository.findBySocieteIce(ice);
	}
	public List<Tva> findAll(){
		return tvaRepository.findAll();
	}
	
	public int save(Tva tva) {
		Societe societe = societeService.findByIce(tva.getSociete().getIce());
		if(societe == null)
			return -1;
		else {
			tva.setSociete(societe);
			List<Facture> factureCharges = factureService.findChargeByTrimesterAndAnneeAndSocieteIce(tva.getTrimester(),tva.getAnnee(),tva.getSociete().getIce());
			List<Facture> factureGains = factureService.findGainByTrimesterAndAnneeAndSocieteIce(tva.getTrimester(),tva.getAnnee(),tva.getSociete().getIce());
			tva.setTotaleGain(calculerTotale(factureGains));
			tva.setTotaleCharge(calculerTotale(factureCharges));
			tva.setDifferenceGainCharge(tva.getTotaleGain() - tva.getTotaleCharge());
			
			tvaRepository.save(tva);
			return 1;
		}
	}
	
	private double calculerTotale(List<Facture> factures) {
		// TODO Auto-generated method stub
		if(factures == null || factures.isEmpty()) {
			return 0;
		}else {
			double somme=0;
			for (Facture facture : factures) {
				somme+=facture.getMontantTva();
			}
			return somme;
		}
	}
	@Transactional
	public int deletByRefirence(String refirence) {
		return tvaRepository.deleteByRefirence(refirence);
	}
}
