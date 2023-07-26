package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(short height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short height = 180;
        short height2 = 170;
        double man = manWeight(height);
        double woman = womanWeight(height2);
        System.out.println("Man 187 is " + man);
        System.out.println("Woman 170 is " + woman);
    }
}
