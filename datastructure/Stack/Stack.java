package datastructure.Stack;

public class Stack {

	private Node top;
	private int height;

	class Node {
		int value;
		Node next;

		Node(int value) {
			this.value = value;
		}
	}

	public Stack(int value) {
		Node newNode = new Node(value);
		top = newNode;
		height = 1;
	}

	void push(int value) {
		Node newNode = new Node(value);

		if (height == 0) {
			top = newNode;
		} else {
			newNode.next = top;
			top = newNode;

		}
		height++;

	}

	int pop() {
		if (top == null) {
			throw new IllegalStateException("Stack is empty");
		}
		int value = top.value;
		top = top.next;
		height--;
		return value;
	}

	void printStack() {
		Node temp = top;
		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		Stack myStack = new Stack(10);
		myStack.push(20);
		myStack.push(30);
		myStack.push(0);

		myStack.printStack();
	}
}
