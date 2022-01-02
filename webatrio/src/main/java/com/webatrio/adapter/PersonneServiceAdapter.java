package com.webatrio.adapter;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webatrio.dto.PersonneDto;
import com.webatrio.exception.DataAccessException;
import com.webatrio.mapper.PersonneMapper;
import com.webatrio.model.Personne;
import com.webatrio.service.PersonneService;

@Service
public class PersonneServiceAdapter {

	@Autowired
	private PersonneService delegate;
	
	public void createEquipe(PersonneDto personneDto) throws DataAccessException{
		Personne personne = PersonneMapper.personneDtoToPersonne(personneDto);
		delegate.createPersonne(personne);
	}
	
	public List<PersonneDto> loadPersonnes() throws DataAccessException{
		List<Personne> personneList = delegate.loadPersonne();		
		List<PersonneDto> personnelistDto= new ArrayList<>();
		for(Personne personne : personneList) {
			PersonneDto personneDto = PersonneMapper.personneToPersonneDto(personne);
			personneDto.setAge(calculateAge(personneDto.getDateNaissance(), LocalDate.now()));
			personnelistDto.add(personneDto);
		}
		personnelistDto.sort(Comparator.comparing(PersonneDto::getNom).thenComparing(PersonneDto::getPrenom));
		return personnelistDto;
	}
	
    public static int calculateAge(LocalDate birthDate, LocalDate currentDate) {
        if ((birthDate != null) && (currentDate != null)) {
            return Period.between(birthDate, currentDate).getYears();
        } else {
            return 0;
        }
    }
}
