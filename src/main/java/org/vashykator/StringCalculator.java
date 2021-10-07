package org.vashykator;

import java.util.Arrays;

public class StringCalculator {
    public int add(String commaSeparatedNumbers) {
        return Arrays.stream(commaSeparatedNumbers.split(","))
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
