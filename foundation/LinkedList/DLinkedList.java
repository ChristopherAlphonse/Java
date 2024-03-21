package LinkedList;

public class DLinkedList {

    private Node head;
    private Node tail;
    private int length;

    public DLinkedList(int value) {
        Node newNodeObject = new Node(value);
        head = newNodeObject;
        tail = newNodeObject;
        length = 1;
    }

    static class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
            this.next = null;
            this.prev = null;
        }
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        System.out.println(head.value);
    }

    public void getTail() {
        System.out.println(tail.value);
    }

    public void getLength() {
        System.out.println("L : " + length);
    }

    public void append(int data) {
        Node newNodeObj = new Node(data);
        if (length == 0) {
            head = newNodeObj;
            tail = newNodeObj;
        } else {
            tail.next = newNodeObj;
            newNodeObj.prev = tail;
            tail = newNodeObj;
        }
        length++;
    }

    public Node removeLast() {
        if (tail == null) {
            return null;
        }
        if (head == tail) {
            head = null;
            tail = null;

            return null;
        }
        Node temp = tail;

        while (temp.prev != null) {
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;
        return temp;
    }

    public static void main(String[] args) {
        DLinkedList list = new DLinkedList(0);

        list.append(3);
        list.append(4);
        list.printList();
    }
}
