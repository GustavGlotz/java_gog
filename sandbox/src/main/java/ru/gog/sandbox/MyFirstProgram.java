package ru.gog.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        Point p1 = new Point(1, 3);
        Point p2 = new Point(6, 2);
        System.out.println("Расстояние между двумя точками" + " = " + p1.distance(p2));
    }


}
