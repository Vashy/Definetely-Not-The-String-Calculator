package org.vashykator;

import java.util.Arrays;

public class StringCalculator {
    private final SplitStrategy splitStrategy;
    private final FilterStrategy filterStrategy;
    private final StringToIntegerParseConverter stringToIntegerConverter;
    private final SumStrategy sumStrategy;

    public StringCalculator(
            SplitStrategy splitStrategy,
            FilterStrategy filterStrategy,
            StringToIntegerParseConverter stringToIntegerConverter,
            SumStrategy sumStrategy) {
        this.splitStrategy = splitStrategy;
        this.filterStrategy = filterStrategy;
        this.stringToIntegerConverter = stringToIntegerConverter;
        this.sumStrategy = sumStrategy;
    }

    public int add(String numbersAsString) {
        return Arrays.stream(splitStrategy.split(numbersAsString))
                .filter(filterStrategy::shouldKeep)
                .mapToInt(stringToIntegerConverter::convert)
                .reduce(0, sumStrategy::sum);
    }
}
