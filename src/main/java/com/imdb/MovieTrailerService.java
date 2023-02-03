package com.imdb;

public class MovieTrailerService {
    private MovieTrailerRepository movieTrailerRepository;
    MovieTrailerService(MovieTrailerRepository M)
    {
        this.movieTrailerRepository=M;
    }
    public Trailer getTrailer(int id){
        return this.movieTrailerRepository.fetchTrailer(id);
    }
}
