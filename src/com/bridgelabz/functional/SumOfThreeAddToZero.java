/*
* Created by:Ravi Gaikwad.
* Date 24/09/2019
* Purpose: 10.Sum of three Integers adds to zero.
**/
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class SumOfThreeAddToZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility u1 = new Utility();
		int arr[] = { 0, -1, 2, -3, 1 }; // array list.
		int n = arr.length;
		u1.findTriples(arr, n);// function call.
	}
}
