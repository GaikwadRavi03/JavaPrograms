/*
* Created by:Ravi Gaikwad.
* Date 24/09/2019
* Purpose:Temprature conversion.
**/
package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class TemperatureConversion {
	public static void main(String args[]) {
		Utility u1 = new Utility();
		System.out.print("1.Convert temperature in Fahrenheit\n2.Convert temperature in celsius\nEnter your choice = ");
		int n = u1.inputNumber();
		System.out.print("Enter the temperature in degree celsius : ");
		double c = u1.inputNumber();
		System.out.print("Enter the temperature in degree Fahrenheit : ");
		double f1 = u1.inputNumber();

		u1.checkTemprature(n, c, f1);// function call.
	}
}