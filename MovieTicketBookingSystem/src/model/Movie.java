package model;
public class Movie {
    private String title, genre;
    private int duration;
    public Movie(String title, String genre, int duration){
        this.title = title; this.genre = genre; this.duration = duration;
    }
    public String getTitle(){ return title; }
}