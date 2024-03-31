package datastructure.Stack;

public class StackList {

	private Node top;
	private int height;

	class Node {
		int value;
		Node next;

		Node(int value) {
			this.value = value;
		}
	}

	public StackList(int value) {
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

	public Node pop() {
		if (height == 0)
			return null;

		Node temp = top;
		top = top.next;
		temp.next = null;

		height--;
		return temp;
	}

	void printStack() {
		Node temp = top;
		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		StackList myStack = new StackList(10);
		myStack.push(20);
		myStack.push(30);
		myStack.push(0);
		myStack.printStack();
	}
}
