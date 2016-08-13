package com.jorge.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jorge.model.User;

@Repository //Necessary to use DAO and Spring. It allows the UserDAO class to be automatically discovered and instantiated as a bean
public class UserDAO {
	
	@Autowired
	SessionFactory sessionFactory; // Hibernate, see AppConfig.java
	
	/**
	 * Use this SessionFactory bean to control Hibernate as usual, for example, this is a DAO
	 * method which will add a User object into the database
	 * 
	 */
	@Transactional
	public void add(User user) {
		sessionFactory.getCurrentSession().saveOrUpdate(user);
	}
	
}
