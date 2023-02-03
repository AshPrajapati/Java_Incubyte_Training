package com.imdb.movie;

import java.util.List;


public abstract class Movie{

    private int id;
    public abstract String getOrigin();
    private String Name;
    private List<Director> directors;
    private List<String> genres;
    private int movieRating;

    private int trailerId;

    public Movie() {

    }
    public Movie(int id,String name, List<Director> directors, List<String> genres, int movieRating, int trailerId) {
        this.id = id;
        Name = name;
        this.directors = directors;
        this.genres = genres;
        this.movieRating = movieRating;
        this.trailerId = trailerId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public List<Director> getDirectors() {
        return directors;
    }

    public void setDirectors(List<Director> directors) {
        this.directors = directors;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public int getMovieRating() {
        return movieRating;
    }

    public void setMovieRating(int movieRating) {
        this.movieRating = movieRating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "Name='" + Name + '\'' +
                ", directors=" + directors +
                ", genres=" + genres +
                ", movieRating=" + movieRating +
                '}';
    }
}
