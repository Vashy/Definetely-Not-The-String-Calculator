package org.vashykator;

public abstract class SplitTemplateStrategy implements SplitStrategy {
    @Override
    public final String[] split(final StringCalculatorInput input) {
        return input.getAddableNumbers().split("[" + splitChars() + "]");
    }

    protected abstract String splitChars();
}
