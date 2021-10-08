package org.vashykator;

public final class StandardOutputWriter implements OutputWriter {
    @Override
    public void write(int result) {
        System.out.println(result);
    }
}
