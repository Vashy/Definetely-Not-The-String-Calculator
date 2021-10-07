package org.vashykator;

public class KeepNonEmptyFilterStrategy implements FilterStrategy {
    @Override
    public boolean shouldKeep(String element) {
        return !element.isEmpty();
    }
}
