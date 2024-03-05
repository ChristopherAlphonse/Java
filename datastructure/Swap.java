package datastructure;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        swap(arr, 0, 4);
        System.out.println(
                " ------------------------------------BEFORE---------------------------------------");
        System.out.println(Arrays.toString(arr));

        System.out.println(
                " ------------------------------------AFTER----------------------------------------");
        reverse(arr);
        System.out.println(Arrays.toString(arr));


    }


    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // swapping the values
            swap(arr, start, end);
            start++;
            end--;

        }


    }


    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
