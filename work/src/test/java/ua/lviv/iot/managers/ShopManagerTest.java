package ua.lviv.iot.managers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ua.lviv.iot.models.*;

import java.util.ArrayList;
import java.util.Date;

public class ShopManagerTest{

    private Location start = new Location(
            100,
            100);

    private Location end = new Location(
            200,
            200);

    private Plane ant20 = new Plane(
            "ANT20",
            5000,
            10);

    private Train interCity = new Train(
            "InterCity",
            15);

    private Bus doubleDecker = new Bus(
            "Double Decker",
            100);

    private PlaneDelivery ukrAirTransport = new PlaneDelivery(
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

    private PlaneDelivery plAirTransport = new PlaneDelivery(
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

    private TrainDelivery ukrRailway = new TrainDelivery(
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

    private BusDelivery dhl = new BusDelivery(
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

    private Book tarasBulba = new Book(
            "Taras Bulba",
            500,
            400,
            "Nikolya Gogol",
            ukrAirTransport);

    private Book kobzar = new Book(
            "Kobzar",
            700,
            1000,
            "Taras Shevchenko",
            plAirTransport);

    private MacBook proRetina13 = new MacBook(
            "Pro Retina 13",
            1250,
            13,
            13,
            ukrRailway);

    private ComputerMouse g403 = new ComputerMouse(
            "Logitech g403",
            60,
            5,
            2,
            dhl);

    private ComputerMouse netscroll20 = new ComputerMouse(
            "Genius netscroll 120",
            5,
            2,
            1,
            dhl);

    private ArrayList<Good> testShopCatalog = new ArrayList<Good>();

    private Shop testShop = new Shop(
            "testShop",
            "testShop.com",
            testShopCatalog);

    private Housewife marta = new Housewife(
            "Marta",
            end,
            1000);

    private Housewife nina = new Housewife(
            "Nina",
            end,
            100);

    private ArrayList<Client> amazonClients = new ArrayList<Client>();

    private ShopManager testShopManager = new ShopManager(
            testShop,
            amazonClients);

    @Before
    public void setUp() throws Exception{

        amazonClients.add(marta);
        amazonClients.add(nina);

        testShopCatalog.add(tarasBulba);
        testShopCatalog.add(kobzar);
        testShopCatalog.add(proRetina13);
        testShopCatalog.add(g403);
        testShopCatalog.add(netscroll20);

    }

    @Test
    public void findDeliveryType() {

           Assert.assertEquals(proRetina13, testShopManager.findDeliveryType("UrkRailway").get(0));

    }

    @Test
    public void findGoodsRange() {

        Assert.assertEquals(5, testShopManager.findGoodsRange(1, 100000).size());
        Assert.assertEquals(tarasBulba, testShopManager.findGoodsRange(1, 100000).get(0));


    }

    @Test
    public void sortByDeliveryByDurationFromLowerToHigher() {

            testShopManager.sortByDeliveryDuration(true);

            Assert.assertEquals(57, testShopManager.getShop().getCatalog().get(0).getDelivery().getDuration());
            Assert.assertEquals(57, testShopManager.getShop().getCatalog().get(1).getDelivery().getDuration());
            Assert.assertEquals(120, testShopManager.getShop().getCatalog().get(2).getDelivery().getDuration());

    }

    @Test
    public void sortByArrivalDateFromLowerToHigher() {

        testShopManager.sortByArrivalDate(true);

        Assert.assertEquals(new Date(2019,4,21), testShopManager.getShop().getCatalog().get(0).getDelivery().getArrival());
        Assert.assertEquals(new Date(2019,4,22), testShopManager.getShop().getCatalog().get(1).getDelivery().getArrival());
        Assert.assertEquals(new Date(2020,4,21), testShopManager.getShop().getCatalog().get(2).getDelivery().getArrival());

    }

    @Test
    public void sortByDeliveryPriceFromLowerToHigher() {

        testShopManager.sortByDeliveryPrice(true);
        Assert.assertEquals(100,testShopManager.getShop().getCatalog().get(0).getDelivery().getPrice());
        Assert.assertEquals(100,testShopManager.getShop().getCatalog().get(1).getDelivery().getPrice());
        Assert.assertEquals(200,testShopManager.getShop().getCatalog().get(2).getDelivery().getPrice());

    }

    @Test
    public void sortByDeliveryDurationFromHigherToLower() {

        testShopManager.sortByDeliveryDuration(false);
        Assert.assertEquals(1220, testShopManager.getShop().getCatalog().get(0).getDelivery().getDuration());
        Assert.assertEquals(200, testShopManager.getShop().getCatalog().get(1).getDelivery().getDuration());
        Assert.assertEquals(120, testShopManager.getShop().getCatalog().get(2).getDelivery().getDuration());

    }

    @Test
    public void sortByArrivalDateFromHigherToLower() {

        testShopManager.sortByArrivalDate(false);

        Assert.assertEquals(new Date(2030,1,2), testShopManager.getShop().getCatalog().get(0).getDelivery().getArrival());
        Assert.assertEquals(new Date(2030,1,2), testShopManager.getShop().getCatalog().get(1).getDelivery().getArrival());
        Assert.assertEquals(new Date(2020,4,21), testShopManager.getShop().getCatalog().get(2).getDelivery().getArrival());

    }

    @Test
    public void sortByDeliveryPriceFromHigherToLower() {

        testShopManager.sortByDeliveryPrice(false);

        Assert.assertEquals(1000, testShopManager.getShop().getCatalog().get(0).getDelivery().getPrice());
        Assert.assertEquals(200, testShopManager.getShop().getCatalog().get(1).getDelivery().getPrice());
        Assert.assertEquals(200, testShopManager.getShop().getCatalog().get(2).getDelivery().getPrice());

    }

    @Test
    public void showShopCatalog() {

        testShopManager.showShopCatalog();

    }
}