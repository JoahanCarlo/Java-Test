package org.example.Java_Test.movies.service;

import org.example.Java_Test.movies.data.MovieRepository;
import org.example.Java_Test.movies.model.Genre;
import org.example.Java_Test.movies.model.Movie;
import org.example.Java_Test.movies.model.Movie_director;
import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.mockito.Mockito;
import org.junit.Assert;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class MovieServiceShould {
    @Test
    public void return_movies_by_genre() {
        MovieRepository movieRepository = Mockito.mock(MovieRepository.class);
        Mockito.when(movieRepository.findAll()).thenReturn(
                Arrays.asList(
                        new Movie(1, "Dark Knight", 152, Genre.ACTION),
                        new Movie(2, "Memento", 113, Genre.THRILLER),
                        new Movie(3, "There's Something About Marty", 119, Genre.COMEDY),
                        new Movie(4, "Super 8", 112, Genre.THRILLER),
                        new Movie(5, "Scream", 111, Genre.HORROR),
                        new Movie(6, "Home Alone", 103, Genre.COMEDY),
                        new Movie(7, "Matrix", 136, Genre.ACTION)
                )
        );
        MovieService movieService =  new MovieService(movieRepository);
        Collection<Movie> movies = movieService.findMoviesByGenre(Genre.COMEDY);
        List<Integer>  movieIds = movies.stream().map(movie-> movie.getId()).collect(Collectors.toList());
        assertThat(movieIds, CoreMatchers.is(Arrays.asList(3,6)));
    }

    @Test
    public void director_movie() {

    }
}