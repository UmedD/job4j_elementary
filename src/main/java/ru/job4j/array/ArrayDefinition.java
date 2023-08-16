package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Rustam";
        names[1] = "Ruslan";
        names[2] = "Roman";
        names[3] = "Rasul";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println("Размер первого массива равен: " + ages.length);
        System.out.println("Размер второго массива равен: " + surnames.length);
        System.out.println("Размер третьего массива равен: " + prices.length);
    }
}
