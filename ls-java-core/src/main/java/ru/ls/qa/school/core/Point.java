package ru.ls.qa.school.core;
public class Point {
    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double  distance(Point point) {
        double dX = this.x - point.x;
        double dY = this.y - point.y;
        return Math.sqrt(dX * dX + dY * dY);
    }
}