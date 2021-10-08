package org.vashykator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringCalculatorTest {
    private final StringCalculator stringCalculator =
            new StringCalculatorFactory().create();

    @Test
    @DisplayName("should return the sum of the two given integers")
    void test1() {
        assertEquals(3, calculate("1,2"));
        assertEquals(10, calculate("3,7"));
    }

    @Test
    @DisplayName("should return one integer")
    void test2() {
        assertEquals(1, calculate("1"));
        assertEquals(3, calculate("3"));
    }

    @Test
    @DisplayName("should return zero on empty string")
    void test3() {
        assertEquals(0, calculate(""));
    }

    @Test
    @DisplayName("handle unknown amount of numbers")
    void test4() {
        assertEquals(17, calculate("4,3,2,4,3,1"));
    }

    @Test
    @DisplayName("should handle new line as a separator")
    void test5() {
        assertEquals(3, calculate("1\n2"));
        assertEquals(15, calculate("3\n7,5"));
    }

    @Test
    @DisplayName("should handle custom delimiter")
    void test6() {
        assertEquals(3, calculate("//+\n1+2"));
        assertEquals(15, calculate("//-\n3-7-5"));
    }

    private int calculate(final String numbers) {
        return stringCalculator.add(new StringCalculatorInput(numbers));
    }
}