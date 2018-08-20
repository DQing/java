package com.cultivation.javaBasic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Demo {
    public static void main(String[] args) {
        double result1 = 1 / 2;
        System.out.print(result1);
    }

    @Test
    void test() {
        final double result1 = 1 / 2.0;
        final double result2 = 1 / 2.00;

        assertEquals(result1, result2);

    }
}
