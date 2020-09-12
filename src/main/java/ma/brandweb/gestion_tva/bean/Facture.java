package ma.brandweb.gestion_tva.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Facture {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String refirence;
	private int type;
	private double montantHt;
	private double montantHttc;
	private double montantTva;
	private int trimester;
	private int annee;
	@ManyToOne
	private Societe societe;
	@ManyToOne
	private Tva tva;

	public String getRefirence() {
		return refirence;
	}

	public void setRefirence(String refirence) {
		this.refirence = refirence;
	}

	public int getTrimester() {
		return trimester;
	}

	public void setTrimester(int trimester) {
		this.trimester = trimester;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public double getMontantHt() {
		return montantHt;
	}

	public void setMontantHt(double montantHt) {
		this.montantHt = montantHt;
	}

	public double getMontantHttc() {
		return montantHttc;
	}

	public void setMontantHttc(double montantHttc) {
		this.montantHttc = montantHttc;
	}

	public double getMontantTva() {
		return montantTva;
	}

	public void setMontantTva(double montantTva) {
		this.montantTva = montantTva;
	}

	public Societe getSociete() {
		return societe;
	}

	public void setSociete(Societe societe) {
		this.societe = societe;
	}

	public Tva getTva() {
		return tva;
	}

	public void setTva(Tva tva) {
		this.tva = tva;
	}

}
