package ua.lviv.iot.models;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BusTest{
    private Bus testBus;

    @Before
    public void setUp() throws Exception{
            testBus = new Bus(
                "testBus",
                200);
    }

    @Test
    public void getMark(){

        assertEquals(
                "Something went wrong with BusTest getMark() ",
                "testBus",
                testBus.getMark());

    }

    @Test
    public void setMark(){

        testBus.setMark("newTestBus");
        assertEquals(
                "Something went wrong with BusTest setMark() ",
                "newTestBus",
                testBus.getMark());

    }

    @Test
    public void getMaxSpeed(){

        assertEquals(
                "Something went wrong with BusTest getMaxSpeed() ",
                200,
                testBus.getMaxSpeed());

    }

    @Test
    public void setMaxSpeed(){

        testBus.setMaxSpeed(100);
        assertEquals(
                "Something went wrong with BusTest setMaxSpeed() ",
                100,
                testBus.getMaxSpeed());

    }
}