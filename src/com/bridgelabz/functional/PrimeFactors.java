/*
* Created by:Ravi Gaikwad.
* Date 24/09/2019
* Purpose: 6.Factor.
**/
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class PrimeFactors {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility u1 = new Utility();
		try {
			int n;
			System.out.println("enter the number:");
			n = Utility.inputNumber();// number given from user.
			u1.findPrimeFactores(n);// function call.
		} catch (Exception e) {
			System.out.println("please enter valid input");
		}
	}
}
