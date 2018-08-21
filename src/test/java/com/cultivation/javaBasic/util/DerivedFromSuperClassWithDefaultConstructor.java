package com.cultivation.javaBasic.util;

public class DerivedFromSuperClassWithDefaultConstructor extends SuperClassWithDefaultConstructor {
    public DerivedFromSuperClassWithDefaultConstructor() {
        addLog("DerivedFromSuperClassWithDefaultConstructor.constructor()");
    }

    public DerivedFromSuperClassWithDefaultConstructor(int arg) {
        //this(….)方法必须出现在构造器中的第一行，用来调用其他重载构造器。调用时参数必须严格匹配。
        this();
        addLog("DerivedFromSuperClassWithDefaultConstructor.constructor(int)");
    }

    public DerivedFromSuperClassWithDefaultConstructor(String arg) {
        super(arg);
        addLog("DerivedFromSuperClassWithDefaultConstructor.constructor(String)");
    }
}
