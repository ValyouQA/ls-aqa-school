package ru.ls.qa.school.core;

public class PointTask {
    public static void main(String[] args) {
        Point p1 = new Point(1.0, 2.0);
        Point p2 = new Point(4.0, 6.0);

        double distance = p1.distance(p2);

        System.out.println("Расстояние между точками равно " + distance);
    }
}
