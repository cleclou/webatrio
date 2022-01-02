package com.webatrio.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webatrio.dao.PersonneDao;
import com.webatrio.exception.DataAccessException;
import com.webatrio.hibernate.PersonneDaoHibernate;
import com.webatrio.model.Personne;
import com.webatrio.service.PersonneService;

@Service
@Transactional
public class PersonneServiceImpl implements PersonneService {

	@Resource
	private PersonneDao personneDao = new PersonneDaoHibernate();

	@Override
	public void createPersonne(Personne personne) throws DataAccessException {
		personneDao.createPersonne(personne);

	}

	@Override
	public List<Personne> loadPersonne() throws DataAccessException {
		return personneDao.loadPersonne();
	}
}
