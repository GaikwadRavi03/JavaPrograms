/*
* Created by:Ravi Gaikwad.
* Date 24/09/2019
* Purpose: 2.Flip coin and print percentage of Heads and Tails.
**/

package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class FlipCoin {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility u1 = new Utility();
		try {
			int times;
			System.out.println("enter the number of times toss the coin: ");
			// times given from user.
			times = Utility.inputNumber();
			u1.tossCoin(times);// fun call
		} catch (Exception e) {
			System.out.println("please enter valid input");
		}
	}
}
