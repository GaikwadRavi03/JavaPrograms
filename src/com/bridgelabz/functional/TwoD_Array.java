/*
* Created by:Ravi Gaikwad.
* Date 24/09/2019
* Purpose: 9. Two D Array.
**/
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class TwoD_Array {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int choice;
		System.out.println("1.integer\n2.Double\n3.Boolean");
		System.out.println("enetr choice for above operations");
		choice = Utility.inputNumber();
		switch (choice) {
		case 1:
			Utility.TwoD_ArrayForInteger(); // function call for Integer.
			break;

		case 2:
			Utility.TwoD_ArrayForDouble(); // function call for Double.
			break;

		case 3:
			Utility.TwoD_ArrayForBoolean(); // function call for Boolean.
			break;

		default:
			System.out.println("enter invalid choice:");
			break;
		}
	}
}
