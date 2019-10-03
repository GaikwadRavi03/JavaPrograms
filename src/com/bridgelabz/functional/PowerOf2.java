/*
* Created by:Ravi Gaikwad.
* Date 24/09/2019
* Purpose: 4.Power of 2.
**/
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class PowerOf2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Utility u1 = new Utility();
		try {
			System.out.println("enter the no: ");
			num = Utility.inputNumber();// take input from user.
			u1.powerOfTwo(num);// function call.
		} catch (Exception e) {
			System.out.println("please enter valid input");
		}
	}
}
