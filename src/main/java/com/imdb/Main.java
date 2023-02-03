package com.imdb;

import com.imdb.movie.Bollywood;
import com.imdb.movie.Director;

import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
       Bollywood b =new Bollywood(1,"kgf",List.of(new Director("MRbean")),Arrays.asList("Action"),9,1);
       System.out.println(b.getOrigin());
       System.out.println(b);
    }
}
