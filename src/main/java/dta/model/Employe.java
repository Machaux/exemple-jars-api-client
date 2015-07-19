package dta.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Employe {
	private Integer id;

	private String nom;

	private BigDecimal salaire;

	private Employe superieur;

	public Employe() {
		super();
	}

	public BigDecimal getSalaire() {
		return salaire;
	}

	public void setSalaire(BigDecimal salaire) {
		this.salaire = salaire;
	}

	@Override
	public String toString() {
		return String.format("Employe [id=%d, nom=%s, salaire=%s]", id, nom,
				salaire);
	}

	public Employe getSuperieur() {
		return superieur;
	}

	public void setSuperieur(Employe superieur) {
		this.superieur = superieur;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
}
