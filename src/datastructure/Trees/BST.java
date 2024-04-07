package datastructure.Trees;

class BinarySearchTree {
	private Node root;

	class Node {
		int value;
		Node left;
		Node right;

		Node(int value) {
			this.value = value;
		}
	}

	public class BST()
	{
			root = null;
		}


	public boolean insert(int value){
		if(root==null){
			root = new Node(value);
			return true;		}
		Node temp = root;

		while (true){
			if (root.value == temp.value){
				return false;
			}
			
		}
	}

	public static void main(String[] args) {
		BST mybinary = new BST(12);
		System.out.println(mybinary());
	}

}
