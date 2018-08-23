package com.cultivation.javaBasic.Demo;

import com.cultivation.javaBasic.util.Employee;

import java.lang.reflect.InvocationTargetException;

class Invoke {
    static Object testInvoke() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Example example = new Example();
        return Example.class.getMethod("getHello", String.class).invoke(example, "hello");
    }
}

class Example {
    public String getHello(String string) {
        return string;
    }
}
