package com.madhusudhan.jh.basicmovie;

import com.madhusudhan.jh.domain.Movie;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import java.util.List;

public class BasicMovieManager {
	private SessionFactory sessionFactory = null;
	
	public BasicMovieManager() {
		this.initSessionFactory();
	}
	
	private void initSessionFactory() {
		Configuration config = new Configuration().configure();
		
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
		
		sessionFactory = config.buildSessionFactory(serviceRegistry);
	}
	
	public void persistMovie(Movie movie) {
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.save(movie);
		session.getTransaction().commit();
	}
	
	public void findMovie(int movieId) {
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		
		Movie movie = (Movie) session.load(Movie.class, movieId);
		
		System.out.println("Movie :: " + movie.toString());
		session.getTransaction().commit();
	}
	
	public void findAll() {
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		
		List<Movie> movies = session.createQuery("from Movie ").list();
		
		session.getTransaction().commit();
		System.out.println("All Movies :: " + movies.toString());
	}
}
