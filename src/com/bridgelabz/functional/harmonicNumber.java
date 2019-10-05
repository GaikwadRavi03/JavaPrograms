/*
* Created by:Ravi Gaikwad.
* Date 24/09/2019
* Purpose: 5.Harmonic Number.
**/
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class harmonicNumber {
	public static void main(String[] args) {
		try {
			int n;
			System.out.println("enter the number:");
			n = Utility.inputNumber();
			Utility.findHarmonic(n);
		} catch (Exception e) {
			System.out.println("please enter valid input");
		}
	}
}
