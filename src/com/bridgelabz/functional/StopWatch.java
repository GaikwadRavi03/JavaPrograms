/*
* Created by:Ravi Gaikwad.
* Date 24/09/2019
* Purpose: 13.Simulate Stopwatch Progarm.
**/
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class StopWatch {

	public static void main(String[] args) {
		Utility u1 = new Utility();
		u1.start();// function call to store start current time.
		for (int i = 0; i < 1000; i++) { // use for time some time will be delay.
			System.out.print(i + " ");
		}
		u1.stop();// function call to store stop current time
		long time = u1.elapsedTime();// function call for elapsed.
		System.out.println("total time elapsed(in millisec) is: " + time);
	}
}
