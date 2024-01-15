package com.datastructure;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        swap(arr);
        System.out.println(Arrays.toString(arr));

    }


    static void swap(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[2];
        arr[2] = temp;
    }
}
