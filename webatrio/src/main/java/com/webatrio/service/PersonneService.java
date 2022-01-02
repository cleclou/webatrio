package com.webatrio.service;

import java.util.List;

import com.webatrio.exception.DataAccessException;
import com.webatrio.model.Personne;

public interface PersonneService {
	
	void createPersonne(Personne personne) throws DataAccessException;
	
	List<Personne> loadPersonne() throws DataAccessException;
	
}