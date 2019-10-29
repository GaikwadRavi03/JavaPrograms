/*
* Created by:Ravi Gaikwad.
* Date 24/09/2019
* Purpose: 12.Permutation of a string.
**/
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility u1 = new Utility();
		String str;
		System.out.println("enter the string:");
		str = Utility.inputString();// given input from user.
		int n = str.length();
		u1.permute(str, 0, n - 1); // Function calls.
	}
}
