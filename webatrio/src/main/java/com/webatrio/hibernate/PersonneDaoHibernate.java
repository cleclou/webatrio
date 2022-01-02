package com.webatrio.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.webatrio.dao.PersonneDao;
import com.webatrio.exception.DataAccessException;
import com.webatrio.model.Personne;

@Repository
public class PersonneDaoHibernate extends AbstractDaoHibernate implements PersonneDao {

	@Override
	public void createPersonne(Personne personne) throws DataAccessException {
		getSession().save(personne);
		
	}

	@Override
	public List<Personne> loadPersonne() throws DataAccessException {
		String jpql="select p from Personne p";

		Session session = getSession();
		Query<Personne> query = session.createQuery(jpql , Personne.class);

		List<Personne> personneList = query.getResultList();
		
		return personneList;
	}

}
