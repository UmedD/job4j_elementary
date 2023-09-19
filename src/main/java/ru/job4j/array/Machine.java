package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int index = 0;
        int balance = money - price;
        for (int coin : coins) {
            int count = balance / coin;
            balance -= count * coin;
            while (count > 0) {
                rsl[index] = coin;
                index++;
                count--;
            }
        }
        return Arrays.copyOf(rsl, index);
    }
}
