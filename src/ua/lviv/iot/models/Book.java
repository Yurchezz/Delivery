package ua.lviv.iot.models;

public class Book extends Good{
    private int pageCount;
    private String author;

    public Book(String name, int price, int pageCount, String author, Delivery delivery){
        super(name, price, delivery);
        this.pageCount = pageCount;
        this.author = author;
    }

    public int getPageCount(){
        return pageCount;
    }

    public void setPageCount(int pageCount){
        this.pageCount = pageCount;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
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
