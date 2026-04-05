package model;
import java.util.*;
public class User {
    private String name,email; 
    private List<Booking> bookings = new ArrayList<>();
    public User(String n,String e){name=n;email=e;}
    public void addBooking(Booking b){ bookings.add(b);}
    public List<Booking> getBookings(){ return bookings; }
    public String getName(){ return name; }
}