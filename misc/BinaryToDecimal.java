package misc;

import foundation.LinkedList.LinkedList.Node;

public class BinaryToDecimal {
    public int binaryToDecimal(Node head) {
        int num = 0;
        Node current = head;
        while (current != null) {
            num = (num * 2) + current.data;
            current = current.next;
        }
        return num;
    }

}
