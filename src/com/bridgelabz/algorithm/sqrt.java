/*
* Created by:Ravi Gaikwad.
* Date 24/09/2019
* Purpose: 14.Square Root.
**/
package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class sqrt {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility u1 = new Utility();
		try {
			double c;
			System.out.println("enter the num: ");
			c = u1.inputdouble();// input gives from user.
			System.out.println(u1.sqrt(c));// fun call.
		} catch (Exception e) {
			System.out.println("enter invalid number");
		}
	}
}
