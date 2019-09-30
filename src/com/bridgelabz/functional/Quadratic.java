/*
* Created by:Ravi Gaikwad.
* Date 24/09/2019
* Purpose: 15.Quadatic.java
**/
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class Quadratic {
	public static void main(String[] args) {
		Utility u1 = new Utility();
		try {
//			double a = 2.3, b = 4, c = 5.6;
			double a, b, c;
			System.out.println("enter the values of a, b, c:");
			// a,b,c values given from user.
			a = u1.inputdouble();
			b = u1.inputdouble();
			c = u1.inputdouble();
			u1.findQuadraticEqh(a, b, c);// funtion call.
		} catch (Exception e) {
			System.out.println("please enter valid input");
		}
	}
}