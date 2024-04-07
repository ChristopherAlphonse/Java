/*
 * 86. Partition List Solved Medium Topics Companies Given the head of a linked list and a value x,
 * partition it such that all nodes less than x come before nodes greater than or equal to x.
 * 
 * You should preserve the original relative order of the nodes in each of the two partitions.
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: head = [1,4,3,2,5,2], x = 3 Output: [1,2,2,4,3,5] Example 2:
 * 
 * Input: head = [2,1], x = 2 Output: [1,2]
 * 
 * 
 * Constraints:
 * 
 * The number of nodes in the list is in the range [0, 200]. -100 <= Node.val <= 100 -200 <= x <=
 * 200
 */

class Solution {
    public ListNode partition(ListNode head, int x) {
        if (head == null)
            return null;

        ListNode dummy1 = new ListNode(0);
        ListNode dummy2 = new ListNode(0);
        ListNode prev1 = dummy1;
        ListNode prev2 = dummy2;
        ListNode current = head;

        while (current != null) {
            if (current.val < x) {
                prev1.next = current;
                prev1 = current;
            } else {
                prev2.next = current;
                prev2 = current;
            }
            current = current.next;
        }

        prev2.next = null;
        prev1.next = dummy2.next;

        return dummy1.next;
    }
}

/*
 * Solution; Check for Empty List: if (head == null) return; The first line of code checks whether
 * the linked list is empty. If the head pointer is null, there's nothing to partition. The method
 * immediately returns, avoiding any further computations.
 * 
 * Create Dummy Nodes: Node dummy1 = new Node(0); Node dummy2 = new Node(0); Two dummy nodes are
 * created with value 0. These act as temporary placeholders and make it easier to manage the two
 * new lists being formed—one for nodes less than x and another for nodes greater than or equal to
 * x.
 * 
 * Initialize Tracker Variables: Node prev1 = dummy1; Node prev2 = dummy2; Two variables, prev1 and
 * prev2, are initialized to point to the dummy nodes. These variables will help us keep track of
 * the last nodes in each of our two new lists as we build them.
 * 
 * Initialize Current Node: Node current = head; A variable named current is initialized to point to
 * the head of the list. This current node will be the starting point for our iteration through the
 * linked list.
 * 
 * Iterate Through the List: while (current != null) { ... } A while loop is used to iterate through
 * the original linked list. This loop will keep running until we reach the end of the list,
 * signified by current becoming null.
 * 
 * Inside the Loop:
 * 
 * a. Nodes with Value Less Than x: if (current.value < x) { ... } If the current node's value is
 * less than x, we append it to the end of the list being built by prev1.
 * 
 * b. Nodes with Value Greater or Equal to x: else { ... } If the current node's value is greater
 * than or equal to x, we append it to the end of the list being built by prev2.
 * 
 * c. Move to Next Node: current = current.next; After deciding where the current node should be
 * placed, we advance current to the next node in the list for the next iteration.
 * 
 * Mark End of Second List: prev2.next = null; After the while loop ends, we need to ensure that the
 * end of the list managed by prev2 is properly marked. We set the next pointer of the last node to
 * null.
 * 
 * Connect The Two Lists: prev1.next = dummy2.next; Now, we connect the two lists to form a single,
 * partitioned list. The next pointer of the last node in the list tracked by prev1 is set to the
 * first actual node in the list tracked by dummy2.
 * 
 * Update Head Pointer: head = dummy1.next; Finally, the head of the original list is updated to
 * point to the first actual node in the list tracked by dummy1. This effectively completes the
 * partitioning process.
 * 
 * 
 */
