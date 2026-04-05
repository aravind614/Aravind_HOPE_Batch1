package util;
import model.Ticket;
import model.Show;
public class ValidationUtil {
    public static boolean isValidTicket(Show show, Ticket ticket){
        return show.getTickets().contains(ticket);
    }
}