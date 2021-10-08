package org.vashykator;

import static org.vashykator.StringCalculatorDefaults.*;

public final class CustomizableStringCalculatorFactory implements StringCalculatorFactory {
    private SplitStrategy splitStrategy = defaultSplitStrategy();
    private FilterStrategy filterStrategy = defaultFilterStrategy();
    private StringToIntegerParseConverter stringToIntConverter = defaultStringToIntConverter();
    private SumStrategy sumStrategy = defaultSumStrategy();

    @Override
    public StringCalculator create() {
        return new StringCalculator(
                splitStrategy,
                filterStrategy,
                stringToIntConverter,
                sumStrategy
        );
    }

    public void setSplitStrategy(final SplitStrategy splitStrategy) {
        this.splitStrategy = splitStrategy;
    }

    public void setFilterStrategy(final FilterStrategy filterStrategy) {
        this.filterStrategy = filterStrategy;
    }

    public void setStringToIntConverter(final StringToIntegerParseConverter stringToIntConverter) {
        this.stringToIntConverter = stringToIntConverter;
    }

    public void setSumStrategy(final SumStrategy sumStrategy) {
        this.sumStrategy = sumStrategy;
    }
}
