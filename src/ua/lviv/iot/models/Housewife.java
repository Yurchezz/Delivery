package ua.lviv.iot.models;

public class Housewife extends Client{

    HouseWifePreferences houseWifePreferences;

    public Housewife(){
        super("undefined",new Location(),0);
    }

    public Housewife(String name, Location home, int cash){
        super(name, home, cash);
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
    public Location getHome(){
        return super.getHome();
    }

    @Override
    public void setHome(Location home){
        super.setHome(home);
    }

    @Override
    public int getCash(){
        return super.getCash();
    }

    @Override
    public void setCash(int cash){
        super.setCash(cash);
    }

    @Override
    public String toString(){
        return super.toString();
    }
    
}
