package datastructure;

import java.util.Arrays;
import java.util.Scanner;

public class MyArray {

    public static void main(String[] args) {

        Scanner userIn = new Scanner(System.in);

        /*
         * static 2d array in js `let arr = [[],[],[]] but java int[][] arr = int[][] or int[][] arr
         * = {{}, {}, {}} `
         */

        // in

        int[][] arr = new int[3][3];

        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                arr[row][column] = userIn.nextInt();
            }
        }

        // out

        /*
         * for (int[] ints : arr) { for (int anInt : ints) { System.out.print(anInt + " ");
         * 
         * } System.out.println(); // needed to create matrix }
         */

        /*
         * for (int row = 0; row < arr.length; row++) {
         * System.out.println(Arrays.toString(arr[row])); }
         */

        // enhanced for loop
        for (int[] index : arr) {
            System.out.println(Arrays.toString(index));
        }

        userIn.close();



        /*
         * 1. Array objects are in the heap. 2. Heap objects are not necessarily continuous depends
         * on JVM. 3. (DMA) Dynamic Memory Allocation (objects, arrays, etc.) = heap memory. int[]
         * arr = new int[5] will allocate 5 addresses with initial values of 0, example: [0, 0, 0,
         * 0, 0]. arr.length will return 5, but no data allocated yet. The "new" keyword is used to
         * create an object. The array object will only accept the type it was initialized with
         * unless the type is set to the Object type. Example: `Object[] secondArray = new
         * Object[5]; secondArray[0] = "hello"; secondArray[1] = 75;` [99|1|2|4]
         * System.out.println(arr[0]); output: 99 Primitives are stored in stack memory, and arrays
         * and strings, etc., are stored in heap memory. Garbage collection happens in the heap
         * memory.
         */
    }
}
