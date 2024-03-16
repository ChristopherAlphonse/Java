package leetcode.LinkedList.removeDups;

public void removeDuplicates() {
    Set<Integer> values = new HashSet<>();
    
    Node prev = null;
    Node curr = head;
    
    while (curr != null) {
        if (values.contains(curr.value)) {
            // Skip the duplicate node by adjusting the previous node's next pointer
            prev.next = curr.next;
            length--; // Decrease the length since a duplicate is removed
        } else {
            // Add the current node's value to the set
            values.add(curr.value);
            // Move the previous pointer to the current node
            prev = curr;
        }
        // Move to the next node
        curr = curr.next;
    }
}
 



/*
 * Pseudo Code (for solution that uses a set):

Create an empty HashSet called values to store the unique node values encountered in the linked list.

Initialize two pointers: previous set to null, and current pointing to the head of the list.

Start a while loop that continues until current is null: a. Check if values contains the value of the current node. i. If it does, update the next pointer of the previous node to skip the current node (i.e., previous.next = current.next), and decrement the list length by 1. b. If it does not, add the value of the current node to the values set and update the previous pointer to point to the current node. c. Move current one step ahead (i.e., current = current.next).

When the while loop ends, all duplicate nodes will have been removed from the list.
*/
