package com.cultivation.javaBasic.showYourIntelligence;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

@SuppressWarnings({"unused", "FieldCanBeLocal"})
public class MyStack {
    private int[] storage;
    private int capacity;
    private int count;  //这里count的作用？
    private static final int GROW_FACTOR = 2;

    public MyStack(int initialCapacity) {
        if (initialCapacity < 1) {
            throw new IllegalArgumentException("Capacity too small.");
        }

        capacity = initialCapacity;
        storage = new int[initialCapacity];
        count = 0;
    }

    public void push(int value) {
        if (count == capacity) {
            ensureCapacity();
        }

        // TODO: Please push the value into the storage here.
        // <--start
        storage[count++] = value;
        //      throw new NotImplementedException();
        // --end-->
    }

    private void ensureCapacity() {
        int newCapacity = capacity * GROW_FACTOR;

        // TODO: Please create a new array of size newCapacity. And update related fields
        // TODO: You SHOULD NOT USE COLLECTIONS OTHER THAN ARRAY.
        // <--start
        int[] newStorage = new int[newCapacity];
        capacity = newCapacity;
        System.arraycopy(storage, 0, newStorage, 0, storage.length);
        storage = newStorage;
        //        throw new NotImplementedException();
        // --end-->
    }

    public int[] popToArray() {
        final int totalItemsCount = count;
        int[] array = new int[totalItemsCount];

        while (count > 0) {
            array[totalItemsCount - count] = pop();
        }

        return array;
    }

    private int pop() {
        // TODO: Please pop one element from the array.
        // <--start
        return storage[--count];
        // --end-->

//        throw new UnsupportedOperationException("Stack is empty.");//这个可以注释？

    }
}
