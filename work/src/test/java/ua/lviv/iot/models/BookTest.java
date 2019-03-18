package ua.lviv.iot.models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest{
    private Book testBook;

    @Before
    public void setUp() throws Exception{

             testBook = new Book(
                "testBook",
                100,
                100,
                "testAuthor",
                null);

    }

    @Test
    public void getPageCount() {

        assertEquals(
                "Something went wrong with Book getPageCount() ",
                100,
                testBook.getPageCount());
    }

    @Test
    public void setPageCount() {

        testBook.setPageCount(200);
        assertEquals(
                "Something went wrong with Book setPageCount() ",
                200,
                testBook.getPageCount());

    }

    @Test
    public void getAuthor() {

        assertEquals(
                "Something went wrong with Book getAuthor() ",
                "testAuthor",
                testBook.getAuthor());
    }

    @Test
    public void setAuthor() {

        testBook.setAuthor("newTestAuthor");
        assertEquals(
                "Something went wrong with Book setAuthor() ",
                "newTestAuthor",
                testBook.getAuthor());

    }
}