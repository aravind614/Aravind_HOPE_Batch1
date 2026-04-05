package main;
import model.*;
import service.*;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Movie movie = new Movie("Avengers","Action",180);
        Theater theater = new Theater("PVR",1,50);
        Show show = new Show(movie,theater,"18:00");

        // Add tickets
        for(int i=1;i<=5;i++) show.addTicket(new RegularTicket(i));
        for(int i=6;i<=8;i++) show.addTicket(new VIPTicket(i));

        User user = new User("Aravind","aravind@example.com");
        BookingService service = new BookingService();
        Booking booking = service.createBooking(user,show);

        booking.addTicket(show.getTickets().get(0));
        booking.addTicket(show.getTickets().get(6));

        user.addBooking(booking);
        booking.display();
    }
}