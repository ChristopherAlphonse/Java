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

	public Node removeLast() {
		if (length == 0)
			return null;
		// check for length
		Node temp = head;
		Node placeHolder = head;
		// while loops runs until temp.next is = to null
		while (temp.next != null) {
			placeHolder = temp;
			temp = temp.next;
		}
		tail = placeHolder;
		tail.next = null;
		length--;
		// if there no items remain head and tail should not point to zero but null
		if (length == 0) {
			tail = null;
			head = null;
		}

		return temp;
	}

	public void prepend(int data) {
		Node newNode = new Node(data);
		if (length == 0) {
			head = newNode;
			tail = newNode;
		}

	}

	public static void main(String[] args) {
		LinkedList myLinkedList = new LinkedList(101);

		myLinkedList.append(24);
		myLinkedList.append(39);

		System.out.println(myLinkedList.removeLast());
		System.out.println(myLinkedList.removeLast());
		System.out.println(myLinkedList.removeLast());
		System.out.println(myLinkedList.removeLast());

		myLinkedList.printList();
		System.out.println("The length : " + myLinkedList.length);
	}

}
