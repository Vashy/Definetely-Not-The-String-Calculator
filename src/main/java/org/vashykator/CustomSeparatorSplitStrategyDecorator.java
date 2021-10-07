package org.vashykator;

public class CustomSeparatorSplitStrategyDecorator implements SplitStrategy {
    private final SplitStrategy delegate;

    public CustomSeparatorSplitStrategyDecorator(SplitStrategy delegate) {
        this.delegate = delegate;
    }

    @Override
    public String[] split(String str) {
        if (str.startsWith("//")) {
            final char delimiter = str.charAt(2);
            final String substring = str.replaceFirst("//" + escape(delimiter) + "\n", "");
            return substring.split(escape(delimiter));
        }
        return delegate.split(str);
    }

    private String escape(char delimiter) {
        return String.format("\\%s", delimiter);
    }
}
