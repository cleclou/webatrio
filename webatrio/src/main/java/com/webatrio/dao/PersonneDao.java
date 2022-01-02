package com.webatrio.dao;

import java.util.List;

import com.webatrio.exception.DataAccessException;
import com.webatrio.model.Personne;

public interface PersonneDao {
	
	void createPersonne(Personne personne) throws DataAccessException;
	
	List<Personne> loadPersonne() throws DataAccessException;

}
