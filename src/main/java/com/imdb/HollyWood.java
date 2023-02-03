package com.imdb;

import java.util.List;

public class HollyWood extends Movie{
    public HollyWood(String name, List<Director> directors, List<String> genres, int movieRating) {
        super(name, directors, genres, movieRating);
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
