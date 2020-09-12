package ma.brandweb.gestion_tva.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.brandweb.gestion_tva.bean.TypeSociete;

@Repository
public interface TypeSocieteRepository extends JpaRepository<TypeSociete, Long>{
	
	public TypeSociete findByLibelle(String libelle);
	
	public int deleteByLibelle(String libelle);
}
