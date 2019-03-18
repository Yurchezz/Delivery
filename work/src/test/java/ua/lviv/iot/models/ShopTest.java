package ua.lviv.iot.models;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class ShopTest {

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

    private Shop  testShop = new Shop(
            "testShop",
            "testShop.com",
            testShopCatalog);

    private Shop newTestShop = new Shop(
            "testShop",
            "testShop.com",
            testShopCatalog);

    @Before
    public void setUp() throws Exception {

        testShopCatalog.add(tarasBulba);
        testShopCatalog.add(kobzar);
        testShopCatalog.add(proRetina13);
        testShopCatalog.add(g403);
        testShopCatalog.add(netscroll20);

    }

    @Test
    public void getName() {

        assertEquals(
                "Something went wrong with Shop getName()",
                "testShop",
                testShop.getName());

    }

    @Test
    public void setName() {

        testShop.setName("newTestShop");
        assertEquals(
                "Something went wrong with Shop setName()",
                "newTestShop",
                testShop.getName());

    }

    @Test
    public void getWebSite() {

        assertEquals(
                "Something went wrong with Shop getWebSite() ",
                "testShop.com",
                testShop.getWebSite());

    }

    @Test
    public void setWebSite() {

        testShop.setWebSite("newTestShop.com");
        assertEquals(
                "Something went wrong with Shop setWebSite() ",
                "newTestShop.com",
                 testShop.getWebSite());

    }

    @Test
    public void getCatalog() {

        assertEquals(
                "Something went wrong with Shop getCatalog() ",
                newTestShop.getCatalog(),
                testShop.getCatalog());

    }

    @Test
    public void setCatalog() {

        testShop.setCatalog(newTestShop.getCatalog());
        assertEquals(
                "Something went wrong with Shop setCatalog() ",
                newTestShop.getCatalog(),
                testShop.getCatalog());

    }

    @Test
    public void getDelieveryTypes() {

        assertEquals(
                "Something went wrong with Shop getDeliveryTypes() ",
                newTestShop.getDelieveryTypes(),
                testShop.getDelieveryTypes());

    }

    @Test
    public void setDelieveryTypes() {

        testShop.setDelieveryTypes(newTestShop.getDelieveryTypes());
        assertEquals(
                "Something went wrong with Shop setDeliveryTypes() ",
                newTestShop.getDelieveryTypes(),
                testShop.getDelieveryTypes());

    }
}