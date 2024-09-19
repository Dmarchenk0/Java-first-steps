package org.example.HW1.student;

public class Student implements Printable{
    private String Name;
    private int BookNumber;
    private int AvgMark;

    public void setName(String Name){
        this.Name = Name;
    }

    public void setBookNumber(int bookNumber) {
        this.BookNumber = bookNumber;
    }

    public void setAvgMark(int avgMark) {
        this.AvgMark = avgMark;
    }

    public String getName() {
        return this.Name;
    }

    public int getBookNumber() {
        return this.BookNumber;
    }

    public int getAvgMark() {
        return this.AvgMark;
    }

    @Override
    public void print() {
        System.out.println("Student name is " + getName());
        System.out.println("Record book number is " + getBookNumber());
        System.out.println("Average mark is " + getAvgMark());
    }
}
