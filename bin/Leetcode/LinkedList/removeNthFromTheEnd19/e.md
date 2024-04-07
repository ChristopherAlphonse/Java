# Removing Nth Node from the End of a Linked List

## Description

The method aims to remove the Nth node from the end of a linked list. It does so efficiently using two pointers approach.

## Method Explanation

-   **Initialization**:

    -   Create a dummy node with value 0 and set its next pointer to the head of the linked list.
    -   Initialize two pointers, `left` and `right`, both pointing to the dummy node.

-   **Finding the Nth Node from the End**:

    -   Move the `right` pointer ahead by N steps. This positions the `right` pointer N nodes ahead of the `left` pointer.

-   **Traversing to the End**:

    -   Move both `left` and `right` pointers simultaneously until the `right` pointer reaches the end of the linked list.

-   **Removing the Nth Node**:

    -   Once the `right` pointer reaches the end, the `left` pointer will be pointing to the node just before the Nth node from the end.
    -   Adjust the next pointer of the `left` pointer to skip the Nth node, effectively removing it from the list.

-   **Returning the Updated List**:
    -   Return the next node of the dummy node, which represents the updated head of the list.

## Method Signature

```java
public ListNode removeNthFromEnd(ListNode head, int n)
  ListNode dummy = new ListNode(0);
   dummy.next = head;
```
