package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Utility;

public class BinarySearchTree {

	// Represent the node of binary tree
	public static class Node {
		int data;
		Node left;
		Node right;

		public Node(int data) {
			// Assign data to the new node, set left and right children to null
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	// Represent the root of binary tree
	public Node root;

	public BinarySearchTree() {
		root = null;
	}

	public static void main(String[] args) {

		int n = 5;
		for (int i = 1; i <= n; i++) {
			System.out.println(Utility.numOfBST(i));
		}
	}
}