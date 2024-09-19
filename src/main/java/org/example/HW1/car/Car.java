package org.example.HW1.car;

public class Car implements Drivable{
    private String Brand;
    private String Model;
    private int ReleaseYear;
    private int distance;

    public String getBrand() {
        return this.Brand;
    }

    public String getModel() {
        return this.Model;
    }

    public int getReleaseYear() {
        return this.ReleaseYear;
    }

    public void setBrand(String brand) {
        this.Brand = brand;
    }

    public void setModel(String model) {
        this.Model = model;
    }

    public void setReleaseYear(int releaseYear) {
        this.ReleaseYear = releaseYear;
    }

    @Override
    public void start() {
        System.out.println("Start moving.");
    }

    @Override
    public void stop() {
        System.out.println("\nFinish moving.");
    }

    @Override
    public void drive(double distance) {
        System.out.printf("Pass: " + String.format("%.2f",distance));
    }

    @Override
    public void print() {
        System.out.println(getBrand());
        System.out.println(getModel());
        System.out.println(getReleaseYear());
    }
}
