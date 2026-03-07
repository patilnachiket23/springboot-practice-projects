package com.nachiket.MovieManager.service;

import com.nachiket.MovieManager.entity.Movie;
import com.nachiket.MovieManager.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> getAllMovies(){
        return movieRepository.getAllMovies();
    }
    public Movie getMovieById(Long id){
        return movieRepository.getMovieByID(id);
    }
    public List<Movie> searchMovieByName(String name){
        return movieRepository.searchMovieByName(name);
    }
    public List<Movie> searchMovieByYear(Integer year){
        return movieRepository.searchMovieByYear(year);
    }
    public List<Movie> searchMovieByRating(Double rating){
        return movieRepository.serachMovieByRating(rating);
    }

    public Movie addMovie(Movie movie){
        return movieRepository.addMovie(movie);
    }

    public Movie deletMovie(Long id){
        return  movieRepository.deletMovie(id);
    }

    public Movie updateMovie(Long id, Movie movie){
        return movieRepository.updateMovie(id,movie);
    }
}
