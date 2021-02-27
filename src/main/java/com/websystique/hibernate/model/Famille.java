package com.websystique.hibernate.model;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "Famille")
public class Famille implements Serializable {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID_famille;

	@Column(name = "Nom_Responsable", nullable = false)
	private String Nom_Responsable;

	@Column(name = "Prenom_Responsable", nullable = false)
	private String Prenom_Responsable;
	
	@Column(name = "Adresse", nullable = false)
	private String Adresse;

	@Column(name = "Code Ville", nullable = false)
	private String Code_ville;
	
	
	
	

}







