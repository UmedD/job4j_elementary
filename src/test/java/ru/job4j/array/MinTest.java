package ru.job4j.array;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MinTest {
    @Test
    public void whenFirstMin() {
        int[] array = new int[] {0, 5, 10};
        int result = Min.findMin(array);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenLastMin() {
        int[] array = new int[] {10, 5, 3};
        int result = Min.findMin(array);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMiddleMin() {
        int[] array = new int[] {10, 2, 5};
        int result = Min.findMin(array);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenSecondMin() {
        int[] array = {5, 1, 8, 9, 7};
        int result = Min.findMin(array);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }
}