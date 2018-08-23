package com.cultivation.javaBasic;

import com.cultivation.javaBasic.showYourIntelligence.NameImpl;
import com.cultivation.javaBasic.util.*;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InterfaceTest {

    @Test
    void should_support_default_method() {
        InterfaceWithDefaultMethodImpl instance = new InterfaceWithDefaultMethodImpl();

        // TODO: please modify the following code to pass the test
        // <--start
        final String expected = "The truth of the universe is 42";
        // --end-->

        assertEquals(expected, instance.tellMeTheTruthOfTheUniverse());
    }

    @Test
    void should_choose_override_method() {
        InterfaceWithOverrideDefaultImpl instance = new InterfaceWithOverrideDefaultImpl();

        // TODO: please modify the following code to pass the test
        // <--start
        final String expected = "The truth of the universe is Anime";
        // --end-->

        assertEquals(expected, instance.tellMeTheTruthOfTheUniverse());
    }

    @Test
    void should_choose_override_method_continued() {
        InterfaceExtendsInterfaceWithDefaultMethod instance = new InterfaceExtendsInterfaceWithDefaultMethodImpl();

        // TODO: please modify the following code to pass the test
        // <--start
        final String expected = "The truth of the universe is Game";
        // --end-->

        assertEquals(expected, instance.tellMeTheTruthOfTheUniverse());
    }

    @Test
    void should_resolve_ambiguity_by_yourself() {
        NameImpl instance = new NameImpl();

        String name = instance.getName();

        assertEquals("Person", name);
    }

    @Test
    void should_return_12() {
        A b = new B();
        String actual = b.tellMeTheTruthOfTheUniverse();
        String expected = "The truth of the universe is 12";
        assertEquals(expected, actual);
    }

    @Test
    void should_return_hello() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        System.out.println(Test1.testInvoke() instanceof String);
        Object obj = Integer.valueOf(1);
        Number obj1 = (Number) obj;

        Short aShort = 10;
        Integer integer = Integer.valueOf(aShort);
//        Integer integer1 = (Integer) aShort;

        assertEquals("hello", Test1.testInvoke());
    }
}

/*
 * - Can you clone an object without a default constructor?
 */
