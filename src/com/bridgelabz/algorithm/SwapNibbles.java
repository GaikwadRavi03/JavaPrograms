/*
* Created by:Ravi Gaikwad.
* Date 26/09/2019
* Purpose: 16.Swap Nibbles.
**/
package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class SwapNibbles {

	public static void main(String[] args) {

		Utility u1 = new Utility();
		System.out.println("Enter the number: ");
		int n = Utility.inputNumber();// gives input from user.
		u1.findSwapNibble(n);// function call for swap nibble.
	}
}