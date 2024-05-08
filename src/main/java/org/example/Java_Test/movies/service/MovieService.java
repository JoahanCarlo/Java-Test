package org.example.Java_Test.movies.service;

import org.example.Java_Test.movies.data.MovieRepository;
import org.example.Java_Test.movies.model.Genre;
import org.example.Java_Test.movies.model.Movie;

import java.util.Collection;

public class MovieService {

    private MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Collection<Movie> findMoviesByGenre(Genre genre) {
         Collection<Movie> allMovies =  movieRepository.findAll();
         return allMovies;
    }
}
