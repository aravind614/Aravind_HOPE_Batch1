package model;
public class RegularTicket extends Ticket {
    public RegularTicket(int seat){ super(seat); calculatePrice(); }
    public void calculatePrice(){ price=10.0; }
}