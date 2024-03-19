package misc;

import LinkedList.LinkedList;
import LinkedList.LinkedList.Node;

public class AddSumLinkedList {

    public int addSum(Node head) {
        int sum = 0;
        Node current = head;

        while (current != null) {
            sum += current.data;
            current = current.next;
        }

        return sum;
    }

    public static void main(String[] args) {

        LinkedList myNewNode = new LinkedList(5);
        myNewNode.append(5);
        myNewNode.append(1);

    }
}
