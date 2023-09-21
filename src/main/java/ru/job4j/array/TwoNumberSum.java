package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int[] arr = new int[0];
        int i = 0;
        int j = array.length - 1;
        while (j > i) {
            if (target == array[i] + array[j]) {
                arr = new int[]{i, j};
            }
            j--;
            if (j == i) {
                j = array.length - 1;
                i++;
            }
        }
        return arr;
    }
}
