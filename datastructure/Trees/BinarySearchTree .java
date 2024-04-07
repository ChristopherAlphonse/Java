package datastructure.Trees;

public class BinarySearchTree {
	// Root BST
	Node root;

	class Node {
		int value;
		Node left, right;

		private Node(int value) {
			this.value = value;
			this.left = null;
			this.right = null;
		}
	}

	public BinarySearchTree() {
		root = null;
	}

	public void insert(int value) {
		root = insertRec(root, value);
	}

	private Node insertRec(Node root, int value) {
		if (root == null) {
			root = new Node(value);
			return root;
		}

		if (value < root.value) {
			root.left = insertRec(root.left, value);
		} else if (value > root.value) {
			root.right = insertRec(root.right, value);
		}

		return root;
	}

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(50);
		bst.insert(30);
		bst.insert(20);
		bst.insert(40);
		bst.insert(70);
		bst.insert(60);
		bst.insert(80);
	}
}
