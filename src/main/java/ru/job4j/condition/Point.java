package ru.job4j.condition;

import static java.lang.Math.*;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public static void main(String[] args) {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(0, 2);
        double dist = point1.distance(point2);
        System.out.println(dist);
    }
}
