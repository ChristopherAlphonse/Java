package leetcode.LinkedList.reversedBetween;

public class ReverseBetweenNode {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        ListNode previousNode = dummyNode;

        // Move previousNode to the node just before the left position
        for (int i = 0; i < left - 1; i++) {
            previousNode = previousNode.next;
        }

        ListNode currentNode = previousNode.next;

        // Reverse the sublist from left to right
        for (int i = 0; i < right - left; i++) {
            ListNode nodeToMove = currentNode.next;
            currentNode.next = nodeToMove.next;
            nodeToMove.next = previousNode.next;
            previousNode.next = nodeToMove;
        }

        return dummyNode.next; // Return the modified list
    }

}

/**
 * Check if the head of the list is null.
 * 
 * If the list is empty, there is nothing to reverse. Return immediately (do nothing).
 * 
 * Create a dummyNode with value 0.
 * 
 * This node serves as a placeholder to simplify operations involving the list head.
 * 
 * Set the next pointer of dummyNode to point to the head of the list.
 * 
 * Initialize a variable previousNode and set it to dummyNode.
 * 
 * previousNode will track the node right before the segment we want to reverse.
 * 
 * Move previousNode forward startIndex steps to position it just before the start of the segment to
 * reverse.
 * 
 * Use a loop with an index i going from 0 to startIndex.
 * 
 * Set a currentNode variable to point to the next node after previousNode.
 * 
 * currentNode will be the first node of the segment to be reversed.
 * 
 * Now we're ready to reverse the segment.
 * 
 * Perform the following steps endIndex - startIndex times:
 * 
 * Set a nodeToMove variable to point to the next node after currentNode. This is the node we will
 * "cut" from the segment and "paste" to the front of the segment.
 * 
 * Update currentNode.next to skip over nodeToMove and point to the node right after nodeToMove.
 * 
 * Set the next pointer of nodeToMove to point to the node at the front of the segment. This is the
 * node that previousNode.next is pointing to.
 * 
 * Update previousNode.next to point to nodeToMove. nodeToMove has now been moved to the front of
 * the segment.
 * 
 * After the loop, the segment between startIndex and endIndex is reversed.
 * 
 * Update the head of the list to point to the actual first node (not dummyNode).
 * 
 * Set head to point to dummyNode.next.
 */
