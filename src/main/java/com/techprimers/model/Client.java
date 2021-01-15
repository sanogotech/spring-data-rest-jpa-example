package com.techprimers.model;

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
	private String refcontrat;
	private String refclient;
	private String telephone;
	
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
