package org.vashykator;

public class SplitByNewLineStrategyDecorator extends SplitTemplateStrategy {
    private final SplitTemplateStrategy delegate;

    public SplitByNewLineStrategyDecorator(SplitTemplateStrategy delegate) {
        this.delegate = delegate;
    }

    @Override
    protected String splitChars() {
        return delegate.splitChars() + "\n";
    }
}
