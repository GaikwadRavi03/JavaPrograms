/*
* Created by:Ravi Gaikwad.
* Date 25/09/2019
* Purpose: 9.Merge Sort for String.
**/
package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class MergeSort_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility u1 = new Utility();
		try {
			System.out.println("enter size of string list:");
			int m = Utility.inputNumber();// Gives size of string from user.
			String str[] = new String[m];
			System.out.println("enter strings in array");// store varibale in string array
			for (int i = 0; i < str.length; i++) {
				str[i] = u1.inputString();
			}
			System.out.println("Before list is:");
			for (String i : str) {
				System.out.print(i + " ");
			}
			// function call for merge sorting.
			u1.mergeSort(str, 0, str.length - 1);

			System.out.println("Before list is:");
			for (String i : str) {
				System.out.print(i + " ");
			}
		} catch (Exception e) {
			System.out.println("Please Enter valid input");
		}
	}
}
