package com.datastructures;

public class MyDynamicArray {

    int size;
    int capacity = 10;
    Object[] array;

    public MyDynamicArray(int capacity) {
        this.capacity = capacity;
        this.array = new Object[capacity];
    }

    public MyDynamicArray() {
        this.array = new Object[capacity];
    }

    public static void main(String[] args) {
        MyDynamicArray dynamicArray = new MyDynamicArray();
        System.out.println(dynamicArray.capacity);
    }
}
