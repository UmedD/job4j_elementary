package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class FactorialTest {

    @Test
    void whenNumberEqualToFiveThenOneHundredTwenty() {
        int n = 5;
        int result = Factorial.calc(n);
        int expected = 120;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenNumberEqualToFourThenTwentyFour() {
        int n = 4;
        int result = Factorial.calc(n);
        int expected = 24;
        assertThat(result).isEqualTo(expected);
    }
}