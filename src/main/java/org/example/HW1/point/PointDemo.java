package org.example.HW1.point;

public class PointDemo {
    public static void main(String[] args) {
        Point point = new Point();
        point.setX(10);
        point.setY(10);
        point.print("Start point: X = " + point.getX() + " Y = " + point.getY());

        point.moveUp();
        point.moveRight();
        point.print("Move up and right");

        point.moveUp();
        point.moveLeft();
        point.moveLeft();
        point.moveLeft();
        point.print("Move up and left");

        point.moveDown();
        point.moveDown();
        point.moveDown();
        point.print("Move down");

        point.print("Finish point: X = " + point.getX() + " Y = " + point.getY());
    }
}
