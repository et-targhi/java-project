package ma.brandweb.gestion_tva.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
public class Tva {
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String refirence;
	private double totaleGain;
	private double totaleCharge;
	private double differenceGainCharge;
	private int trimester;
	private int annee;
	@ManyToOne
	private Societe societe;
	@Transient
	@JsonProperty(access = Access.WRITE_ONLY)
	private List<Facture> factureCharge;
	@Transient
	@JsonProperty(access = Access.WRITE_ONLY)
	private List<Facture> factureGain;
	
	public Societe getSociete() {
		return societe;
	}
	public void setSociete(Societe societe) {
		this.societe = societe;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getRefirence() {
		return refirence;
	}
	public void setRefirence(String refirence) {
		this.refirence = refirence;
	}
	public double getTotaleGain() {
		return totaleGain;
	}
	public void setTotaleGain(double totaleGain) {
		this.totaleGain = totaleGain;
	}
	public double getTotaleCharge() {
		return totaleCharge;
	}
	public void setTotaleCharge(double totaleCharge) {
		this.totaleCharge = totaleCharge;
	}
	public double getDifferenceGainCharge() {
		return differenceGainCharge;
	}
	public void setDifferenceGainCharge(double differenceGainCharge) {
		this.differenceGainCharge = differenceGainCharge;
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
	public List<Facture> getFactureCharge() {
		return factureCharge;
	}
	public void setFactureCharge(List<Facture> factureCharge) {
		this.factureCharge = factureCharge;
	}
	public List<Facture> getFactureGain() {
		return factureGain;
	}
	public void setFactureGain(List<Facture> factureGain) {
		this.factureGain = factureGain;
	}
	
	
}
