package com.imdb;

import java.util.*;
import java.util.stream.Collectors;
public class MovieService {
    public List<Movie> sortByRating(List<Movie> movies) {
        Comparator<Movie> ratingComparator = Comparator.comparingDouble(Movie::getMovieRating);
        Comparator<Movie> nameComparator = Comparator.comparing(Movie::getName);
        return movies.stream().sorted(nameComparator).collect(Collectors.toList());
    }

    public Map<String, Long> getCount(List<Movie> movies) {
        return movies.stream().
                map(movie -> movie.getDirectors()).
                flatMap(List::stream).
                collect(Collectors.groupingBy(Director::getName, Collectors.counting()));
    }

    public Map<String, Long> getGenreCount(List<Movie> movies) {

        return movies.stream().
                map(movie -> movie.getGenres()).
                flatMap(List::stream).
                collect(Collectors.groupingBy(g -> g, Collectors.counting()));
    }

    public Map<String,List<Movie>> getMovieByGenre(List<Movie> movies) {
        Map<String,List<Movie>> mp = new HashMap<>();
        for(Movie m:movies)
        {
            for(String genreName:m.getGenres())
            {
                if(mp.containsKey(genreName))
                {
                    ArrayList<Movie> lst = (ArrayList<Movie>) mp.get(genreName);
                    lst.add(m);
                    mp.put(genreName,lst);
                }
                else
                {
                    List<Movie> lst = new ArrayList<>();
                    lst.add(m);
                    mp.put(genreName,lst);
                }
            }
        }
        return mp;
    }
}
