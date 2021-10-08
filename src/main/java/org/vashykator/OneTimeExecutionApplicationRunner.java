package org.vashykator;

public class OneTimeExecutionApplicationRunner implements ApplicationRunner {
    private final InputReader inputReader;
    private final StringCalculatorFactory stringCalculatorFactory;
    private final OutputWriter outputWriter;

    public OneTimeExecutionApplicationRunner(final InputReader inputReader,
                                             final StringCalculatorFactory stringCalculatorFactory,
                                             final OutputWriter outputWriter) {
        this.inputReader = inputReader;
        this.stringCalculatorFactory = stringCalculatorFactory;
        this.outputWriter = outputWriter;
    }

    @Override
    public void run() {
        final StringCalculatorInput input = inputReader.readInput();
        final StringCalculator stringCalculator = stringCalculatorFactory.create();
        final int result = stringCalculator.add(input);

        outputWriter.write(result);
    }
}
