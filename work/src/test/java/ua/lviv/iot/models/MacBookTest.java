package ua.lviv.iot.models;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MacBookTest{

    MacBook testMacBook;
    @Before
    public void setUp() throws Exception {

        testMacBook = new MacBook(
                "testMacBook",
                10000,
                15,
                2019,
                null
        );

    }

    @Test
    public void getDisplayDiagonal() {

        assertEquals(
                "Something went wrong with MacBook getDisplayDiagonal()",
                15,
                testMacBook.getDisplayDiagonal());

    }

    @Test
    public void setDisplayDiagonal() {

        testMacBook.setDisplayDiagonal(17);
        assertEquals(
                "Something went wrong with MacBook setDisplayDiagonal()",
                17,
                testMacBook.getDisplayDiagonal());

    }

    @Test
    public void getManufactureYear() {

        assertEquals(
                "Something went wrong with MacBook getManufactureYear()",
                2019,
                testMacBook.getManufactureYear());

    }

    @Test
    public void setManufactureYear() {

        testMacBook.setManufactureYear(2018);
        assertEquals(
                "Something went wrong with MacBook setDisplayDiagonal()",
                2018,
                testMacBook.getManufactureYear());

    }
}