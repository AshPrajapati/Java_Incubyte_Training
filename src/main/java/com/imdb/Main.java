package com.imdb;

import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
       Bollywood b =new Bollywood("kgf",List.of(new Director("MRbean")),Arrays.asList("Action"),9);
       System.out.println(b.getOrigin());
       System.out.println(b);

       b.watchTrailer();

    }
}
