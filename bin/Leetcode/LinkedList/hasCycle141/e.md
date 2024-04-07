# Detecting Cycle in a Linked List

## Description

The method aims to detect whether there is a cycle or loop present in a given linked list. It utilizes Floyd's cycle-finding algorithm, also known as the "tortoise and the hare" algorithm, to identify the loop.

This algorithm employs two pointers: a slow pointer and a fast pointer. The slow pointer advances one node at a time, while the fast pointer moves two nodes at a time. If there exists a loop in the linked list, these two pointers will eventually meet at some node. However, if there is no loop, the fast pointer will reach the end of the list.

## Method Guidelines

-   **Initialization**: Create two pointers, `slow` and `fast`, both initially pointing to the head of the linked list.
-   **Traversal**: Traverse the list with the `slow` pointer moving one step at a time and the `fast` pointer moving two steps at a time.
-   **Detection**:
    -   If there is a loop in the list, the fast pointer will eventually intersect with the slow pointer. In such a scenario, the method should return `true`.
    -   If the fast pointer reaches the end of the list or encounters a null value, indicating no loop, the method should return `false`.

## Output

-   Return `true` if the linked list has a loop.
-   Return `false` if the linked list does not have a loop.

## Constraints

-   Prohibited from using additional data structures such as arrays or modifying the existing data structure.
-   Limited to traversing the linked list only once.

## Method Signature

```java
Linked List with a Loop

Head -> Node1 -> Node2 -> Node3 -> Node4 -> Node5 -> Node2 (points back to Node2)


Linked List without a Loop
Head -> Node1 -> Node2 -> Node3 -> Node4 -> Node5 -> null

```
