package com.hand.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.hand.dao.services.FilmService;
import com.hand.pojo.Film;
import com.hand.pojo.Film1;


@Transactional
public class FilmServiceImpl implements FilmService{


    
	@Resource
    private SessionFactory sessionFactory;
    
    @Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	public List<Film1> listFilms() {
		// TODO Auto-generated method stub
    	System.out.println("sessiondd");
		Session session= sessionFactory.getCurrentSession();
		System.out.println("session"+session);
		Criteria cr= session.createCriteria(Film.class);
		
		List<Film1> films= cr.list();
		
		return films;

	}

	public void delete(Short film_id) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(
                sessionFactory.getCurrentSession().load(Film.class, film_id));
	}
	
	
		
}
