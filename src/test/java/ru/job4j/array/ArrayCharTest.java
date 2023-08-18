package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
class ArrayCharTest {
    @Test
    public void whenStartWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'e'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result).isTrue();
    }

    @Test
    public void whenNotStartWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'i'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result).isFalse();
    }

    @Test
    public void whenOtherStartWithPrefixThenTrue() {
        char[] word = {'S', 'a'};
        char[] pref = {'S', 'a', 'l', 'a', 'm'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result).isTrue();
    }

}