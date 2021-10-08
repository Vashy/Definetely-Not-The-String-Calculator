package org.vashykator;

public final class StringCalculatorDefaults {
    private StringCalculatorDefaults() {
    }

    public static SplitStrategy defaultSplitStrategy() {
        return new CustomSeparatorSplitStrategyDecorator(new SplitByNewLineStrategyDecorator(new SplitByCommaStrategy()));
    }

    public static FilterStrategy defaultFilterStrategy() {
        return new KeepNonEmptyFilterStrategy();
    }

    public static StringToIntegerParseConverter defaultStringToIntConverter() {
        return new SimpleStringToIntegerParseConverter();
    }

    public static SumStrategy defaultSumStrategy() {
        return new SimpleSumStrategy();
    }
}
