package org.vashykator;

public final class CustomSeparatorSplitStrategyDecorator implements SplitStrategy {
    private final SplitStrategy delegate;

    public CustomSeparatorSplitStrategyDecorator(final SplitStrategy delegate) {
        this.delegate = delegate;
    }

    @Override
    public String[] split(final StringCalculatorInput input) {
        final String addableNumbers = input.getAddableNumbers();
        if (addableNumbers.startsWith("//")) {
            final char delimiter = addableNumbers.charAt(2);
            final String substring = addableNumbers.replaceFirst("//" + escape(delimiter) + "\n", "");
            return substring.split(escape(delimiter));
        }
        return delegate.split(input);
    }

    private String escape(final char delimiter) {
        return String.format("\\%s", delimiter);
    }
}
