/*
* Created by:Ravi Gaikwad.
* Date 24/09/2019
* Purpose: 11. Distance.
**/
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class Distance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// get x and y values from command line promt.
		try {
			int x = Integer.parseInt(args[0]);
			int y = Integer.parseInt(args[1]);
			Utility.findDistance(x, y);
		} catch (Exception e) {
			System.out.println("please enter valid input");
		}
	}
}
