package com.cultivation.javaBasic.util;

@SuppressWarnings("unused")
public class OverloadingFixture {
    //但是java总是给你一个默认的不可见的空构造函数( 如果你不重新定义一个) 。
    public String methodWithOneParameter(String value) {
        return "methodWithOneParameter(String)";
    }

    public String methodWithOneParameter(Object value) {
        return "methodWithOneParameter(Object)";
    }

    public String methodWithTwoParameters(String string, Integer integer) {
        return "methodWithTwoParameters(String, Integer)";
    }

    public String methodWithTwoParameters(String string, Number number) {
        return "methodWithTwoParameters(String, Number)";
    }
}
