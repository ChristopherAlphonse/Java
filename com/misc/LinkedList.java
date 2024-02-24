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

	public static void main(String[] args) {
		LinkedList myLinkedList = new LinkedList(101);

		myLinkedList.append(24);
		myLinkedList.append(39);
		myLinkedList.append(43);


		myLinkedList.printList();
		System.out.println("The length : " + myLinkedList.length);
	}
}




