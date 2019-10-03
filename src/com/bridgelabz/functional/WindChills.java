/*
* Created by:Ravi Gaikwad.
* Date 24/09/2019
* Purpose: 16.WindChill
**/
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class WindChills {
	public static void main(String args[]) {
		Utility u1 = new Utility();
		try {
			// Temperate and velocity given from user.
			double t, v;
			System.out.println("Enter temperature in fahrenheit : ");
			t = u1.inputdouble();
			System.out.println("Enter speed of the wind(miles per hour) : ");
			v = u1.inputdouble();
			u1.findWindChill(t, v);// function call for windchill.
		} catch (Exception e) {
			System.out.println("enter valid inputs");
		}
	}
}
