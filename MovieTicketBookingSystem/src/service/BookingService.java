package service;
import model.*;
public class BookingService {
    public Booking createBooking(User user, Show show){
        return new Booking(user, show);
    }
}