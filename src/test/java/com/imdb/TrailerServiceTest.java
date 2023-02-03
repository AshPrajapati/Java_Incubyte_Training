package com.imdb;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.imdb.movie.trailer.TrailerRepository;
import com.imdb.movie.trailer.Trailer;
import com.imdb.movie.trailer.TrailerService;
class TrailerServiceTest {
    @Test
    public void getTrailer()
    {
        TrailerRepository trailerRepository = Mockito.mock(TrailerRepository.class);
        String trailerUrl = "https://trailers.com/dhamal";
        Trailer trailer = new Trailer(trailerUrl);
        Mockito.when(trailerRepository.getById(1)).thenReturn(trailer);

        TrailerService trailerService = new TrailerService(trailerRepository);

        //when
        String actualUrl = trailerService.getTrailer(1);

        //then
        Mockito.verify(trailerRepository).getById(1);
        Assertions.assertThat(actualUrl).isEqualTo(trailerUrl);

    }
}