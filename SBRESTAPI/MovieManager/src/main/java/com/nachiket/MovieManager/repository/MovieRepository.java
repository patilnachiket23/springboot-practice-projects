package com.nachiket.MovieManager.repository;

import com.nachiket.MovieManager.entity.Movie;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class MovieRepository {

    private final Map<Long, Movie> moviedb = new HashMap<>();

    @PostConstruct
    public void loadDummyData(){
        moviedb.put(1L,new Movie(1L,"KGF","Action",9.8,2022,"Hindi"));
        moviedb.put(2L,new Movie(2L,"Pushpa","Action romance",9.2,2023,"Tamil"));
        moviedb.put(3L,new Movie(3L,"Bhaubali","Action Drama",8.1,2021,"Telugu"));
        moviedb.put(4L,new Movie(4L,"Avatar","Sc-Fi",8.2,2011,"English"));
    }


    public List<Movie> getAllMovies(){
        return new ArrayList<>(moviedb.values());
    }

    public Movie getMovieByID(Long id){
        return moviedb.get(id);
    }

    public List<Movie> searchMovieByName(String name){
        List<Movie> movieList = new ArrayList<>();
        for(Movie movie: moviedb.values()){
            if(movie.getName().equals(name)){
                movieList.add(movie);
            }
        }
        return movieList;
    }

    //HW
    public List<Movie> searchMovieByYear(Integer year){
        List<Movie> movieList = new ArrayList<>();
        for(Movie movie: moviedb.values()){
            if(movie.getYear().equals(year)){
                movieList.add(movie);
            }
        }
        return movieList;
    }

    //HW
    public List<Movie> serachMovieByRating(Double rating){
        return moviedb.values().stream().filter(movie -> movie.getRating()!= null &&
                movie.getRating().equals(rating))
                .collect(Collectors.toList());
    }

    public Movie addMovie(Movie movie){
        moviedb.put(movie.getId(), movie);
        return movie;
    }

    public Movie deletMovie(Long id){
        return moviedb.remove(id);
    }

    public Movie updateMovie(Long id, Movie movie){
        moviedb.put(id,movie);
        return movie;
    }

}
