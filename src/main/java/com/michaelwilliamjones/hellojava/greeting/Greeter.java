package com.michaelwilliamjones.hellojava.greeting;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.google.inject.name.Named;
import lombok.Getter;


@Singleton
public class Greeter {
    @Getter private final String greeting;

    @Inject
    public Greeter(@Named("Greeting") String greeting) {
        this.greeting = greeting;
    }
}
