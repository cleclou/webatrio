package com.webatrio.hibernate;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

@Transactional
public class AbstractDaoHibernate {

	@Autowired
	private SessionFactory sessionFactory;

	protected Session getSession() {
			return sessionFactory.getCurrentSession();
	}
}