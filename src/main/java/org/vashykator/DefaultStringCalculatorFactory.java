package org.vashykator;

import static org.vashykator.StringCalculatorDefaults.*;

public final class DefaultStringCalculatorFactory implements StringCalculatorFactory {

    @Override
    public StringCalculator create() {
        return new StringCalculator(
                defaultSplitStrategy(),
                defaultFilterStrategy(),
                defaultStringToIntConverter(),
                defaultSumStrategy()
        );
    }
}
