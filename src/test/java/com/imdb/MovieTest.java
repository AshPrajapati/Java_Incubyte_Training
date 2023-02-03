package com.imdb;

import com.imdb.movie.Director;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.imdb.movie.Bollywood;
import com.imdb.movie.Movie;
import com.imdb.movie.MovieUtils;
class MovieTest {

    @Test
    @DisplayName("Sort by Rating")
    void sort_by_rating() {

        Movie kgf = new Bollywood(1,"kgf", List.of(new Director("Prashanth Neel")),Arrays.asList("Action"),9,1);
        Movie kgf2 = new Bollywood(1,"kgf2", List.of(new Director("Prashanth Neel")),Arrays.asList("Action"),8,2);
        Movie kgf3 = new Bollywood(3,"agf3", List.of(new Director("Prashanth Neel")),Arrays.asList("Action"),10,3);
        List<Movie> movies = List.of(kgf,kgf3,kgf2);

        MovieUtils movieUtils = new MovieUtils();
        List<Movie> sortedMovies = movieUtils.sortByRating(movies);
        List<Movie> expectedList = List.of(kgf3,kgf,kgf2);
        Assertions.assertThat(sortedMovies).isEqualTo(expectedList);
    }

    @Test
    void count()
    {
        Movie kgf = new Bollywood(1,"kgf", List.of(new Director("Prashanth Neel")),Arrays.asList("Action"),9,1);
        Movie kgf2 = new Bollywood(1,"kgf2", List.of(new Director("Prashanth Neel")),Arrays.asList("Action"),8,2);
        Movie kgf3 = new Bollywood(3,"agf3", List.of(new Director("Prashanth Neel")),Arrays.asList("Action"),10,3);
        List<Movie> movies = List.of(kgf,kgf3,kgf2);
        MovieUtils movieUtils = new MovieUtils();
        Map<String,Long> countMap = movieUtils.getCount(movies);
        Assertions.assertThat(countMap.get("Prashanth Neel")).isEqualTo(3);
    }


    @Test
    void genreCount () {
        Movie kgf = new Bollywood(1,"kgf", List.of(new Director("Prashanth Neel")),Arrays.asList("Action"),9,1);
        Movie kgf2 = new Bollywood(1,"kgf2", List.of(new Director("Prashanth Neel")),Arrays.asList("Action"),8,2);
        Movie kgf3 = new Bollywood(3,"agf3", List.of(new Director("Prashanth Neel")),Arrays.asList("Action"),10,3);
        List<Movie> movies = List.of(kgf,kgf3,kgf2);
        MovieUtils movieUtils = new MovieUtils();
        Map<String,Long>temp = movieUtils.getGenreCount(movies);
        Assertions.assertThat(temp.get("Action")).isEqualTo(3);
    }

    @Test
    void movieByGenre(){
        Movie kgf = new Bollywood(1,"kgf", List.of(new Director("Prashanth Neel")),Arrays.asList("Action"),9,1);
        Movie kgf2 = new Bollywood(1,"kgf2", List.of(new Director("Prashanth Neel")),Arrays.asList("Action"),8,2);
        Movie kgf3 = new Bollywood(3,"agf3", List.of(new Director("Prashanth Neel")),Arrays.asList("Action"),10,3);
        List<Movie> movies = List.of(kgf,kgf3,kgf2);
        MovieUtils movieUtils = new MovieUtils();
        Map<String, List<Movie>> temp= movieUtils.getMovieByGenre(movies);
        Assertions.assertThat(temp.get("Action")).containsExactlyInAnyOrderElementsOf(List.of(kgf,kgf3,kgf2));

    }





}