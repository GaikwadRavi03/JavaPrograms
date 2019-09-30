/*
* Created by:Ravi Gaikwad.
* Date 24/09/2019
* Purpose: 11.Day of weeks.
**/
package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class DayOfWeeks {
	public static void main(String[] args) {
		Utility u1 = new Utility();
		// TODO Auto-generated method stub
		// Giving values of date, month, year from command prompt.
		try {
			int d = Integer.parseInt(args[0]);
			int m = Integer.parseInt(args[1]);
			int y = Integer.parseInt(args[2]);
			u1.findDayOfWeeks(d, m, y);// function calls with values of d, m, y.
		} catch (Exception e) {
			System.out.println("enter invalid input");
		}
	}
}
