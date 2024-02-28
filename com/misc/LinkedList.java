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

	public void peekHead() {
		System.out.println(head.data);
	}

	public void peekTail() {
		System.out.println(tail.data);
	}

	public void getLength() {
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


	public Node fecthIndex(int index) {
		if (index < 0 || index >= length) {
			return null;

			
		}
	}

	public static void main(String[] args) {
		LinkedList myLinkedList = new LinkedList(1);
		myLinkedList.peekTail();
		myLinkedList.append(12);
		myLinkedList.append(13);
		myLinkedList.prepend(1);


		System.out.println("The length : ");
		myLinkedList.getLength();

	}

}
