package com.webatrio.dto;

import java.time.LocalDate;

public class PersonneDto {

	private String nom;

	private String prenom;

	private LocalDate dateNaissance;

	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public PersonneDto() {
		super();
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

	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	@Override
	public String toString() {
		return "PersonneDto [nom=" + nom + ", prenom=" + prenom + ", dateNaissance=" + dateNaissance + ", age=" + age
				+ "]";
	}
}
