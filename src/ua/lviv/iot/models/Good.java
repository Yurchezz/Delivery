package ua.lviv.iot.models;

 public abstract class Good{
    private String name;
    private int price;
    private Delivery delivery;

    public Good(String name, int price,Delivery delivery){
        this.name = name;
        this.price = price;
        this.delivery = delivery;
    }

     public Delivery getDelivery(){
         return delivery;
     }

     public void setDelivery(Delivery delivery){
         this.delivery = delivery;
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

     @Override
     public String toString(){
         return "Good {" +
                 "name = '" + name + '\'' +
                 ", price = " + price +
                 ", arrival date = " + delivery.getArrival().getDay() + "." +  delivery.getArrival().getMonth() +"."+ delivery.getArrival().getYear() +
                 ", duration = " + delivery.getDuration() +
                 '}';
     }
 }
