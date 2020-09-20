package ru.gog.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x1 = -2.9;
        p1.x2 = 8.5;
        Point p2 = new Point();
        p2.y1 = 4;
        p2.y2 = 0.7;
        System.out.println("Расстояние между двумя точками" + " = " + distance(p1, p2));
    }

    public static double distance(Point p1, Point p2) {
        return Math.sqrt((p1.x2 - p1.x1) * (p1.x2 - p1.x1) + (p2.y2 - p2.y1) * (p2.y2 - p2.y1));

    }
}
