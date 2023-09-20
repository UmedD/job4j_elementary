package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int[] arr = new int[0];
        int i = 0;
        int j = 1;
        while (j < array.length) {
            if (target == array[i] + array[j]) {
                arr = new int[]{i, j};
            }
            j++;
            if (j == array.length) {
                j = i + 2;
                i++;
            }
        }
        return arr;
    }
}
