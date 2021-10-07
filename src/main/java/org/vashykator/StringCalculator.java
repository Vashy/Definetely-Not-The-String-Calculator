package org.vashykator;

import java.util.Arrays;

public class StringCalculator {
    public int add(String commaSeparatedNumbers) {
        return Arrays.stream(commaSeparatedNumbers.split(","))
                .filter(s -> !s.isEmpty())
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
