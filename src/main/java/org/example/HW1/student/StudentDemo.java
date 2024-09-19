package org.example.HW1.student;

public class StudentDemo {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Ivanov");
        student.setBookNumber(123456789);
        student.setAvgMark(4);
        student.print();
    }
}
