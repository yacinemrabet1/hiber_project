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
@Table(name = "STUDENT")
public class Student implements Serializable {

	public Student(int id_inscription, int id_famille, int num_eleve, String prenom, String nom,
			String section, String sexe) {
		super();
		this.id_inscription = id_inscription;
		this.id_famille = id_famille;
		this.Num_eleve = num_eleve;
		this.prenom = prenom;
		this.nom = nom;
		this.section = section;
		this.sexe = sexe;
	}
	
	
	public Student() {
		
	}

	@Override
	public String toString() {
		return "Student [id_eleve=" + id_eleve + ", id_inscription=" + id_inscription + ", id_famille=" + id_famille
				+ ", Num_eleve=" + Num_eleve + ", prenom=" + prenom + ", nom=" + nom + ", section=" + section
				+ ", sexe=" + sexe + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Num_eleve;
		result = prime * result + id_eleve;
		result = prime * result + id_famille;
		result = prime * result + id_inscription;
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
		result = prime * result + ((section == null) ? 0 : section.hashCode());
		result = prime * result + ((sexe == null) ? 0 : sexe.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (Num_eleve != other.Num_eleve)
			return false;
		if (id_eleve != other.id_eleve)
			return false;
		if (id_famille != other.id_famille)
			return false;
		if (id_inscription != other.id_inscription)
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (prenom == null) {
			if (other.prenom != null)
				return false;
		} else if (!prenom.equals(other.prenom))
			return false;
		if (section == null) {
			if (other.section != null)
				return false;
		} else if (!section.equals(other.section))
			return false;
		if (sexe == null) {
			if (other.sexe != null)
				return false;
		} else if (!sexe.equals(other.sexe))
			return false;
		return true;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_eleve;

	@Column(name = "ID_Inscription", nullable = false)
	private int id_inscription;

	@Column(name = "ID_famille", nullable = false)
	private int id_famille;

	@Column(name = "Num_eleve", nullable = false)
	private int Num_eleve;
	
	@Column(name = "prenom", nullable = false)
	private String prenom;

	@Column(name = "nom", nullable = false)
	private String nom;
	
	@Column(name = "section", nullable = false)
	private String section;

	@Column(name = "sexe", nullable = false)
	private String sexe;

	public int getId_eleve() {
		return id_eleve;
	}


	public void setId_eleve(int id_eleve) {
		this.id_eleve = id_eleve;
	}


	public int getId_inscription() {
		return id_inscription;
	}


	public void setId_inscription(int id_inscription) {
		this.id_inscription = id_inscription;
	}


	public int getId_famille() {
		return id_famille;
	}


	public void setId_famille(int id_famille) {
		this.id_famille = id_famille;
	}


	public int getNum_eleve() {
		return Num_eleve;
	}


	public void setNum_eleve(int num_eleve) {
		Num_eleve = num_eleve;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getSection() {
		return section;
	}


	public void setSection(String section) {
		this.section = section;
	}


	public String getSexe() {
		return sexe;
	}


	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	
	
	
	
	
	
	
	
	




}
