package org.vashykator;

public final class StringCalculatorDefaults {
    private StringCalculatorDefaults() {
    }

    public static SplitByNewLineStrategyDecorator defaultSplitStrategy() {
        return new SplitByNewLineStrategyDecorator(new SplitByCommaStrategy());
    }

    public static KeepNonEmptyFilterStrategy defaultFilterStrategy() {
        return new KeepNonEmptyFilterStrategy();
    }

    public static SimpleStringToIntegerParseConverter defaultStringToIntConverter() {
        return new SimpleStringToIntegerParseConverter();
    }

    public static SimpleSumStrategy defaultSumStrategy() {
        return new SimpleSumStrategy();
    }
}
