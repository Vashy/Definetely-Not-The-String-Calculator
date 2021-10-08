package org.vashykator;

public class StringCalculatorFactory {

    public StringCalculator create() {
        return new StringCalculator(
                createSplitStrategy(),
                createFilterStrategy(),
                createStringToIntegerConverter(),
                createSumStrategy()
        );
    }

    private SumStrategy createSumStrategy() {
        return new SimpleSumStrategy();
    }

    private StringToIntegerParseConverter createStringToIntegerConverter() {
        return new SimpleStringToIntegerParseConverter();
    }

    private FilterStrategy createFilterStrategy() {
        return new KeepNonEmptyFilterStrategy();
    }

    private SplitStrategy createSplitStrategy() {
        return new CustomSeparatorSplitStrategyDecorator(new SplitByNewLineStrategyDecorator(new SplitByCommaStrategy()));
    }
}