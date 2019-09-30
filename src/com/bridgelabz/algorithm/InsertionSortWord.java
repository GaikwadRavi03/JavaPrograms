/*
* Created by:Ravi Gaikwad.
* Date 24/09/2019
* Purpose: 7.Insertion Sort for String.
**/
package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class InsertionSortWord {
	public static void main(String[] args) {
		Utility u1 = new Utility();
		// TODO Auto-generated method stub
		try {
			System.out.println("enter the limit of string");
			int m = u1.inputNumber();
			String[] str = new String[m];
			System.out.println("enter the strings:");
			for (int i = 0; i <= str.length - 1; i++) {
				str[i] = u1.inputString();
			}
			System.out.println("before the insertion sort:");
			for (int i = 0; i < str.length; i++) {
				System.out.print(str[i] + " ");
			}

			u1.insertionSortString(str);// function call for Insertion sort.

			System.out.println("\nafter the insertion sort:");
			for (int i = 0; i < str.length; i++) {
				System.out.print(str[i] + " ");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
