package org.vashykator;

public class SimpleSumStrategy implements SumStrategy {
    @Override
    public int sum(int left, int right) {
        return left + right;
    }
}
