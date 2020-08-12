package com.michaelwilliamjones.hellojava;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.michaelwilliamjones.hellojava.greeting.Greeter;
import com.michaelwilliamjones.hellojava.guice.HelloJavaModule;

public class Main {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new HelloJavaModule());
        Greeter greeter = injector.getInstance(Greeter.class);

        System.out.println(greeter.getGreeting());
    }
}
