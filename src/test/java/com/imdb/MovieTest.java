package com.imdb;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
class MovieTest {

    @Test
    @DisplayName("Sort by Rating")
    void sort_by_rating() {
        Movie kgf = new Bollywood("kgf", List.of(new Director("Prashanth Neel")),Arrays.asList("Action"),9);
        Movie kgf2 = new Bollywood("kgf2", List.of(new Director("Prashanth Neel")),Arrays.asList("Action"),8);
        Movie kgf3 = new Bollywood("agf3", List.of(new Director("Prashanth Neel")),Arrays.asList("Action"),10);
        List<Movie> movies = List.of(kgf,kgf3,kgf2);

        MovieService movieService = new MovieService();
        List<Movie> sortedMovies = movieService.sortByRating(movies);
        List<Movie> expectedList = List.of(kgf3,kgf,kgf2);
        Assertions.assertThat(sortedMovies).isEqualTo(expectedList);
    }

    @Test
    void count()
    {
        Movie kgf = new Bollywood("kgf", List.of(new Director("Prashanth Neel")),Arrays.asList("Action"),9);
        Movie kgf2 = new Bollywood("kgf2", List.of(new Director("Prashanth Neel")),Arrays.asList("Action"),8);
        Movie kgf3 = new Bollywood("agf3", List.of(new Director("Prashanth Neel")),Arrays.asList("Action"),10);
        List<Movie> movies = List.of(kgf,kgf3,kgf2);
        MovieService movieService = new MovieService();
        Map<String,Long> countMap = movieService.getCount(movies);
        Assertions.assertThat(countMap.get("Prashanth Neel")).isEqualTo(3);
    }


    @Test
    void genreCount () {
        Movie kgf = new Bollywood("kgf", List.of(new Director("Prashanth Neel")),Arrays.asList("Action"),9);
        Movie kgf2 = new Bollywood("kgf2", List.of(new Director("Prashanth Neel")),Arrays.asList("Action"),8);
        Movie kgf3 = new Bollywood("agf3", List.of(new Director("Prashanth Neel")),Arrays.asList("Action"),10);
        List<Movie> movies = List.of(kgf,kgf3,kgf2);
        MovieService movieService = new MovieService();
        Map<String,Long>temp = movieService.getGenreCount(movies);
        Assertions.assertThat(temp.get("Action")).isEqualTo(3);
    }

    @Test
    void movieByGenre(){
        Movie kgf = new Bollywood("kgf", List.of(new Director("Prashanth Neel")),Arrays.asList("Action"),9);
        Movie kgf2 = new Bollywood("kgf2", List.of(new Director("Prashanth Neel")),Arrays.asList("Drama","Action"),8);
        Movie kgf3 = new Bollywood("agf3", List.of(new Director("Prashanth Neel")),Arrays.asList("Action"),10);
        List<Movie> movies = List.of(kgf,kgf3,kgf2);
        MovieService movieService = new MovieService();
        Map<String, List<Movie>> temp= movieService.getMovieByGenre(movies);
        Assertions.assertThat(temp.get("Action")).containsExactlyInAnyOrderElementsOf(List.of(kgf,kgf3,kgf2));

    }





}