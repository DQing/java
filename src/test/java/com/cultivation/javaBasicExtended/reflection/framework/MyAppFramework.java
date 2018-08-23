package com.cultivation.javaBasicExtended.reflection.framework;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("WeakerAccess")
public class MyAppFramework {
    final Map providers = new HashMap();

    public void registerController(Class controllerClazz) {
        // TODO: Please implement the method
        // <--start
        if (providers.containsKey(controllerClazz.getName())) {
            throw new IllegalArgumentException();
        }
        providers.put(controllerClazz.getName(), controllerClazz);
        // --end-->
    }

    public Response getResponse(String requestController, String requestMethod) {
        // TODO: Please implement the method
        // <--start
        throw new NotImplementedException();
        // --end-->
    }

    // TODO: You can add additional methods here if you want
    // <--start
    // --end-->
}