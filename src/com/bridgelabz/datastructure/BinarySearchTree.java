/*
* Created by:Ravi Gaikwad.
* Date 1/10/2019
* Purpose: 7. Number of Binary Search Tree.
**/
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

		try {
			int n;
			System.out.println("Enter the Number for BST");
			n = Utility.inputNumber();
			for (int i = 1; i <= n; i++) {
				System.out.println(Utility.numOfBST(i));
			}
		} catch (Exception e) {
			System.out.println("Enetr valid input");
		}
	}
}
