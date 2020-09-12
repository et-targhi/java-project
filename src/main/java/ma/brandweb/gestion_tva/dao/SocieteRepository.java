package ma.brandweb.gestion_tva.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.brandweb.gestion_tva.bean.Societe;

@Repository
public interface SocieteRepository extends JpaRepository<Societe, Long> {

	public Societe findByRaisonSocial(String raisonSocial);

	public Societe findByIce(String ice);

	public Societe findByTypeSocieteLibelle(String libelle);
	
	public int deleteByIce(String ice);
}
