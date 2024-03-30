package datastructure;

import java.util.Stack;

public class MyStack {

	public static void main(String[] args) {
		Stack<String> animalStack = new Stack<>();

		animalStack.push("horse");
		animalStack.push("snake");
		animalStack.push("cat");
		animalStack.push("goose");

		String n = animalStack.pop();

		System.out.println(n);
	}
}

// Stack: A Last-In-First-Out (LIFO) Data Structure

// Common uses:
// 1. Undo/redo feature
// 2. Navigating forward or backward with browser buttons
// 3. Backtracking, such as in file directory or maze exploration
// 4. Executing and managing function calls (call stack)
