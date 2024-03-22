package datastructure;

import java.util.Stack;

public class MyStack {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("dog");
        stack.push("cat");
        stack.push("horse");
        stack.push("snake");

        Object searchStack = stack.search("dog");

        System.out.println(stack.size());
        System.out.println(searchStack);

    }
}

// Stack: A Last-In-First-Out (LIFO) Data Structure

// Common uses:
// 1. Undo/redo feature
// 2. Navigating forward or backward with browser buttons
// 3. Backtracking, such as in file directory or maze exploration
// 4. Executing and managing function calls (call stack)
