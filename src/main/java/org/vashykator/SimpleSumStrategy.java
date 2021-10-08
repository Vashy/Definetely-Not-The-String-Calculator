package org.vashykator;

public class SimpleSumStrategy implements SumStrategy {
    @Override
    public int sum(final int left, final int right) {
        return left + right;
    }
}
