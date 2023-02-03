package com.imdb;

import java.util.List;

class Director{
    private String name;
    public Director(){}
    public Director(String name)
    {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Director{" +
                "name='" + name + '\'' +
                '}';
    }
}
abstract class Movie{

    abstract String getOrigin();
    private String Name;
    private List<Director> directors;
    private List<String> genres;
    private int movieRating;

    public Movie() {

    }
    public Movie(String name, List<Director> directors, List<String> genres, int movieRating) {
        Name = name;
        this.directors = directors;
        this.genres = genres;
        this.movieRating = movieRating;
    }

    public void watchTrailer(){
            getTrailer();
    }

    private void getTrailer() throws RuntimeException {
    throw new TrailerNotFoundException("TrailerNotFound");
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
