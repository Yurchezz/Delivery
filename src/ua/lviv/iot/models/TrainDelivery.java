package ua.lviv.iot.models;

import java.util.Date;

public class TrainDelivery extends Delivery{
    private Location startStorage;
    private Location finalStorage;
    private Train train;

    public TrainDelivery(String name,int price, int duration, Location startStorage, Location finalStorage, Train train, Date arrival){
        super(name, price, duration, arrival);
        this.startStorage = startStorage;
        this.finalStorage = finalStorage;
        this.train = train;
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

    public Train getTrain(){
        return train;
    }

    public void setTrain(Train train){
        this.train = train;
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
    public String toString(){
        return super.toString();
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
}
