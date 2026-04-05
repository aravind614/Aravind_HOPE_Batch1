package model;
public class VIPTicket extends Ticket {
    public VIPTicket(int seat){ super(seat); calculatePrice(); }
    public void calculatePrice(){ price=20.0; }
}