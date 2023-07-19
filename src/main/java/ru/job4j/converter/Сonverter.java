package ru.job4j.converter;

public class Сonverter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float euro = rubleToEuro(15000);
        float dollar = rubleToDollar(10000);
        System.out.println("15000 rubles are " + euro + " euro.");
        System.out.println("10000 rubles are " + dollar + " dollar.");
    }
}
