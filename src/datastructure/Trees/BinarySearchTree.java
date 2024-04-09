package datastructure.Trees;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree {

	private Node root;

	public BinarySearchTree() {
		root = null;
	}

	private static class Node {
		int value;
		Node left;
		Node right;

		Node(int value) {
			this.value = value;
			left = null;
			right = null;
		}
	}

	public void insert(int value) {
		if (root == null) {
			root = new Node(value);
			return;
		}
		Node current = root;
		while (true) {
			if (value < current.value) {
				if (current.left == null) {
					current.left = new Node(value);
					return;
				}
				current = current.left;
			} else if (value > current.value) {
				if (current.right == null) {
					current.right = new Node(value);
					return;
				}
				current = current.right;
			} else {
				throw new IllegalArgumentException("Invalid duplicate value");
			}
		}
	}

	public boolean contains(int value) {
		if (root == null) {
			return false;
		}
		Node current = root;
		while (current != null) {
			if (value < current.value) {
				current = current.left;

			} else if (value > current.value) {
				current = current.right;

			} else {
				if (value == current.value) {
					return true;
				}
			}
		}
		return false;
	}

	public List<Integer> printPath(int value) {
		List<Integer> path = new ArrayList<>();
		printPath(root, path, value);
		if (path.isEmpty()) {
			throw new IllegalArgumentException(
					"Invalid path, please enter a value or element in the tree");
		}
		return path;
	}
	/*
	 * printPath credit to:
	 * https://stackoverflow.com/questions/25022410/binary-search-tree-print-path
	 */

	private boolean printPath(Node node, List<Integer> path, int value) {
		if (node == null) {
			return false;
		}
		path.add(node.value);

		if (value < node.value && printPath(node.left, path, value)) {
			return true;
		}

		if (value > node.value && printPath(node.right, path, value)) {
			return true;
		}

		if (value == node.value) {
			return true;
		}

		path.remove(path.size() - 1);
		return false;
	}

	public void inOrder(Node node) {
		if (node != null) {
			inOrder(node.left);
			System.out.print(node.value + " ");
			inOrder(node.right);
		}
	}

	public void postOrder(Node node) {
		if (node != null) {
			inOrder(node.left);
			inOrder(node.right);
			System.out.print(node.value + " ");
		}
	}

	public static void main(String[] args) {
		BinarySearchTree myBinary = new BinarySearchTree();

		int[] arr = {47, 21, 76, 18, 52, 82, 27};

		for (int i = 0; i < arr.length; i++) {
			myBinary.insert(arr[i]);
		}

		// System.out.println(myBinary.contains(82));
		System.out.println(myBinary.printPath(17));
		// myBinary.postOrder(myBinary.root);



	}
}
