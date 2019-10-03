/*
* Created by:Ravi Gaikwad.
* Date 24/09/2019
* Purpose: 3.Leap year.
**/
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility u1 = new Utility();
		try {
			int year;
			System.out.println("enter the year:");
			year = Utility.inputNumber();// year gives from user
			u1.findLeapYear(year);// function calls
		} catch (Exception e) {
			System.out.println("please enter valid input");
		}
	}
}
