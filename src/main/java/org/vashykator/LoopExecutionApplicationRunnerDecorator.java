package org.vashykator;

public class LoopExecutionApplicationRunnerDecorator implements ApplicationRunner {
    private final ApplicationRunner applicationRunner;

    public LoopExecutionApplicationRunnerDecorator(final ApplicationRunner applicationRunner) {
        this.applicationRunner = applicationRunner;
    }

    @Override
    public void run() {
        loop(applicationRunner::run);
    }

    private void loop(final Runnable runnable) {
        while (true) {
            runnable.run();
        }
    }
}
