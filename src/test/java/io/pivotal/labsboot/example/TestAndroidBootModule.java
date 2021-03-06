package io.pivotal.labsboot.example;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

import static org.mockito.Mockito.mock;

@Module(
        injects = {
                AndroidBootActivity.class,
                AndroidBootActivityTest.class
        },
        library = true,
        complete = false,
        overrides = true
)
public class TestAndroidBootModule {
    @Provides
    @Singleton
    AndroidBootDelegate providesDelegate() {
        return mock(AndroidBootDelegate.class);
    }
}
