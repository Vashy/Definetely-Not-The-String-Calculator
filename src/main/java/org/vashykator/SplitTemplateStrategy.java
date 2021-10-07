package org.vashykator;

public abstract class SplitTemplateStrategy implements SplitStrategy {
    @Override
    public final String[] split(String str) {
        return str.split("[" + splitChars() + "]");
    }

    protected abstract String splitChars();
}
