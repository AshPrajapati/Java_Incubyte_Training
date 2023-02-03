package com.imdb;

import java.util.Objects;

public class Trailer {
    private Integer id;
    private String url;

    public Trailer(Integer id, String url) {
        this.id = id;
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trailer trailer = (Trailer) o;
        return Objects.equals(id, trailer.id) && Objects.equals(url, trailer.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, url);
    }
}
