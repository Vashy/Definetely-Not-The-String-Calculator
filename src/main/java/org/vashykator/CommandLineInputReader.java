package org.vashykator;

import java.util.Scanner;

public final class CommandLineInputReader implements InputReader {
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public StringCalculatorInput readInput() {
        return new StringCalculatorInput(scanner.nextLine());
    }
}
