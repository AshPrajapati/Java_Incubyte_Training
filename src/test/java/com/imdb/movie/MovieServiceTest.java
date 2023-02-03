package com.imdb.movie;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

class MovieServiceTest {

    @Test
    void getMovie()
    {
        Movie kgf = new Bollywood(1,"kgf", List.of(new Director("Prashanth Neel")), Arrays.asList("Action"),9,1);
        MovieRepository movieRepository = Mockito.mock(MovieRepository.class);

        Mockito.when(movieRepository.getById(1)).thenReturn(kgf);
        MovieService movieService = new MovieService(movieRepository);
        //when

        Movie actualMovie = movieService.getMovie(1);

        Mockito.verify(movieRepository).getById(1);

        Assertions.assertThat(actualMovie).isEqualTo(kgf);
    }
}