package oop;

/* lesson on Abstraction 1.2 */

public class Counter {
	private final String name;
	private int count;

	/* constructor */ public Counter(String id) {
		name = id;
	}

	/* method 1 */ public void increment() {
		count++;
	}

	/* method 2 */ public int length() {
		return count;
	}

	/* method 3 */ public String toString() {
		return count + " " + name;
	}

	public static void main(String[] args) {
		/* create and initialize objects */ Counter heads = new Counter("head(s)");
		Counter tails = new Counter("tail(s)");
		for (int i = 0; i < 2; i++) {
			heads.increment();
		}
		tails.increment();
		System.out.println(heads + " | " + tails);
		System.out.println(heads.count + tails.count + " turn(s)");
	}

}
