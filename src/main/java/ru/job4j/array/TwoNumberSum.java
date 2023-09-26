package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int[] arr = new int[0];
        int i = 0;
        int j = array.length - 1;
        while (j > i) {
            if (target == array[i] + array[j]) {
                arr = new int[]{i, j};
                break;
            } else if (j - 1 == i) {
                j = array.length - 1;
                i++;
            } else {
                j--;
            }
        }
        return arr;
    }
}
