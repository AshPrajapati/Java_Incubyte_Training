package com.imdb;

import org.junit.jupiter.api.Test;

import java.util.List;

import org.assertj.core.api.Assertions;

class MoviesTest {

    @Test
   void originTest  () {
        Movie b = new Bollywood("Krish",List.of(new Director("Mr.xyz")),List.of("Action","Drama"),10);
        Movie h = new HollyWood("KrishHollywoordWale", List.of(new Director("Mr.xyz")),List.of("Action","Drama"),10);
        Assertions.assertThat(b.getOrigin()).isEqualTo("India");
        Assertions.assertThat(h.getOrigin()).isEqualTo("USA");
    }
    @Test
    void exceptionTest () {
        Movie b = new Bollywood("Krish",List.of(new Director("Mr.xyz")),List.of("Action","Drama"),10);
        Assertions.assertThatThrownBy(() -> {b.watchTrailer(); }).isInstanceOf(RuntimeException.class)
                .hasMessageContaining("TrailerNotFound");


    }}