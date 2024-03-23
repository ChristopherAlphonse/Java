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

    private void append(int data) {
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

    public Node get(int index) {
        if (index < 0 || index >= length)
            return null;

        Node temp = head;
        if (index < length / 2) {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            temp = tail;
            for (int i = length - 1; i > index; i--) {
                temp = temp.prev;
            }
        }
        return temp;
    }

    public boolean set(int index, int value) {

        Node temp = get(index);
        if (temp != null) {
            temp.value = value;
        }
        return false;
    }

    public Node insert(int pos, int value) {
        if (pos < 0 || pos > length) {
            return null;
        }
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
            // if null make first node
        } else if (pos == 0) {
            newNode.next = head;
            newNode.prev = newNode;
            head = newNode;
            // if at the first node 0(1)
        } else if (pos == length) {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            // if at the tail 0(1)
        } else {
            Node current;
            if (pos < length / 2) {
                current = head;
                for (int i = 0; i < pos; i++) {
                    current = current.next;
                }
            }
            // if exist in the first half
            else {
                current = tail;
                for (int i = length - 1; i > pos; i--) {
                    current = current.prev;
                }
            }

            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.prev = newNode;
            // make new node join , officially a member of the club
        }

        length++;
        return newNode;

    }

    public Node remove(int index) {
        if (index < 0 || index >= length)
            return null;
        Node temp = head;

        /* remove first index */
        if (index == 0) {
            head = temp.next;
            if (head != null)
                head.prev = null;
            temp.next = null;
            /* remove last index */
        } else if (index == length - 1) {
            temp = tail;
            tail = tail.prev;
            if (tail != null)
                tail.next = null;
            temp.prev = null;
        } else if (index < length / 2) {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        } else {
            temp = tail;
            for (int i = length - 1; i > index; i--) {
                temp = temp.prev;
            }
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
        length--;
        return temp;
    }

    public static void main(String[] args) {
        DLinkedList list = new DLinkedList(0);

        list.append(3);
        list.append(4);
        list.insert(0, 99);

        list.printList();
    }
}
