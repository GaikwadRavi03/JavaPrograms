/*
* Created by:Ravi Gaikwad.
* Date 24/09/2019
* Purpose: 8.Bubble Sort for Integers.
**/
package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class bubbleSortInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Utility u1 = new Utility();
			System.out.println("enter the size of array list");
			int m = Utility.inputNumber();
			int arr[] = new int[m];
			System.out.println("enter the numbers in list");
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Utility.inputNumber();
			}
			System.out.println("before the bubble sort:");
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}

			u1.bubbleSortInteger(arr);// function call for bubble sort.

			System.out.println("\nafter the bubble sort:");
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
		} catch (Exception e) {
			System.out.println("invalid input");
		}
	}
}
