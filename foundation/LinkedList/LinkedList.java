package foundation.LinkedList;

import java.util.HashSet;
import java.util.Set;

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
		Node current = head;
		head = head.next;
		current.next = null;
		length--;
		if (length == 0) {
			tail = null;
		}
		return current;
	}

	public Node removeLast() {
		if (length == 0)
			return null;
		Node current = head;
		Node placeHolder = head;

		while (current.next != null) {
			placeHolder = current;
			current = current.next;
		}
		tail = placeHolder;
		tail.next = null;
		length--;

		if (length == 0) {
			tail = null;
			head = null;
		}

		return current;
	}

	public Node find(int target) {
		Node current = head;
		while (current != null) {
			if (current.data == target) {
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

		Node current = head;
		for (int i = 0; i < index; i++) {
			current = current.next;

		}
		return current;
	}

	public Node getNodeValue(Node head, int target) {
		Node current = head;

		while (current != null) {
			if (target == current.data) {
				return current;
			}
			current = current.next;
		}

		return null;
	}

	public boolean set(int index, int data) {
		Node current = get(index);
		if (current != null) {
			current.data = data;
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
		Node current = get(index - 1);
		newNode.next = current.next;
		current.next = newNode;
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
		Node current = prev.next;
		prev.next = current.next;
		current.next = null;
		length--;
		return current;
	}

	public Node reverseList() {
		Node current = head;
		head = tail;
		tail = current;
		Node before = null;

		while (current != null) {
			Node after = current.next;
			current.next = before;
			before = current;
			current = after;
		}
		return tail;
	}

	public Node findMiddleNode(Node head) {
		Node slow = head;
		Node fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;

	}

	public int addSum(Node head) {
		int sum = 0;
		Node current = head;

		while (current != null) {
			sum += current.data;
			current = current.next;
		}

		return sum;
	}

	public void removeDuplicates() {
		Set<Integer> values = new HashSet<>();

		Node prev = null;
		Node curr = head;

		while (curr != null) {
			if (values.contains(curr.data)) {
				prev.next = curr.next;
				length -= 1;
			} else {
				values.add(curr.data);
				prev = curr;

			}
			curr = curr.next;

		}
	}

	public boolean hasCycle(Node head) {
		Node fast = head;
		Node slow = head;

		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if (fast == slow)
				return true;
		}
		return false;

	}

	public Node findKthFromEnd(int k) {

		Node slow = head;
		Node fast = head;

		// Move fast pointer k steps ahead
		for (int i = 0; i < k; i++) {
			if (fast == null) {
				return null;
			}
			fast = fast.next;
		}

		// Move both pointers until fast reaches the end
		while (fast != null) {
			slow = slow.next;
			fast = fast.next;
		}

		return slow;
	}

	public Node removeNthFromEnd(Node head, int n) {
		Node dummy = new Node(0);
		dummy.next = head;
		Node left = dummy;
		Node right = dummy;

		for (int i = 0; i <= n; i++) {
			right = right.next;
		}

		while (right != null) {
			left = left.next;
			right = right.next;
		}

		left.next = left.next.next;

		return dummy.next;
	}

	/*
	 * Methods: append, prepend, removeFirst, removeLast, find,peekHead, peekTail, length,
	 * printList, get, set, insert, remove, reverse,findMiddleNode.
	 */

	public static void main(String[] args) {
		LinkedList myLinkedList = new LinkedList(0);
		for (int i = 1; i <= 20; i++) {
			myLinkedList.append(i);
		}

		Node middleNode = myLinkedList.findMiddleNode(myLinkedList.head);
		System.out.println(middleNode.data);
	}

}
