package com.convertBST_ST_Q2;

class Node {
	int val;
	Node left, right;

	Node(int item) {
		val = item;
		left = right = null;
	}
}
class Main {
	public static Node node;
	static Node prevNode = null;
	static Node headNode = null;

	static void completeBSTtoST(Node root) {

		if (root == null) {
			return;
		}

		completeBSTtoST(root.left);
		Node rightNode = root.right;
		if (headNode == null) {
			headNode = root;
			root.left = null;
			prevNode = root;
		} else {
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}

		completeBSTtoST(rightNode);

	}

	static void traverseRight(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.val + " ");
		traverseRight(root.right);
	}

	public static void main(String[] args) {

		Main.node = new Node(50);
		Main.node.left = new Node(30);
		Main.node.right = new Node(60);
		Main.node.left.left = new Node(10);
		Main.node.right.left = new Node(55);

		completeBSTtoST(node);
		System.out.println("The resultant  output is :");
		traverseRight(headNode);
	}
}