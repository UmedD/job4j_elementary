package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        return l * k;
    }

    public static void main(String[] args) {
        double result1 = square(6, 2);
        System.out.println("real = " + result1);
    }
}
