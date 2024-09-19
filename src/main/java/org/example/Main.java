 package org.example;

 import org.example.HW1.book.Book;

 public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        book.setName("Harry Potter");
        book.setAuthor("J.K.Rowling");
        book.setPublishYear(2018);
        book.display();
    }
}