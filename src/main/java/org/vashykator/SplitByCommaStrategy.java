package org.vashykator;

public class SplitByCommaStrategy implements SplitStrategy {
    @Override
    public String[] split(String str) {
        return str.split("[,\n]");
    }
}
