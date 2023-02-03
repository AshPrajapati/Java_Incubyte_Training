package com.imdb;

public class TrailerNotFoundException extends RuntimeException {
    public TrailerNotFoundException(String message) {
        super(message);
    }
}
