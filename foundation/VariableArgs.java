package foundation;

import java.util.Arrays;

public class VariableArgs {
    static void fun(int... a) {
        System.out.println("Expected arr length " + a.length);

        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        fun(100);
        fun(1, 2, 3, 4, 5);
    }
}


/*
 * Varargs : similar to spread op in JS, but operate differently
 * 
 * varargs also at the end or the args passing through the function
 */
