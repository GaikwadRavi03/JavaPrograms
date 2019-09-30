/*
* Created by:Ravi Gaikwad.
* Date 24/09/2019
* Purpose: 13.Monthly Payment.
**/
package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class MonthlyPayment {
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		try {
			// gives principles, year and Rate from command line Prompt.
			double P = Integer.parseInt(args[0]);
			double Y = Integer.parseInt(args[1]);
			double R = Integer.parseInt(args[2]);

			// function call and return result from function prototype.
			System.out.println("payment is: " + Utility.monthlyPaymentIs(P, Y, R));
		} catch (Exception e) {
			System.out.println("enter invalid input");
		}
	}
}
