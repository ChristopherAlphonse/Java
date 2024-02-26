package com.misc;

public class LinkedList {

	private Node head;
	private Node tail;
	private int length;

	class Node {
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

	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	public void getHeadNode() {
		System.out.println(head.data);
	}

	public void getTailNode() {
		System.out.println(tail.data);
	}

	public void getLengthOfNode() {
		System.out.println(length);
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

	}

	public Node removeFirst() {

		// objective declare a temp var to head , then nullify head, then temp if null , then length then
		// decrease the
		// length
		// when there no long a pointer on the Node.

		if (length == 0)
			return null;

	}

	public Node removeLast() {
		if (length == 0)
			return null;
		// check for length
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

	public static void main(String[] args) {
		LinkedList myLinkedList = new LinkedList(2);
		myLinkedList.append(3);
		myLinkedList.append(4);
		myLinkedList.prepend(1);

		//

		myLinkedList.printList();

		System.out.println("The length : " + myLinkedList.length);
	}

}
