package datastructure.Stack;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {
	private List<T> list;

	public Stack() {
		list = new ArrayList<>();
	}

	public void push(T element) {
		list.add(element);
	}

	public T pop() {
		if (list.isEmpty()) {
			return null;
		}
		return list.remove(list.size() - 1);
	}

	boolean isEmpty() {
		return list.isEmpty();
	}

	int size() {
		return list.size();
	}

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		for (int i = 1; i <= 3; i++) {
			stack.push(i);
		}

		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}

	}

}
