package org.example.HW1.book;

public class Book implements Displayable {
    private String Name;
    private String Author;
    private int PublishYear;

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public void setPublishYear(int PublishYear) {
        this.PublishYear = PublishYear;
    }

    public String getName() {
        return this.Name;
    }

    public String getAuthor() {
        return this.Author;
    }

    public int getPublishYear() {
        return this.PublishYear;
    }

    @Override
    public void display() {
        System.out.println("This book is " + this.Name);
        System.out.println("The author is " + this.Author);
        System.out.println("Publication year is " + this.PublishYear);
    }
}
