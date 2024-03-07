package leetcode.MiddleOfTheLinkedList;



class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;


        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }
}


/*
 * Explanation:
 * 
 * 
 * public Node findMiddleNode() { Node slow = head; Node fast = head;
 * 
 * while (fast != null && fast.next != null) { slow = slow.next; fast = fast.next.next; }
 * 
 * return slow; }
 * 
 * 
 * 
 * 
 * This method uses two pointers, slow and fast, and advances them at different speeds through the
 * list. The slow pointer moves one step at a time, while the fast pointer moves two steps at a
 * time. By the time the fast pointer reaches the end of the list, the slow pointer will be at the
 * middle node.
 * 
 * 
 * 
 * Example Odd Number of Nodes:
 * 
 * Let's walk through the algorithm when the linked list has 5 elements. We'll denote these as:
 * 
 * Node1 -> Node2 -> Node3 -> Node4 -> Node5.
 * 
 * Initially:
 * 
 * slow = Node1
 * 
 * fast = Node1
 * 
 * 
 * 
 * First Iteration:
 * 
 * slow = slow.next → slow = Node2
 * 
 * fast = fast.next.next → fast = Node3
 * 
 * Here, slow is at Node2 and fast is at Node3.
 * 
 * 
 * 
 * Second Iteration:
 * 
 * Now, let's check the while condition:
 * 
 * fast is not null (it's Node3).
 * 
 * fast.next is also not null (it's Node4).
 * 
 * We go into the loop again:
 * 
 * slow = slow.next → slow = Node3
 * 
 * fast = fast.next.next → fast = Node5
 * 
 * Here, slow is at Node3 and fast is at Node5.
 * 
 * 
 * 
 * Third Iteration:
 * 
 * Now, let's check the while condition again:
 * 
 * fast is not null (it's Node5).
 * 
 * fast.next is null (end of the list).
 * 
 * 
 * 
 * The while loop will stop because the condition fast != null && fast.next != null is not fully
 * met.
 * 
 * The method then returns slow, which points to Node3, the middle element in this 5-element linked
 * list.
 * 
 * 
 * 
 * Example Even Number of Nodes:
 * 
 * Let's walk through what happens when the linked list has 4 elements. We'll denote these as:
 * 
 * Node1 -> Node2 -> Node3 -> Node4
 * 
 * Initially: slow = Node1, fast = Node1
 * 
 * 
 * First Iteration:
 * 
 * slow = slow.next → slow = Node2
 * 
 * fast = fast.next.next → fast = Node3
 * 
 * Here, slow points to the second node, and fast points to the third node.
 * 
 * 
 * Second Iteration:
 * 
 * Now, let's check the while condition:
 * 
 * fast is not null (it's Node3).
 * 
 * fast.next is also not null (it's Node4).
 * 
 * So, we go into the loop again:
 * 
 * slow = slow.next → slow = Node3
 * 
 * fast = fast.next.next → fast = null
 * 
 * 
 * In the second iteration, slow moves to Node3 and fast tries to jump two steps ahead, but it ends
 * up at null.
 * 
 * Now, the while loop will stop. fast is null, so the condition fast != null && fast.next != null
 * will not be true.
 * 
 * 
 * The method returns slow, which is pointing to Node3, the third element in this 4-element linked
 * list. In the case of an even-numbered linked list, the algorithm returns the second middle
 * element.
 * 
 * 
 * 
 * 
 * 
 * Code with inline comments:
 * 
 * 
 * 
 * public Node findMiddleNode() { // Initialize slow pointer to the head of the linked list Node
 * slow = head;
 * 
 * // Initialize fast pointer to the head of the linked list Node fast = head;
 * 
 * // Traverse the linked list with two pointers: slow and fast // slow moves one node at a time,
 * while fast moves two nodes at a time while (fast != null && fast.next != null) { // Move slow
 * pointer to the next node slow = slow.next;
 * 
 * // Move fast pointer to the next two nodes fast = fast.next.next; }
 * 
 * // Return the Node object representing the middle node of the linked list return slow; }
 * 
 */
