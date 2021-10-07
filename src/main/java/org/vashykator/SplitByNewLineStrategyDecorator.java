package org.vashykator;

public class SplitByNewLineStrategyDecorator extends SplitTemplateStrategy {
    private final SplitTemplateStrategy splitTemplateStrategy;

    public SplitByNewLineStrategyDecorator(SplitTemplateStrategy splitTemplateStrategy) {
        this.splitTemplateStrategy = splitTemplateStrategy;
    }

    @Override
    protected String splitChars() {
        return splitTemplateStrategy.splitChars() + "\n";
    }
}
