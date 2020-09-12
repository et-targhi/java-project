package ma.brandweb.gestion_tva.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
public class Societe {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String raisonSocial;
	private String ice;
	@ManyToOne
	private TypeSociete typeSociete;
	@JsonProperty(access = Access.WRITE_ONLY)
	@OneToMany(mappedBy = "societe")
	private List<Facture> factures;

	public TypeSociete getTypeSociete() {
		return typeSociete;
	}

	public void setTypeSociete(TypeSociete typeSociete) {
		this.typeSociete = typeSociete;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRaisonSocial() {
		return raisonSocial;
	}

	public void setRaisonSocial(String raisonSocial) {
		this.raisonSocial = raisonSocial;
	}

	public List<Facture> getFactures() {
		return factures;
	}

	public void setFactures(List<Facture> factures) {
		this.factures = factures;
	}

	public String getIce() {
		return ice;
	}

	public void setIce(String ice) {
		this.ice = ice;
	}

	@Override
	public String toString() {
		return "Societe [id=" + id + ", raisonSocial=" + raisonSocial + ", ice=" + ice + ", factures=" + factures + "]";
	}

}
