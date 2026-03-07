package com.nachiket.MovieManager.controller;


import com.nachiket.MovieManager.entity.Movie;
import com.nachiket.MovieManager.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping
    public List<Movie> getAllMovie(){
        return movieService.getAllMovies();
    }

    @GetMapping("/{id}")
    public Movie getMovieById(@PathVariable Long id){
        return movieService.getMovieById(id);
    }

    @GetMapping("/name")
    public List<Movie> searchMovieByName(@RequestParam String name){
        return movieService.searchMovieByName(name);
    }
    @GetMapping("/year")
    public List<Movie> searchMovieByYear(@RequestParam Integer year){
        return movieService.searchMovieByYear(year);
    }
    @GetMapping("/rating")
    public List<Movie> searchMovieByRating(@RequestParam Double rating){
        return movieService.searchMovieByRating(rating);
    }

    @PostMapping
    public Movie addMovie(@RequestBody Movie movie){
        return movieService.addMovie(movie);
    }

    @DeleteMapping("/{id}")
    public Movie deleteMovie(@PathVariable Long id){
        return movieService.deletMovie(id);
    }

    @PutMapping("/{id}")
    public Movie updateMovie(@PathVariable Long id, @RequestBody Movie movie){
        return movieService.updateMovie(id,movie);
    }
}
