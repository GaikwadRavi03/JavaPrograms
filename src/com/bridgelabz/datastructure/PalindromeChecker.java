/*
* Created by:Ravi Gaikwad.
* Date 30/09/2019
* Purpose: 5. Palindrome�Checker.
**/

package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Utility;

public class PalindromeChecker {

	public static void main(String[] args) {
		System.out.println("Enter the string for check palindrome");
		String str = Utility.inputString();

		boolean b = Utility.palindromeChecker(str);
		if (b) {
			System.out.println("Palidrome");
		} else {
			System.out.println("Not A Palidrome");
		}
	}
}