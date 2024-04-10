package datastructure.HashTable;

import java.util.Objects;

/*
 * HashTable: Linear Probing:(open addressing) Separate Chaining: strategy for handling collisions;
 * we utilise a linkedlist and insert at the tail node and perform a linear search on the singly
 * linkedlist to find our values.
 */

public class HashTable {
	private int size = 7;
	private Node[] dataMap; // array of pointers to nodes

	private static class Node {
		private String key;
		private int value;
		private Node next;

		public Node(String key, int value) {
			this.key = key;
			this.value = value;
		}
	}



	public HashTable() {
		dataMap = new Node[size];

	}

	public void printTable() {
		for (int i = 0; i < dataMap.length; i++) {
			System.out.print(i + "| ");
			Node current = dataMap[i];
			while (current != null) {
				System.out.print("{" + current.key + " = " + current.value + "}");



				if (current.next != null)
					System.out.print(" => ");
				current = current.next;
			}
			System.out.println();
		}
	}

	private int hash(String key) {
		int hash = 0;
		char[] keyChars = key.toCharArray();
		for (int i = 0; i < keyChars.length; i++) {
			int asciiValue = keyChars[i];
			hash = (hash + asciiValue * 23) % dataMap.length;
			// must use prime number; other option 8191 good balance of performance and memory usage
		}
		return hash;
	}

	public void set(String key, int value) {
		int index = hash(key);
		Node newNode = new Node(key, value);
		if (dataMap[index] == null) {
			dataMap[index] = newNode;
		} else {
			Node temp = dataMap[index];
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}

	public int get(String key) {
		int index = hash(key);
		Node temp = dataMap[index];
		while (temp != null) {
			if (Objects.equals(temp.key, key)) {
				return temp.value;
			}
			temp = temp.next;
		}
		return 0;
	}

	public static void main(String[] args) {

		HashTable HT = new HashTable();

		HT.set("yaml", 100);
		HT.set("bson", 50);
		HT.set("json", 80);
		HT.set("xml", 200);
		HT.set("html", 140);
		HT.set("sql", 1);
		HT.set("react", 7);


		System.out.println(HT.get("xml")); // 200
		HT.printTable();
		/*
		 * 0| {bson = 50} -> {sql = 1} 
		 * 1| 
		 * 2| {yaml = 100} -> {json = 80} -> {xml = 200} 
		 * 3| 
		 * 4| {react = 7} 
		 * 5| 
		 * 6| {html = 140}
		 */
	}
}
