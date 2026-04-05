package model;
public abstract class Ticket {
    protected int seatNumber; protected double price;
    public Ticket(int seat){ this.seatNumber=seat; }
    public int getSeatNumber(){ return seatNumber; }
    public double getPrice(){ return price; }
    public abstract void calculatePrice();
}