package ua.lviv.iot.managers;

import ua.lviv.iot.models.Client;
import ua.lviv.iot.models.Delivery;
import ua.lviv.iot.models.Good;
import ua.lviv.iot.models.Shop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShopManager implements IDelivery{
    private List<Client> clients;
    private Shop shop;

    public ShopManager(List<Client> clients, Shop shop){
        this.clients = clients;
        this.shop = shop;
    }
    public void findDeliveryType(String deliveryName){

        for(int i = 0;i<shop.getCatalog().size();i++){
            if(shop.getCatalog().get(i).getDelivery().getName() == deliveryName){
                System.out.println(shop.getCatalog().get(i).getName() + ": " + shop.getCatalog().get(i).getDelivery().getName());
            }
        }


    }
    public List<Good> findGoodsRange(int lower, int higher){

        List<Good> result = new ArrayList<Good>();

        for(int i = 0;i<shop.getCatalog().size();i++){
            if(higher>shop.getCatalog().get(i).getPrice() && shop.getCatalog().get(i).getPrice()<lower){
                result.add(shop.getCatalog().get(i));
            }
        }

        return result;
    }


    public void sortByDeliveryByDurationFromLowerToHigher(){
        Collections.sort(shop.getCatalog(),(Good o1, Good o2) -> o1.getDelivery().getDuration() - o2.getDelivery().getDuration());
    }

    public void sortByArrivalDateFromLowerToHigher(){
        Collections.sort(shop.getCatalog(),(Good o1, Good o2) -> o1.getDelivery().getArrival().compareTo(o2.getDelivery().getArrival()));
    }

    public void sortByDeliveryByPriceFromLowerToHigher(){
        Collections.sort(shop.getCatalog(),(Good o1, Good o2) -> o1.getPrice() - o2.getPrice());
    }

    public void sortByDeliveryByDurationFromHigherToLower(){
        Collections.sort(shop.getCatalog(),Collections.reverseOrder((Good o1, Good o2) -> o2.getDelivery().getDuration() - o1.getDelivery().getDuration()));
    }

    public void sortByArrivalDateFromHigherToLower(){
        Collections.sort(shop.getCatalog(),(Good o1, Good o2) -> o1.getDelivery().getArrival().compareTo(o2.getDelivery().getArrival()));
    }

    public void sortByDeliveryByPriceFromHigherToLower(){
        Collections.sort(shop.getCatalog(),(Good o1, Good o2) -> o2.getPrice() - o1.getPrice());
    }
    public void showShopCatalog(){
        System.out.println("----------------------"+shop.getName()+"------Catalog-----------------------------");
        for (int i = 0;i<shop.getCatalog().size();i++){
            System.out.println(shop.getCatalog().get(i));
        }
        System.out.println("-------------------------------------------------------------------------------");
    }



}
