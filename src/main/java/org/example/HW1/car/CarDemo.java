package org.example.HW1.car;

public class CarDemo {
    public static void main(String[] args) {
        Car car = new Car();
        car.setBrand("KIA");
        car.setModel("RIO");
        car.setReleaseYear(2012);

        car.start();
        car.drive(100);
        car.stop();

        car.print();

    }
}
