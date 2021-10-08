package org.vashykator;

public final class SplitByCommaStrategy extends SplitTemplateStrategy {
    @Override
    protected String splitChars() {
        return ",";
    }
}
