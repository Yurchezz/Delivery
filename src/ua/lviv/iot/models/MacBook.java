package ua.lviv.iot.models;

public class MacBook extends Good{
    private int displayDiagonal;
    private int manufactureYear;


    public MacBook(String name, int price, int displayDiagonal, int manufactureYear,Delivery delivery){
        super(name, price, delivery);
        this.displayDiagonal = displayDiagonal;
        this.manufactureYear = manufactureYear;
    }


    public int getDisplayDiagonal(){
        return displayDiagonal;
    }

    public void setDisplayDiagonal(int displayDiagonal){
        this.displayDiagonal = displayDiagonal;
    }

    public int getManufactureYear(){
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear){
        this.manufactureYear = manufactureYear;
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
        return
                super.toString();
    }
}
