package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float in = 140;
        float in2 = 180;
        float expected = 2;
        float expected2 = 3;
        float out = Converter.rubleToEuro(in);
        float out2 = Converter.rubleToDollar(in2);
        boolean passed = expected == out;
        boolean passed2 = expected2 == out2;
        System.out.println("140 rubles are 2. Test result : " + passed);
        System.out.println("180 rubles are 3. Test result : " + passed2);

    }
}
