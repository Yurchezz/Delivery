package ua.lviv.iot.models;

import ua.lviv.iot.managers.ShopManager;
import java.util.*;

public class Main {
    public static void main(String[]args) {
        Location start = new Location(
                100,
                100);
        Location end = new Location(
                200,
                200);

        Plane ant25 = new Plane(
                "ANT25",
                10000,
                10);
        Plane ant20 = new Plane(
                "ANT20",
                5000,
                10);

        Train interCity = new Train(
                "InterCity",
                15);

        Bus doubleDecker = new Bus(
                "Double Decker",
                100);

        PlaneDelivery ukrAirTransport = new PlaneDelivery(
                "SlavaUkraini",
                100,
                1220,
                start,
                end,
                ant20,
                new Date(
                        2019,
                        4,
                        21));
        PlaneDelivery plAirTransport = new PlaneDelivery(
                "SmertVorogam",
                100,
                200,
                start,
                end,
                ant20,
                new Date(
                        2019,
                        4,
                        22));

        TrainDelivery ukrRailway = new TrainDelivery(
                "UrkRailway",
                1000,
                120,
                start,
                end,
                interCity,
                new Date(
                        2020,
                        4,
                        21));

        BusDelivery dhl = new BusDelivery(
                "DHL",
                200,
                57,
                start,
                end,
                doubleDecker,
                new Date(
                        2030,
                        1,
                        2));

        Book tarasBulba = new Book(
                "Taras Bulba",
                500,
                400,
                "Nikolya Gogol",
                ukrAirTransport);
        Book kobzar = new Book(
                "Kobzar",
                700,
                1000,
                "Taras Shevchenko",
                plAirTransport);

        MacBook proRetina13 = new MacBook(
                "Pro Retina 13",
                1250,
                13,
                13,
                ukrRailway);

        ComputerMouse g403 = new ComputerMouse(
                "Logitech g403",
                60,
                5,
                2,
                dhl);
        ComputerMouse netscroll20 = new ComputerMouse(
                "Genius netscroll 120",
                5,
                2,
                1,
                dhl);

        Housewife marta = new Housewife(
                "Marta",
                end,
                1000);
        Housewife nina = new Housewife(
                "Nina",
                end,
                100);

        ArrayList<Good> amazonCatalog = new ArrayList<Good>();
        amazonCatalog.add(tarasBulba);
        amazonCatalog.add(kobzar);
        amazonCatalog.add(proRetina13);
        amazonCatalog.add(g403);
        amazonCatalog.add(netscroll20);

        ArrayList<Client> amazonClients = new ArrayList<Client>();
        amazonClients.add(marta);
        amazonClients.add(nina);
        Shop amazon = new Shop(
                "amazon",
                "amazon.com",
                amazonCatalog);

        ShopManager amazonManager = new ShopManager(amazon);

        amazonManager.showShopCatalog();
        amazonManager.sortByDeliveryByPriceFromLowerToHigher();
        amazonManager.showShopCatalog();
        amazonManager.sortByArrivalDateFromLowerToHigher();
        amazonManager.showShopCatalog();
        amazonManager.sortByDeliveryByDurationFromLowerToHigher();
        amazonManager.showShopCatalog();
    }
}
/**
 *
 *additional transport for another shops
 *
 * Train ChS2 = new Train("ChS2",15);
 * Bus sprinter = new Bus("Sprinter",200);
 *
 */

/**
 *
 *additional goods for another shops
 *
 * MacBook proRetina15 = new MacBook(
 * "Pro Retina 15",
 * 2250,
 * 15,
 * 17,
 * fedEx);
 *
 * MacBook airRetina13 = new MacBook(
 * "Air Retina 13",
 * 1200,
 * 13,
 * 13,
 * plRailway);
 *
 * Book garryPotter = new Book(
 * "Garry Potter",
 * 100,
 * 250,
 * "Joahn Louling",
 * ukrRailway);
 *
 * ComputerMouse razerChampion = new ComputerMouse(
 * "Razor Champion",
 * 100,
 * 10,
 * 2,
 * DHL);
 *
 */
/**
 *
 * aditional deliveries for another shops
 *
 *  TrainDelivery plRailway = new TrainDelivery("PlRailway",100,109,start,end,ChS2, new Date(2019,5,27));
 *  BusDelivery fedEx = new BusDelivery("FedEx",100,1000,start,end,sprinter, new Date(2025,4,21))

 */
