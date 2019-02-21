package ua.lviv.iot.models;

import java.util.Date;

public abstract class Delivery{
    private String name;
    private int price;
    private int duration;
    private Client client;
    private Date arrival;

    public Delivery(String name, int price, int duration ,Date arrival){
        this.price = price;
        this.duration = duration;
        this.name = name;
        this.arrival = arrival;
    }


    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }


    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public int getDuration(){
        return duration;
    }

    public void setDuration(int duration){
        this.duration = duration;
    }

    public Client getClient(){
        return client;
    }

    public void setClient(Client client){
        this.client = client;
    }

    public Date getArrival(){
        return arrival;
    }

    public void setArrival(Date arrival){
        this.arrival = arrival;
    }

    @Override
    public String toString(){
        return "Delivery{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", duration=" + duration +
                ", client=" + client +
                ", arrival=" + arrival +
                '}';
    }
}
