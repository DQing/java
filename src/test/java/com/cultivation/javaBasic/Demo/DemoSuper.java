package com.cultivation.javaBasic.Demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class DemoSuper {
//    static String superStaticVar = "父类静态变量";
//    String superVar = "父类变量";

    public DemoSuper() {
        System.out.println("父类无参构造函数");
    }

    public DemoSuper(int i) {
        System.out.println("父类有参构造函数");
    }
}
