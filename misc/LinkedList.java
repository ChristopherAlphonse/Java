package misc;

import java.util.logging.Logger;

public class LinkedList {
	Logger logger = Logger.getLogger(getClass().getName());

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

	public Node get(int index) {

		if (index < 0 || index >= length)
			return null;

		Node temp = head;
		for (int i = 0; i < index; i++) {
			temp = temp.next;

		}
		return temp;
	}

	public Node remove(int data) {
		if (head == null) {
			return null;
		}
		if (head.data == data) {
			head = head.next;
			return head;
		}
		Node current = head;
		while (current.next != null) {
			if (current.next.data == data) {
				current.next = current.next.next;
				return head;
			}
			current = current.next;
		}
		return head;
	}

	public void peekHead() {
		System.out.println(head.data);
	}

	public void peekTail() {
		System.out.println(tail.data);
	}

	public void getLength() {
		System.out.println(length);

	}

	public void printList() {
		Node current = head;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}

	public static void main(String[] args) {
		LinkedList myLinkedList = new LinkedList(0);
		myLinkedList.append(1);
		myLinkedList.append(2);
		myLinkedList.append(3);
		myLinkedList.append(4);
		myLinkedList.append(5);

		myLinkedList.printList();


	}
}
