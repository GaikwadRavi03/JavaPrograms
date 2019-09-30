/*
* Created by:Ravi Gaikwad.
* Date 24/09/2019
* Purpose: 10.Find the Fewest Notes to be returned for Vending Machine.
**/
package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class VendingMachine {
	static int i = 0;
	static int total = 0;
	static int[] notes = { 1000, 500, 100, 50, 10, 5, 2, 1 };// total notes.
	static int money;

	// Body of function.
	public static int calculate(int money, int[] notes) {
		int rem;
		if (money == 0) {
			return -1;
		} else {
			if (money >= notes[i]) {
				int calNotes = money / notes[i];
				rem = money % notes[i];
				money = rem;
				total += calNotes;
				System.out.println(notes[i] + " Notes ---> " + calNotes);
			}
			i++;
			return calculate(money, notes);// Recurtion Method.
		}
	}

	public static void main(String[] args) {
		VendingMachine v1 = new VendingMachine();
		Utility u1 = new Utility();
		try {
			System.out.print("Enter the Amount:");
			money = u1.inputNumber();
		} catch (Exception e) {
			// TODO: handle exception
		}
		calculate(money, notes);// function call.
		System.out.println("Total Number of Notes are :" + total);
	}
}
