package org.vashykator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    private final StringCalculator stringCalculator = new StringCalculator();

    @Test
    @DisplayName("should return the sum of the two given integers")
    void test1() {
        int result = stringCalculator.add("1,2");

        assertEquals(3, result);
    }
}