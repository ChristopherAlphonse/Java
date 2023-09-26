import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {
  public static void main(String[] args) {
    Queue<String> queue = new LinkedList<String>();
    queue.offer("steve");
    queue.offer("daman");
    queue.offer("julius");
    System.out.println(((LinkedList<String>) queue).indexOf("steve"));
  }
}

// Queue = FIFO DSA, First-In First-Out
// A collection designed for holding elements prior to processing
// Linear data structures

// Insert add(e) offer(e) enqueue
// Remove remove() poll() dequeue
// Examine element() peek()

// uses:
// 1. keyboard buffer
// 2. printer queue
// 3. LinkedList, priority queue, breadth-first search
