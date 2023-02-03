package com.imdb;

import com.imdb.movie.Bollywood;
import com.imdb.movie.Director;
import com.imdb.movie.HollyWood;
import com.imdb.movie.Movie;
import org.junit.jupiter.api.Test;

import java.util.List;

import org.assertj.core.api.Assertions;

class MoviesTest {

    @Test
   void originTest  () {
        Movie b = new Bollywood(1,"Krish",List.of(new Director("Mr.xyz")),List.of("Action","Drama"),10,1);
        Movie h = new HollyWood(2,"KrishHollywoordWale", List.of(new Director("Mr.xyz")),List.of("Action","Drama"),10,2);
        Assertions.assertThat(b.getOrigin()).isEqualTo("India");
        Assertions.assertThat(h.getOrigin()).isEqualTo("USA");
    }
    }