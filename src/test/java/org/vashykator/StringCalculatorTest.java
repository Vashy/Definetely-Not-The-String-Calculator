package org.vashykator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringCalculatorTest {
    private final StringCalculator stringCalculator = new StringCalculator(new SplitByCommaStrategy(),
            new KeepNonEmptyFilterStrategy(), new SimpleStringToIntegerParseConverter(), new SimpleSumStrategy());

    @Test
    @DisplayName("should return the sum of the two given integers")
    void test1() {
        assertEquals(3, stringCalculator.add("1,2"));
        assertEquals(10, stringCalculator.add("3,7"));
    }

    @Test
    @DisplayName("should return one integer")
    void test2() {
        assertEquals(1, stringCalculator.add("1"));
        assertEquals(3, stringCalculator.add("3"));
    }

    @Test
    @DisplayName("should return zero on empty string")
    void test3() {
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    @DisplayName("handle unknown amount of numbers")
    void test4() {
        assertEquals(17, stringCalculator.add("4,3,2,4,3,1"));
    }
}