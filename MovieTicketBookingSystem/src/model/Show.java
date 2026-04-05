package model;
import java.util.*;
public class Show {
    private Movie movie; private Theater theater; private String time;
    private List<Ticket> tickets = new ArrayList<>();
    public Show(Movie m, Theater t, String time){ this.movie=m; this.theater=t; this.time=time;}
    public void addTicket(Ticket t){ tickets.add(t);}
    public List<Ticket> getTickets(){ return tickets; }
    public Movie getMovie(){ return movie; }
    public String getTime(){ return time; }
}