package org.vashykator;

public class SplitByCommaStrategy extends SplitTemplateStrategy {
    @Override
    protected String splitChars() {
        return ",";
    }
}
