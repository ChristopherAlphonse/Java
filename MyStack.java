import java.util.Stack;

public class MyStack {

  public static void main(String[] args) {
    Stack<String> stack = new Stack<String>();

    stack.push("dog");
    stack.push("cat");
    stack.push("horse");
    stack.push("snake");

    Object searchStack = stack.search("dog");

    System.out.println(stack);
    System.out.println(searchStack);

  }
}

// Stack = LIFO DSA- Last-in First-out

// uses:
// 1. undo/redo feature
// 2. go forward or backward with the browser button
// 3. backtracking like file directory or maze
// 4. calling functions(call stack)
