package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTest {
    @Test
    public void testSetTitle() {
        Book book = new Book();
        book.setTitle("Dr");
        assertEquals("Dr", book.getTitle());
    }

    @Test
    public void testSetAuthor() {
        Book book = new Book();
        book.setAuthor("JaneDoe");
        assertEquals("JaneDoe", book.getAuthor());
    }
}

