package org.example.Java_Test.movies.model;

import java.util.Objects;

public class Movie_director {
    private Integer id;
    private String name;
    private int minutes;
    private String director;

    public Movie_director(String name, int minutes, String director){
        this(null,name,minutes,director);
    }

    public Movie_director(Integer id, String name, int minutes, String director) {
        this.id = id;
        this.name = name;
        this.minutes = minutes;
        this.director = director;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMinutes() {
        return minutes;
    }

    public String getDirector() {
        return director;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie_director that = (Movie_director) o;
        return minutes == that.minutes && Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(director, that.director);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, minutes, director);
    }
}
