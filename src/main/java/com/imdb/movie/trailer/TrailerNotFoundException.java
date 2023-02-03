package com.imdb.movie.trailer;

public class TrailerNotFoundException extends RuntimeException {
    public TrailerNotFoundException(String message) {
        super(message);
    }
}
