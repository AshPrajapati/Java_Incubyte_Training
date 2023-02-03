package com.imdb.movie;

public class MovieService {
    private MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Movie getMovie(int id)
    {
        return movieRepository.getById(id);
    }
}
