package org.example.Java_Test.movies.data;
import org.example.Java_Test.movies.model.Movie;

import java.util.Collection;

public interface MovieRepository {
    Movie findById(long id);
    Collection<Movie> findAll();
    void saveOrUpdate(Movie movie);

}
