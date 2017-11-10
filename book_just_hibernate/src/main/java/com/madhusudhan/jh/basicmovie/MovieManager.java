package com.madhusudhan.jh.basicmovie;

import com.madhusudhan.jh.domain.Movie;

public class MovieManager {
	public static void main(String args[]) {
		BasicMovieManager basicMovieManager = new BasicMovieManager();
		
		Movie movie = new Movie();
		movie.setId(1);
		movie.setTitle("Jaws");
		movie.setDirector("Steven Spielberg");
		movie.setSynopsis("Strory of great white shark!");
		basicMovieManager.persistMovie(movie);
		
		basicMovieManager.findMovie(1);
		
		basicMovieManager.findAll();
	}
}
