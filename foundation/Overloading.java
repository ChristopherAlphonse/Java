package foundation;

import java.util.Arrays;

public class Overloading {


    static void demo(int... v) {
        System.out.println(Arrays.toString(v));
    }

    static void demo(String n) {
        System.out.println(n);
    }


    public static void main(String[] args) {
        demo(5, 1, 2, 2, 3, 3, 2, 2, 3, 4, 3, 3, 4, 3, 2); // using var length args aka varargs
        demo("hello there");
    }

}


// function same name different params
// compiler understating the differences in the name base on parameters.
