/*
* Created by:Ravi Gaikwad.
* Date 7/10/2019.
* Purpose: 5. Commercial data processing.
**/
package com.bridgelabz.oops.commertialdata;

import com.bridgelabz.utility.Utility;

public class CommercialDataProcessing {
	public static void main(String[] args) throws Exception {
		{
			System.out.println("Enter Your Chocie");
			System.out.println("1.Create a new Account");
			System.out.println("2.Buy Shares");
			System.out.println("3.Sell Shares");
			System.out.println("4.Print Report");
			System.out.println("5.Exit");
			int choice = Utility.inputNumber();
			switch (choice) {
			case 1:
				System.out.println("you are creating account:");
				Utility.createAccount();
				break;
			case 2:
				System.out.println("You are buying shares:");
				Utility.buyShare();
				break;
			case 3:
				System.out.println("you are selling shares:");
				Utility.sellShare();
				break;
			case 4:
				System.out.println("you are printing report:");
				Utility.printReport();
				break;
			case 5:
				System.out.println("Exit");
				break;
			default:
				break;
			}
		}
	}
}