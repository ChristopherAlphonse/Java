package com.datastructures;

import java.util.LinkedList;

public class MyLinkList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.offer("hello");
        linkedList.offer("hell");
        linkedList.offer("he");
        linkedList.addFirst("random");
        linkedList.offer("hel");

        linkedList.addFirst("firstPlace");
        linkedList.addLast("lastPlace");

        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        System.out.println(linkedList);

    }

}

// Linked Lists: A dynamic way to organize data. Nodes have two parts (data +
// address).
// They aren't in consecutive memory locations and are connected by pointers.

// Singly Linked List:
// Each node points to the next one, creating a one-way street.

// Doubly Linked List:
// Each node points to both the previous and next nodes, forming a two-way
// street.
// This allows traversal in both forward and backward directions, adding
// flexibility with a bit more complexity.

// Singly linked list
// [data | next] -> [data | next] -> [data | next]

// Doubly linked list
// [prev | data | next] <-> [prev | data | next]

// Advantages:
// 1. Grows and shrinks as needed.
// 2. Adding or removing nodes is easy (quick).
// 3. Minimizes memory waste.

// Disadvantages:
// 1. Uses a bit more memory (extra link).
// 2. Can't directly jump to a specific spot (no index).
// 3. Takes more time to find things. O(n) for search.

// Uses:
// 1. Like a stack or queue.
// 2. GPS navigation paths.
// 3. Managing a music playlist.
