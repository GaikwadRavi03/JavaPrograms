/*
* Created by:Ravi Gaikwad.
* Date 1/10/2019
* Purpose: 4. Simulate Banking Cash Counter.
**/
package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Queue;
import com.bridgelabz.utility.Utility;

public class BankingCashCounter {

	public static void main(String[] args) {

		int currentBalance = Utility.simulateBanking();
		System.out.println("Current Balance = " + currentBalance);
	}

	private static int simulateBanking() {
		// TODO Auto-generated method stub
		Utility input = new Utility();
		Queue<Integer> q = new Queue<>();
		int Amount = 0;
		int answer = 0;
		do {
			System.out.println("1. Insert Person");
			System.out.println("2. Remove Person");
			System.out.println("3. Exit");
			System.out.println("Enetr your choice:");
			answer = input.inputNumber();
			switch (answer) {
			case 1:
				System.out.println("1. Deposit");
				System.out.println("2. Withdraw");

				int answer2 = input.inputNumber();
				if (answer2 == 1) {
					System.out.println("Enter Amount");
					int amt = input.inputNumber();
					Amount += amt;
					System.out.println("Amount Added");
					q.enqueue(amt);
				} else {
					System.out.println("Enter Amount");
					int amt = input.inputNumber();
					if (amt > Amount) {
						System.out.println("Insufficient Balance");
					} else {
						Amount -= amt;
						System.out.println("Amount Deduct");
					}
					q.enqueue(amt);
				}
				break;

			case 2:
				if (q.isEmpty()) {
					System.out.println("No Person In Queue");
				} else {
					System.out.println("Person Deleted From Queue");
					q.dequeue();
				}
				break;
			}
		} while (answer != 3);
		return Amount;
	}
}