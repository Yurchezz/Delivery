package ua.lviv.iot.models;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TrainTest {

    private Train testTrain;

    @Before
    public void setUp() throws Exception {

        testTrain = new Train(
                "testMark",
                10);

    }

    @Test
    public void getMark() {

        assertEquals(
                "Something went wrong with Train getMark()",
                "testMark",
                testTrain.getMark());

    }

    @Test
    public void setMark() {

        testTrain.setMark("newTestMark");
        assertEquals(
                "Something went wrong with Train setMark()",
                "newTestMark",
                testTrain.getMark());

    }

    @Test
    public void getRailwayCarriageCount() {

        assertEquals(
                "Something went wrong with Train getRailwayCarriageCount()",
                10,
                testTrain.getRailwayCarriageCount());

    }

    @Test
    public void setRailwayCarriageCount() {

        testTrain.setRailwayCarriageCount(4);
        assertEquals(
                "Something went wrong with Train setRailwayCarriageCount()",
                4,
                testTrain.getRailwayCarriageCount());

    }
}