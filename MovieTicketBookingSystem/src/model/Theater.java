package model;
public class Theater {
    private String name; 
    private int screen, capacity;
    public Theater(String name, int screen, int capacity){
        this.name=name; this.screen=screen; this.capacity=capacity;
    }
    public String getName(){ return name; }
}