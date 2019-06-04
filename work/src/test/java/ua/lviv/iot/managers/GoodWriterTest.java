package ua.lviv.iot.managers;

import org.junit.Before;
import org.junit.Test;
import ua.lviv.iot.models.*;

import java.io.*;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Date;

import static org.junit.Assert.*;

public class GoodWriterTest {
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

    private Book harryPotter = new Book(
            "Harry Potter",
            200,
            1000,
            "Joahn Rouling",
            plAirTransport);



    private ArrayList<Good> testShopCatalog = new ArrayList<Good>();

    @Before
    public void setUp() throws Exception {
        testShopCatalog.add(tarasBulba);
        testShopCatalog.add(kobzar);
        testShopCatalog.add(harryPotter);

    }

    @Test
    public void WriteToFile() throws IOException {

        GoodWriter.WriteToFile(testShopCatalog);
        File catalog = new File("catalog.csv");
        assertTrue("catalog file doesn't exists",catalog.exists());


        try (FileInputStream fis = new FileInputStream("catalog.csv");
             InputStreamReader isr = new InputStreamReader(fis);
             BufferedReader bufReader = new BufferedReader(isr)) {

            assertEquals("Writed headers differs from Readed", testShopCatalog.get(0).getHeaders(), bufReader.readLine());

            for (Good goodItem : testShopCatalog) {

                assertEquals("Read item differs from expected wrote one", goodItem.toCSV(), bufReader.readLine());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}