package org.vashykator;

public class CustomSeparatorSplitStrategyDecorator implements SplitStrategy {
    private final SplitStrategy delegate;

    public CustomSeparatorSplitStrategyDecorator(final SplitStrategy delegate) {
        this.delegate = delegate;
    }

    @Override
    public String[] split(final String str) {
        if (str.startsWith("//")) {
            final char delimiter = str.charAt(2);
            final String substring = str.replaceFirst("//" + escape(delimiter) + "\n", "");
            return substring.split(escape(delimiter));
        }
        return delegate.split(str);
    }

    private String escape(final char delimiter) {
        return String.format("\\%s", delimiter);
    }
}
