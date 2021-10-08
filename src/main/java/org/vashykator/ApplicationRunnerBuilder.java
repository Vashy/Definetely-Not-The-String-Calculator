package org.vashykator;

import java.util.function.Consumer;

public final class ApplicationRunnerBuilder {
    private InputReader inputReader = new CommandLineInputReader();
    private OutputWriter outputWriter = new StandardOutputWriter();
    private boolean looping = false;

    private ApplicationRunnerBuilder() {
    }

    public static ApplicationRunner buildDefault() {
        return build(applicationRunnerBuilder -> {});
    }

    public static ApplicationRunner build(final Consumer<ApplicationRunnerBuilder> consumer) {
        final ApplicationRunnerBuilder builder = new ApplicationRunnerBuilder();
        consumer.accept(builder);

        return builder.build();
    }

    public ApplicationRunnerBuilder setCommandLineInputReader() {
        inputReader = new CommandLineInputReader();
        return this;
    }

    public ApplicationRunnerBuilder setStandardOutputWriter() {
        outputWriter = new StandardOutputWriter();
        return this;
    }

    public ApplicationRunnerBuilder enableLooping() {
        looping = true;
        return this;
    }

    private ApplicationRunner build() {
        final OneTimeExecutionApplicationRunner applicationRunner =
                new OneTimeExecutionApplicationRunner(
                inputReader,
                new StringCalculatorFactory(),
                outputWriter
        );
        return looping ? new LoopExecutionApplicationRunnerDecorator(applicationRunner) : applicationRunner;
    }
}
