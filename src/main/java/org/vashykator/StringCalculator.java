package org.vashykator;

import static java.util.Arrays.stream;

public final class StringCalculator {
    private final SplitStrategy splitStrategy;
    private final FilterStrategy filterStrategy;
    private final StringToIntegerParseConverter stringToIntegerConverter;
    private final SumStrategy sumStrategy;

    public StringCalculator(
            final SplitStrategy splitStrategy,
            final FilterStrategy filterStrategy,
            final StringToIntegerParseConverter stringToIntegerConverter,
            final SumStrategy sumStrategy) {
        this.splitStrategy = splitStrategy;
        this.filterStrategy = filterStrategy;
        this.stringToIntegerConverter = stringToIntegerConverter;
        this.sumStrategy = sumStrategy;
    }

    public int add(final StringCalculatorInput input) {
        return stream(splitStrategy.split(input))
                .filter(filterStrategy::shouldKeep)
                .mapToInt(stringToIntegerConverter::convert)
                .reduce(0, sumStrategy::sum);
    }
}
