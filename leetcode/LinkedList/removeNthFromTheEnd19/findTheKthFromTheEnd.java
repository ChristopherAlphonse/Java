package leetcode.LinkedList.removeNthFromTheEnd19;

import org.w3c.dom.Node;



public class findTheKthFromTheEnd {



    public Node findKthFromEnd(int k) {

        Node slow = head;
        Node fast = head;

        // Move fast pointer k steps ahead
        for (int i = 0; i < k; i++) {
            if (fast == null) {
                return null;
            }
            fast = fast.next;
        }

        // Move both pointers until fast reaches the end
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }

}
