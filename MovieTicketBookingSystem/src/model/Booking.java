package model;
import java.util.*;
public class Booking {
    private User user; private Show show;
    private List<Ticket> bookedTickets = new ArrayList<>();
    public Booking(User u, Show s){ user=u; show=s;}
    public void addTicket(Ticket t){
        if(show.getTickets().contains(t)){ bookedTickets.add(t);
            System.out.println("Seat "+t.getSeatNumber()+" booked"); }
        else System.out.println("Invalid seat!");
    }
    public double total(){ return bookedTickets.stream().mapToDouble(Ticket::getPrice).sum();}
    public void display(){ 
        System.out.println("User: "+user.getName());
        System.out.println("Movie: "+show.getMovie().getTitle()+" at "+show.getTime());
        System.out.println("Tickets: "+bookedTickets.size()+", Total: $"+total());
    }
}