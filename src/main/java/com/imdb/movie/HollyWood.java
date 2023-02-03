package com.imdb.movie;

import java.util.List;

public class HollyWood extends Movie {
    public HollyWood(int id, String name, List<Director> directors, List<String> genres, int movieRating, int trailerId) {
        super(id, name, directors, genres, movieRating, trailerId);
    }

    @Override
    public String getOrigin() {
        return "USA";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
