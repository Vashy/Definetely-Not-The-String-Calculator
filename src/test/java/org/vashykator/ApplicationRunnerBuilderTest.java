package org.vashykator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ApplicationRunnerBuilderTest {
    @Test
    void builder() {
        final ApplicationRunner applicationRunner = ApplicationRunnerBuilder
                .build(builder -> builder
                        .setCommandLineInputReader()
                        .setStandardOutputWriter());

        assertEquals(OneTimeExecutionApplicationRunner.class, applicationRunner.getClass());
    }

    @Test
    void loopingBuilder() {
        final ApplicationRunner applicationRunner = ApplicationRunnerBuilder
                .build(builder -> builder
                        .setCommandLineInputReader()
                        .setStandardOutputWriter()
                        .enableLooping());

        assertEquals(LoopExecutionApplicationRunnerDecorator.class, applicationRunner.getClass());
    }
}