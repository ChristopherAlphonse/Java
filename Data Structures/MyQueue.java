import java.util.*;

public class MyQueue {
  public static void main(String[] args) {
    Queue<String> queue = new LinkedList<>();
    queue.offer("steve");
    queue.offer("daman");
    queue.offer("julius");
    System.out.println(((LinkedList<String>) queue).indexOf("daman"));
  }
}

// Queue: A First-In-First-Out (FIFO) Data Structure
// A collection designed for holding elements prior to processing
// It belongs to linear data structures

// Insert operations: add(e), offer(e), enqueue
// Remove operations: remove(), poll(), dequeue
// Examine operations: element(), peek()
 
// Common uses:
// 1. Keyboard buffer
// 2. Printer queue
// 3. Implemented in data structures like LinkedList, priority queue, and used
// in breadth-first search
