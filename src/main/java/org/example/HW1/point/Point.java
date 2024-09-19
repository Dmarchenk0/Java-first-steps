package org.example.HW1.point;

public class Point implements Movable {
    private int X;
    private int Y;

    public int getX() {
        return this.X;
    }

    public int getY() {
        return this.Y;
    }

    public void setX(int x) {
        this.X = x;
    }

    public void setY(int y) {
        this.Y = y;
    }

    @Override
    public void moveUp() {
        Y += 1;
    }

    @Override
    public void moveDown() {
        Y -= 1;
    }

    @Override
    public void moveLeft() {
        X -= 1;
    }

    @Override
    public void moveRight() {
        X += 1;
    }

    @Override
    public void print(String message) {
        System.out.println(message + ": " + this);
    }
}
