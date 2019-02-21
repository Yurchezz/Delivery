package ua.lviv.iot.models;

import java.util.Date;

public class PlaneDelivery extends Delivery{
    private Location startAiroport;
    private Location finalAiroport;
    private Plane plane;

    public PlaneDelivery(String name, int price, int duration, Location startAiroport, Location finalAiroport, Plane plane, Date arrival){
        super(name, price, duration, arrival);
        this.startAiroport = startAiroport;
        this.finalAiroport = finalAiroport;
        this.plane = plane;
    }

    public Location getStartAiroport(){
        return startAiroport;
    }

    public void setStartAiroport(Location startAiroport){
        this.startAiroport = startAiroport;
    }

    public Location getFinalAiroport(){
        return finalAiroport;
    }

    public void setFinalAiroport(Location finalAiroport){
        this.finalAiroport = finalAiroport;
    }

    public Plane getPlane(){
        return plane;
    }

    public void setPlane(Plane plane){
        this.plane = plane;
    }

    @Override
    public int getPrice(){
        return super.getPrice();
    }

    @Override
    public void setPrice(int price){
        super.setPrice(price);
    }

    @Override
    public int getDuration(){
        return super.getDuration();
    }

    @Override
    public void setDuration(int duration){
        super.setDuration(duration);
    }

    @Override
    public Client getClient(){
        return super.getClient();
    }

    @Override
    public void setClient(Client client){
        super.setClient(client);
    }

    @Override
    public String getName(){
        return super.getName();
    }

    @Override
    public void setName(String name){
        super.setName(name);
    }

    @Override
    public Date getArrival(){
        return super.getArrival();
    }

    @Override
    public void setArrival(Date arrival){
        super.setArrival(arrival);
    }

    @Override
    public String toString(){
        return "PlaneDelivery{" +
                "startAiroport=" + startAiroport +
                ", finalAiroport=" + finalAiroport +
                ", plane=" + plane +
                '}';
    }
}
