package misc;

import misc.LinkedList.Node;

public class ZipperLinkedList {

    public Node zipperList(Node head1, Node head2) {
        Node tail = head1;
        Node node1 = tail.next;
        Node node2 = head2;
        int counter = 0;

        while (node1 != null && node2 != null) {
            if (counter % 2 == 0) {
                tail.next = node2;
                node2 = node2.next;
            } else {
                tail.next = node1;
                node1 = node1.next;
            }
            tail = tail.next;
            counter++;
        }

        if (node1 != null) {
            tail.next = node1;
        }
        if (node2 != null) {
            tail.next = node2;
        }

        return head1;
    }
}
