package org.vashykator;

public final class SimpleSumStrategy implements SumStrategy {
    @Override
    public int sum(final int left, final int right) {
        return left + right;
    }
}
