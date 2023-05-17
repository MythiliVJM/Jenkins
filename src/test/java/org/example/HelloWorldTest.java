package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public  class HelloWorldTest {
    @Test
    public void testSayHello() {
        String expected = "Hello Jenkins!";
        String actual = HelloWorld.sayHello();
        assertEquals(expected, actual);
}}
