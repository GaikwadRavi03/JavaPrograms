/*
* Created by:Ravi Gaikwad.
* Date 1/10/2019
* Purpose: 4. Simulate Banking Cash Counter.
**/
package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Utility;

public class BankingCashCounter {

	public static void main(String[] args) {

		int currentBalance = Utility.simulateBanking();
		System.out.println("Current Balance = " + currentBalance);
	}
}