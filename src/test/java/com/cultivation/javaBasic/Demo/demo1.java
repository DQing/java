package com.cultivation.javaBasic.Demo;

import com.cultivation.javaBasic.util.DerivedFromSuperClassWithDefaultConstructor;
import com.cultivation.javaBasic.util.SuperClassWithDefaultConstructor;

public class demo1 {

    public static void main(String[] args) {
        DerivedFromSuperClassWithDefaultConstructor[] array = new DerivedFromSuperClassWithDefaultConstructor[4];
        SuperClassWithDefaultConstructor[] arrayWithBaseType = (SuperClassWithDefaultConstructor[]) array;

        SuperClassWithDefaultConstructor superClassWithDefaultConstructor = new SuperClassWithDefaultConstructor();
        arrayWithBaseType[arrayWithBaseType.length - 1] = superClassWithDefaultConstructor;
    }

}
