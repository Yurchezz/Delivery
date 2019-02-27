package ua.lviv.iot.managers;

import ua.lviv.iot.models.Good;

import java.util.List;

public interface IDelivery {
    void findDeliveryType(String deliveryType);

    List<Good> findGoodsRange(int lower, int higher);

    void sortByDeliveryByDurationFromLowerToHigher();

    void sortByArrivalDateFromLowerToHigher();

    void sortByDeliveryByPriceFromLowerToHigher();

    void sortByDeliveryByDurationFromHigherToLower();

    void sortByArrivalDateFromHigherToLower();

    void sortByDeliveryByPriceFromHigherToLower();

    void showShopCatalog();
}

