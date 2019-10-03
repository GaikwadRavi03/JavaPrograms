/*
* Created by:Ravi Gaikwad.
* Date 26/09/2019
* Purpose:15 Binary.
**/
package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class Binary {
	public static void main(String[] args) {
		Utility u1 = new Utility();
		try {
			int num;
			System.out.println("enter the number:");
			num = Utility.inputNumber();// number take from user.
			u1.FindBinaryRepresentation(num);// function call.
		} catch (Exception e) {
			System.out.println("please enter only numbers");
		}
	}
}
