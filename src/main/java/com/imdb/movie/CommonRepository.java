package com.imdb.movie;

public interface CommonRepository<T,V> {
    T getById(V id);
}
