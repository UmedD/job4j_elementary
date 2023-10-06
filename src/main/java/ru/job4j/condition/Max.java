package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int first, int second, int third) {
        int value = max(second, third);
        return first > value ? first : value;
    }

    public static int max(int first, int second, int third, int fourth) {
        int value = max(second, third, fourth);
        return first > value ? first : value;
    }

    public static void main(String[] args) {
        System.out.println(max(5, 3));
        System.out.println(max(5, 5, 10));
        System.out.println(max(5, 5, 5, 15));
    }
}
