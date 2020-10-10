package com.michaelwilliamjones.hellojava.greeting;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

@Test
public class GreeterTest {
    private static final String TEST_GREETING = "this is a test greeting";

    @Test
    public void getGreeting_returnsHelloWorld() {
        // arrange
        Greeter greeter = new Greeter(TEST_GREETING);

        // act
        String greeting = greeter.getGreeting();

        // assert
        assertEquals(TEST_GREETING, greeting);
    }
}
