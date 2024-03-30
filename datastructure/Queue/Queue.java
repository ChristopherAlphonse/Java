package datastructure.Queue;

public class Queue {

	private Node first;
	private Node last;
	private int length;

	class Node {
		int value;
		Node next;

		Node(int value) {
			this.value = value;
		}
	}

	public Queue(int value) {
		Node newNode = new Node(value);
		first = newNode;
		last = newNode;
		length = 1;

	}

	public Node dequeue() {
		if (length == 0)
			return null;
		Node temp = first;
		if (length == 1) {
			first = null;
			last = null;
		} else {
			first = first.next;
			temp.next = null;
		}
		length--;
		return temp;
	}

}
