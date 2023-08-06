package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        boolean flag = left > right;
        return flag ? left : right;

    }

    public static void main(String[] args) {
        int rsl = max(5,5);
        System.out.println(rsl);
    }
}
