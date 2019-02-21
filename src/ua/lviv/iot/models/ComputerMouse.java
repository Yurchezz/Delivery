package ua.lviv.iot.models;

public class ComputerMouse extends Good{
    private int buttonCount;
    private int cableLenth;


    public ComputerMouse(String name, int price, int buttonCount, int cableLenth, Delivery delivery){
        super(name, price, delivery);
        this.buttonCount = buttonCount;
        this.cableLenth = cableLenth;
    }

    public int getButtonCount(){
        return buttonCount;
    }

    public void setButtonCount(int buttonCount){
        this.buttonCount = buttonCount;
    }

    public int getCableLenth(){
        return cableLenth;
    }

    public void setCableLenth(int cableLenth){
        this.cableLenth = cableLenth;
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
    public String toString(){
        return super.toString();
    }
}
