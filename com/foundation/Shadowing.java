package com.foundation;

public class Shadowing {
    static int x = 90;

    public static void main(String[] args) {
        System.out.println(x); //90
        int x = 30;
        System.out.println(x); // 30
        test();
    }

    static void test() {
        System.out.println(x); // printing the outer x within Shadowing scope
    }
}
