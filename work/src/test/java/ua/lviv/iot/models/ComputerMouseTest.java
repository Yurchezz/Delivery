package ua.lviv.iot.models;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ComputerMouseTest{
    private ComputerMouse testComputerMouse;

    @Before
    public void setUp() throws Exception{

         testComputerMouse = new ComputerMouse(
                "testMouse",
                100,
                2,
                1,
                null
        );

    }

    @Test
    public void getButtonCount(){

        assertEquals(
                "Something went wrong with ComputerMouse getButtonCount() ",
                2,
                testComputerMouse.getButtonCount());

    }

    @Test
    public void setButtonCount(){

        testComputerMouse.setButtonCount(3);
        assertEquals(
                "Something went wrong with ComputerMouse setButtonCount() ",
                3,
                testComputerMouse.getButtonCount());

    }

    @Test
    public void getCableLegnth(){

        assertEquals(
                "Something went wrong with ComputerMouse getCableLength() " ,
                1,
                testComputerMouse.getCableLength());

    }

    @Test
    public void setCableLength(){

        testComputerMouse.setCableLength(2);
        assertEquals(
                "Something went wrong with ComputerMouse setCableLength() ",
                2,
                testComputerMouse.getCableLength());

    }
}