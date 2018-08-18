package com.cultivation.javaBasic;

public class Demo {
    public static void main(String[] args){
        int[] array = new int[10];
        int count = 0;
        for (int i = 0; i < 25; i++) {
            array[count++] = i;
        }
        System.out.print(array.length);
    }
}
