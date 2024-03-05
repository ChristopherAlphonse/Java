package datastructure;

import java.util.Scanner;

public class MyDynamicArray {

    private int size;
    private int capacity = 10;
    private Object[] array;

    public MyDynamicArray() {
        this.array = new Object[capacity];
    }

    /*
     * public static void main(String[] args) { MyDynamicArray dynamicArray = new MyDynamicArray();
     * System.out.println(dynamicArray.capacity); }
     */

    public static void main(String[] args) {
        MyDynamicArray array = new MyDynamicArray();
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter data, please. It must be a string or an integer primitive type.");
        array.add(userInput.nextLine());

        System.out.println(array.size);
        userInput.close();
    }

    /* Using overloading for add method, allowing different argument types */
    public void add(int e) {
        ensureCapacity();
        array[size++] = e;
    }

    public void add(String e) {
        ensureCapacity();
        array[size++] = e;
    }

    private void ensureCapacity() {
        if (size == capacity) {
            capacity *= 2; // Double the capacity if the array is full
            Object[] newArray = new Object[capacity];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
    }
}


// this to be looked at in the future, good idea but not implemented well.
