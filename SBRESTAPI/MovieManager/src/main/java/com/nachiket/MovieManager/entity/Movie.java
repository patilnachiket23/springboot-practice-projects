package com.nachiket.MovieManager.entity;

public class Movie {
    private Long id;
    private String name;
    private String type;
    private Double rating;
    private Integer year;
    private String language;

    public Movie() {
    }

    public Movie(Long id, String name, String type, Double rating, Integer year, String language) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.rating = rating;
        this.year = year;
        this.language = language;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", rating=" + rating +
                ", year=" + year +
                ", language='" + language + '\'' +
                '}';
    }
}
