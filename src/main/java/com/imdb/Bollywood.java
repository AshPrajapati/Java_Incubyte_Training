package com.imdb;

import java.util.List;

public class Bollywood extends Movie{
    public Bollywood(String name, List<Director> directors, List<String> genres, int movieRating) {
        super(name, directors, genres, movieRating);
    }

    @Override
    public String getOrigin(){
        return "India";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
