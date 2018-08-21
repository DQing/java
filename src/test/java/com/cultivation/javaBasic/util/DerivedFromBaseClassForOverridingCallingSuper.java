package com.cultivation.javaBasic.util;

public class DerivedFromBaseClassForOverridingCallingSuper extends BaseClassForOverriding {
    @Override
    public String getName(String name) {
        return super.getName("sss") + "->DerivedFromBaseClassForOverridingCallingSuper";
    }
}
