package com.michaelwilliamjones.hellojava.guice;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.name.Named;

public class HelloJavaModule extends AbstractModule {
    @Provides
    @Named("Greeting")
    static String provideMessage() {
        return "hello world";
    }
}
