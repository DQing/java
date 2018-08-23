package com.cultivation.javaBasic;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Example {
    public String getString(String str) {
        return str;
    }
}

class Test1 {
    public static Object testInvoke() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<Example> exampleClass = Example.class;
        Method getString = exampleClass.getMethod("getString", String.class);
        Example example = new Example();
        return getString.invoke(example, "hello");
    }
}