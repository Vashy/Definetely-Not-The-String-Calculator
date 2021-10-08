package org.vashykator;

public class KeepNonEmptyFilterStrategy implements FilterStrategy {
    @Override
    public boolean shouldKeep(final String element) {
        return !element.isEmpty();
    }
}
