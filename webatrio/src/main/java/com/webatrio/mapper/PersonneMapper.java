package com.webatrio.mapper;

import com.webatrio.dto.PersonneDto;
import com.webatrio.model.Personne;

public interface PersonneMapper {
	static PersonneDto personneToPersonneDto(Personne personne) {
		PersonneDto personneDto = new PersonneDto();
		personneDto.setNom(personne.getNom());
		personneDto.setPrenom(personne.getPrenom());
		personneDto.setDateNaissance(personne.getDateNaissance());
		return personneDto;
	}
	
	static Personne personneDtoToPersonne(PersonneDto personneDto) {
		Personne personne = new Personne();
		personne.setNom(personneDto.getNom());
		personne.setPrenom(personneDto.getPrenom());
		personne.setDateNaissance(personneDto.getDateNaissance());
		return personne;
	}
}
