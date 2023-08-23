package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort2() {
        int[] data = new int[] {3, 4, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 3, 4};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort3() {
        int[] data = new int[] {10, 50, 20, 40, 30};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {10, 20, 30, 40, 50};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort4() {
        int[] data = new int[] {100, 50, 20, 43, 33};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {20, 33, 43, 50, 100};
        assertThat(result).containsExactly(expected);
    }
}