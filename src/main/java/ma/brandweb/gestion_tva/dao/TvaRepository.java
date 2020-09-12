package ma.brandweb.gestion_tva.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.brandweb.gestion_tva.bean.Tva;

@Repository
public interface TvaRepository extends JpaRepository<Tva, Long>{
	
	public List<Tva> findBySocieteIce(String ice);
	
	public int deleteByRefirence(String refirence);
}
