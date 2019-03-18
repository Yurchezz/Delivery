package ua.lviv.iot.models;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LocationTest{
    private Location testLocation;

    @Before
    public void setUp() throws Exception{

         testLocation = new Location(
                100,
                100);

    }

    @Test
    public void getLongitude(){

        assertEquals(
                "Something went wrong with Location getLongitude()",
                100,
                testLocation.getLongitude());

    }

    @Test
    public void setLongitude(){

        testLocation.setLongitude(200);
        assertEquals(
                "Something went wrong with Location setLongitude()",
                200,
                testLocation.getLongitude());

    }

    @Test
    public void getLetitude(){

        assertEquals(
                "Something went wrong with Location getLetitude()",
                100,
                testLocation.getLetitude());

    }

    @Test
    public void setLetitude(){

        testLocation.setLetitude(200);
        assertEquals(
                "Something went wrong with Location setLetitude()",
                200,
                testLocation.getLetitude());

    }
}