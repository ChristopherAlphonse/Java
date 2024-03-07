package misc;

public class LinkedList {


	private Node head;
	private Node tail;
	private int length;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public LinkedList(int d) {
		Node newNodeObject = new Node(d);
		head = newNodeObject;
		tail = newNodeObject;
		length = 1;
	}

	public void append(int data) {
		Node newNodeData = new Node(data);

		if (length == 0) {
			head = newNodeData;
			tail = newNodeData;
		} else {
			tail.next = newNodeData;
			tail = newNodeData;
		}
		length++;
	}

	public void prepend(int data) {
		Node newNode = new Node(data);
		if (length == 0) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
		length++;
	}

	public Node removeFirst() {
		if (length == 0)
			return null;
		Node temp = head;
		head = head.next;
		temp.next = null;
		length--;
		if (length == 0) {
			tail = null;
		}
		return temp;
	}

	public Node removeLast() {
		if (length == 0)
			return null;
		Node temp = head;
		Node placeHolder = head;

		while (temp.next != null) {
			placeHolder = temp;
			temp = temp.next;
		}
		tail = placeHolder;
		tail.next = null;
		length--;

		if (length == 0) {
			tail = null;
			head = null;
		}

		return temp;
	}

	public Node find(int data) {
		Node current = head;
		while (current != null) {
			if (current.data == data) {
				return current;
			}
			current = current.next;
		}
		return null;
	}

	public void peekHead() {
		System.out.println(head.data);
	}

	public void peekTail() {
		System.out.println(tail.data);
	}

	public void length() {
		System.out.println(length);

	}

	public void printList() {
		Node current = head;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}

	public Node get(int index) {

		if (index < 0 || index >= length)
			return null;

		Node temp = head;
		for (int i = 0; i < index; i++) {
			temp = temp.next;

		}
		return temp;
	}

	public boolean set(int index, int data) {
		Node temp = get(index);
		if (temp != null) {
			temp.data = data;
			return true;
		}
		return false;
	}

	public boolean insert(int index, int data) {
		if (index < 0 || index > length)
			return false;
		if (index == 0) {
			prepend(data);
			return true;
		}
		Node newNode = new Node(data);
		Node temp = get(index - 1);
		newNode.next = temp.next;
		temp.next = newNode;
		length++;
		return true;
	}

	public Node remove(int index) {
		if (index < 0 || index >= length)
			return null;
		if (index == 0)
			return removeFirst();
		if (index == length - 1)
			return removeLast();
		Node prev = get(index - 1);
		Node temp = prev.next;
		prev.next = temp.next;
		temp.next = null;
		length--;
		return temp;
	}

	public Node reverseList() {
		Node temp = head;
		head = tail;
		tail = temp;
		Node after = temp.next;
		Node before = null;

		for (int i = 0; i < length; i++) {
			after = temp.next;
			temp.next = before;
			before = temp;
			temp = after;
		}
		return temp;
	}

	/*
	 * Methods: append, prepend, removeFirst, removeLast, find,peekHead, peekTail, length,
	 * printList, get, set, insert, remove, reverse.
	 */
	public static void main(String[] args) {
		LinkedList myLinkedList = new LinkedList(0);
		for (int i = 1; i <= 5; i++) {
			myLinkedList.append(i);
		}
		myLinkedList.reverseList();
		myLinkedList.printList();
	}



}
