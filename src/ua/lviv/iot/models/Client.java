package ua.lviv.iot.models;

import java.util.List;

public abstract class Client{
    private String name;
    private Location home;
    private int cash;
    private List<Good> orderedGoods;

    public Client(){
        this("undefined",new Location(),0);
    }

    public Client(String name, Location home, int cash){
        this.name = name;
        this.home = home;
        this.cash = cash;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Location getHome(){
        return home;
    }

    public void setHome(Location home){
        this.home = home;
    }

    public int getCash(){
        return cash;
    }

    public void setCash(int cash){
        this.cash = cash;
    }

    @Override
    public String toString(){
        return "Client{" +
                "name='" + name + '\'' +
                ", home=" + home +
                ", cash=" + cash +
                '}';
    }
}
