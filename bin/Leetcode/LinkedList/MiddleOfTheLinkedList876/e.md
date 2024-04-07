# Explanation

This method finds the middle node of a linked list using two pointers: slow and fast. The slow pointer moves one step at a time, while the fast pointer moves two steps at a time. By the time the fast pointer reaches the end of the list, the slow pointer will be at the middle node.

## Example with Odd Number of Nodes

Consider a linked list with 5 elements: Node1 -> Node2 -> Node3 -> Node4 -> Node5.

Initially:

-   `slow` points to Node1
-   `fast` points to Node1

### First Iteration

-   `slow` moves to the next node: Node2
-   `fast` moves two steps ahead: Node3

### Second Iteration

-   Both `slow` and `fast` move forward:
    -   `slow`: Node3
    -   `fast`: Node5

### Third Iteration

-   `fast` moves ahead by two steps, reaching the end (Node5).
-   `slow` is now at Node3, the middle element.

## Example with Even Number of Nodes

Consider a linked list with 4 elements: Node1 -> Node2 -> Node3 -> Node4.

Initially:

-   `slow` points to Node1
-   `fast` points to Node1

### First Iteration

-   `slow` moves to Node2
-   `fast` moves to Node3

### Second Iteration

-   `slow` moves to Node3
-   `fast` attempts to move two steps ahead but reaches the end (null).

The loop stops because `fast` is null, and the condition `fast != null && fast.next != null` is not true.
The method returns `slow`, which points to Node3, the third element in this 4-element linked list.

```java
public Node findMiddleNode() {
    Node slow = head; // Initialize slow pointer to the head of the linked list
    Node fast = head; // Initialize fast pointer to the head of the linked list

    // Traverse the linked list with two pointers: slow and fast
    // slow moves one node at a time, while fast moves two nodes at a time
    while (fast != null && fast.next != null) {
        // Move slow pointer to the next node
        slow = slow.next;

        // Move fast pointer to the next two nodes
        fast = fast.next.next;
    }

    // Return the Node object representing the middle node of the linked list
    return slow;
}
```
