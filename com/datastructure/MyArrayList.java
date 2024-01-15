package com.datastructure;

import java.util.ArrayList;
import java.util.Scanner;

public class MyArrayList {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
       /* ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("hello");
        arrayList.add("hell");
        arrayList.add("hel");
        arrayList.add("he");
        arrayList.add("h");
        arrayList.add("w");
        arrayList.add("wo");
        arrayList.add("wor");
        arrayList.add("worl");
        arrayList.add("world");

        System.out.println(arrayList.indexOf(" "));*/


        ArrayList<String> userName = new ArrayList<>();


        for (int i = 0; i < 10; i++) {
            userName.add(userInput.nextLine());

        }
        System.out.println(userName);
    }

}


// Java = ArrayList | JS = Array | Python = List
// Dynamic array waste more memory than a linked list because we need to
// increase the capacity to insert more data, buts don't always need that much
// room.

// Advantages :
// 1. Random access of elements 0(1)
// 2. Good locality of reference and data cache utilization
// 3. Easy to insert/delete at the end

// Disadvantages :
// 1. Waste more memory
// 2. shifting of elements is time-consuming 0(n)
// 3.Expanding/Shrinking the array is time-consuming 0(n)
