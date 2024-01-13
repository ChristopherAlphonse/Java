package com.datastructures;

public class MyArray {
    public static void main(String[] args) {
        int[] arr = new int[5];

    }

}

/*
 * 1. array object are in heap
 * 2. heap objects are not continuous
 * 3. (DMA) dynamic memory allocation (objects, arrays, etc.) = heap memory
 * 4. may not always be continuous; depends on JVM
 * int[] arr = new int[5] will allocate 5 address with initial value of null, example: [0, 0, 0, 0, 0]
 * arr.length will return 5, but no data allocated yet.
 * (new) keyword is used to create an object. the array object will only accept the type it was initialized with
 * unless, the type is set to Object type.
 * Example: ``` Object[] secondArray = new Object [5]. secondArray[0] = "hello"; secondArray[1] = 75; ```
 * [99|1|2|4] sout(arr[0]) // system.out.println: 99
 *primitive are store in stack memory and array and string etc are store in heap memory.
 * garbage collection happens in the heap memory
 */
