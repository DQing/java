package com.cultivation.javaBasic.Demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Demo extends DemoSuper {
    public Demo() {
        System.out.println("子类构造函数");
    }

    public Demo(int i) {
        super(i);
        System.out.println("子类有惨构造函数");
    }

    public static void main(String[] args) {
//        Demo demo = new Demo();
        Demo demo = new Demo(1);

    }

}
