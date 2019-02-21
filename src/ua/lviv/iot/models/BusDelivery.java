package ua.lviv.iot.models;

import java.util.Date;

public class BusDelivery extends Delivery{
    private Location startStorage;
    private Location finalStorage;
    private Bus bus;

    public BusDelivery(String name, int price, int duration, Location startStorage, Location finalStorage, Bus bus, Date arrival){
        super(name, price, duration,arrival);
        this.startStorage = startStorage;
        this.finalStorage = finalStorage;
        this.bus = bus;
    }

    public Location getStartStorage(){
        return startStorage;
    }

    public void setStartStorage(Location startStorage){
        this.startStorage = startStorage;
    }

    public Location getFinalStorage(){
        return finalStorage;
    }

    public void setFinalStorage(Location finalStorage){
        this.finalStorage = finalStorage;
    }

    public Bus getBus(){
        return bus;
    }

    public void setBus(Bus bus){
        this.bus = bus;
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
    public Date getArrival(){
        return super.getArrival();
    }

    @Override
    public void setArrival(Date arrival){
        super.setArrival(arrival);
    }

    @Override
    public String toString(){
        return "BusDelivery{" +
                "startStorage=" + startStorage +
                ", finalStorage=" + finalStorage +
                ", bus=" + bus +
                '}';
    }
}
