package datastructure.Trees;

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

	public static void main(String[] args) {
		BinarySearchTree myBinary = new BinarySearchTree();

		myBinary.insert(47);
		myBinary.insert(21);
		myBinary.insert(76);
		myBinary.insert(18);
		myBinary.insert(52);
		myBinary.insert(82);
		myBinary.insert(19);

		myBinary.insert(27);



		System.out.println(myBinary.root.value);
	}
}
