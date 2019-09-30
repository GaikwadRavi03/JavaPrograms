/*
* Created by:Ravi Gaikwad.
* Date 24/09/2019
* Purpose: 5.Binary Search to find the Number.
**/
package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class BinarySearchNumber {

	public static void main(String[] args) {
		Utility u1 = new Utility();
		// TODO Auto-generated method stub
		try {
			int arr[] = new int[] { 1, 8, 3, 7, 6, 5, 4, 2, 9 };
			System.out.println("unsorted list is:");
			for (int i = 0; i < arr.length; i++) {
				System.err.print(arr[i] + " ");// unsorted or original list prints here
			}
			System.out.println("enter the item to find:");
			int item = u1.inputNumber();
			u1.binarySearchSort(arr, item);// function call.
		} catch (Exception e) {
			System.out.println(e+"please enter valid input");
		}
	}
}
