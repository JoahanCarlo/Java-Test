package org.example.Java_Test.movies.data;

import org.example.Java_Test.movies.model.Movie;
import org.example.Java_Test.movies.model.Movie_director;

import java.util.Collection;

public interface MovieDirector {
    Movie_director findById(long id);
    Collection<Movie_director> findAll();
    void saveOrUpdate(Movie movie);
}
