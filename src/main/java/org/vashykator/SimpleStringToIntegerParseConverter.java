package org.vashykator;

import static java.lang.Integer.parseInt;

public class SimpleStringToIntegerParseConverter implements StringToIntegerParseConverter {
    @Override
    public int convert(String str) {
        return parseInt(str);
    }
}