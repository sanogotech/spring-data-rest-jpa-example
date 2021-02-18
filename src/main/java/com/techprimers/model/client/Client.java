package com.techprimers.model.client;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Client {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
    
	private String nom;
	private String prenom;
	private String email;
	//	Ref  Contrat
	private String refcontrat;
	// Ref Client
	private String refclient;
	private String telephone;
	



	private String numeroCompteur;
	private String adresseTechnique;
	private String puissanceSouscrite;
	private String pointFourniture;
	private String avanceConsomation;
	private String typeTarif;
	private String typeAbonnement;
	private String genreAbonnement; 
	
	
	
	
	public String getNumeroCompteur() {
		return numeroCompteur;
	}
	public void setNumeroCompteur(String numeroCompteur) {
		this.numeroCompteur = numeroCompteur;
	}
	public String getAdresseTechnique() {
		return adresseTechnique;
	}
	public void setAdresseTechnique(String adresseTechnique) {
		this.adresseTechnique = adresseTechnique;
	}
	public String getPuissanceSouscrite() {
		return puissanceSouscrite;
	}
	public void setPuissanceSouscrite(String puissanceSouscrite) {
		this.puissanceSouscrite = puissanceSouscrite;
	}
	public String getPointFourniture() {
		return pointFourniture;
	}
	public void setPointFourniture(String pointFourniture) {
		this.pointFourniture = pointFourniture;
	}
	public String getAvanceConsomation() {
		return avanceConsomation;
	}
	public void setAvanceConsomation(String avanceConsomation) {
		this.avanceConsomation = avanceConsomation;
	}
	public String getTypeTarif() {
		return typeTarif;
	}
	public void setTypeTarif(String typeTarif) {
		this.typeTarif = typeTarif;
	}
	public String getTypeAbonnement() {
		return typeAbonnement;
	}
	public void setTypeAbonnement(String typeAbonnement) {
		this.typeAbonnement = typeAbonnement;
	}
	public String getGenreAbonnement() {
		return genreAbonnement;
	}
	public void setGenreAbonnement(String genreAbonnement) {
		this.genreAbonnement = genreAbonnement;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRefcontrat() {
		return refcontrat;
	}
	public void setRefcontrat(String refcontrat) {
		this.refcontrat = refcontrat;
	}
	public String getRefclient() {
		return refclient;
	}
	public void setRefclient(String refclient) {
		this.refclient = refclient;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	

}
