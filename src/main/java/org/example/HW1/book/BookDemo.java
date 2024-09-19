package org.example.HW1.book;

public class BookDemo {
    public static void main(String[] args) {
        Book book = new Book();
        book.setName("Harry Potter");
        book.setAuthor("J.K.Rowling");
        book.setPublishYear(2018);
        book.display();
    }
}
