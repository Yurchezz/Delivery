package ua.lviv.iot.models;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlaneTest{

    private Plane testPlane;

    @Before
    public void setUp() throws Exception{

        testPlane = new Plane(
                "testMark",
                100,
                100);

    }

    @Test
    public void getMark(){

        assertEquals(
                "Something went wrong with Plane getMark()",
                "testMark",
                testPlane.getMark());

    }

    @Test
    public void setMark(){

        testPlane.setMark("newTestMark");
        assertEquals(
                "Something went wrong with Plane setMark()",
                "newTestMark",
                testPlane.getMark());

    }

    @Test
    public void getMaxHigh(){

        assertEquals(
                "Something went wrong with Plane getMaxHigh()",
                100,
                testPlane.getMaxHigh());

    }

    @Test
    public void setMaxHigh(){

        testPlane.setMaxHigh(200);
        assertEquals(
                "Something went wrong with Plane setMaxHigh()",
                200,
                testPlane.getMaxHigh());

    }

    @Test
    public void getTonnage(){

        assertEquals(
                "Something went wrong with Plane getTonnage()",
                100,
                testPlane.getTonnage());

    }

    @Test
    public void setTonnage(){

        testPlane.setTonnage(200);
        assertEquals(
                "Something went wrong with Plane setTonnage()",
                200,
                testPlane.getTonnage());

    }
}