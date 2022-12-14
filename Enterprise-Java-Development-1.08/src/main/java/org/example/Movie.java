package org.example;

public class Movie extends Video{
    private String director;

    public Movie(String title, String genre, int duration, String director) {
        super(title, genre, duration);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
