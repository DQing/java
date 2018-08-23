package com.cultivation.javaBasic.Demo;

public class demo2 {
    public static void main(String[] args) {
        demo2 demo2 = new demo2();
        demo2.test(1);
    }

    public int test(int i, int j) {
        return i + j;
    }

    public int test(int... i) {
        return i.length;
    }

    public int test(int i) {
        return i;
    }
}
