/*
* Created by:Ravi Gaikwad.
* Date 30/09/2019
* Purpose: 10 .Calender Using Queue.
**/
package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Utility;

public class CalenderUsingQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month = Integer.parseInt(args[0]);
		int year = Integer.parseInt(args[1]);
		Utility.calenderQueue(month, year);
	}

}