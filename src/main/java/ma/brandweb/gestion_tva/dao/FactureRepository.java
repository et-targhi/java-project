package ma.brandweb.gestion_tva.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.brandweb.gestion_tva.bean.Facture;

@Repository
public interface FactureRepository extends JpaRepository<Facture, Long> {
	
	public Facture findByRefirence(String refirence);
	
	public List<Facture> findByTrimesterAndAnnee(int trimester,int annee);

	public List<Facture> findByTrimesterAndAnneeAndSocieteIceAndType(int trimester,int annee,String ice,int type);

	public List<Facture> findBySocieteIce(String ice);
	
	public int deleteByRefirence(String refirence);
	
}
