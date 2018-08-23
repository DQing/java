package com.cultivation.javaBasic.Demo;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InvokeTest {
    @Test
    void should_return_hello() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        assertEquals("hello",Invoke.testInvoke());
    }
}
