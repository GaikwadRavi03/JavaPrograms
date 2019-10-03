/*
* Created by:Ravi Gaikwad.
* Date 24/09/2019
* Purpose: 7.Gambler.
**/
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class Gambler {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility u1 = new Utility();
		try {
			int stake, goal, trails;// giving values from user
			System.out.println("enter stakes:");
			stake = Utility.inputNumber();
			System.out.println("enter goals: ");
			goal = Utility.inputNumber();
			System.out.println("enter no of trails: ");
			trails = Utility.inputNumber();

			u1.findGambling(stake, goal, trails);// function call
		} catch (Exception e) {
			System.out.println("please enter valid input ");
		}
	}
}
