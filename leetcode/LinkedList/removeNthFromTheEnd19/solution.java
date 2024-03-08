package leetcode.LinkedList.removeNthFromTheEnd19;

import java.util.List;

class solution {
    public List removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode left = dummy;
        ListNode right = dummy;


        for (int i = 0; i <= n; i++) {
            right = right.next;
        }


        while (right != null) {
            left = left.next;
            right = right.next;
        }


        left.next = left.next.next;

        return dummy.next;
    }
}
