package org.vashykator;

import java.util.Arrays;

public class StringCalculator {
    private final SplitStrategy splitStrategy;

    public StringCalculator(SplitStrategy splitStrategy) {
        this.splitStrategy = splitStrategy;
    }

    public int add(String commaSeparatedNumbers) {
        return Arrays.stream(splitStrategy.split(commaSeparatedNumbers))
                .filter(s -> !s.isEmpty())
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
