/*
* Created by:Ravi Gaikwad.
* Date 30/09/2019
* Purpose: 14.  Prime Anagram Using Queue.
**/
package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Queue;
import com.bridgelabz.utility.Utility;

public class PrimeAnagramUsingQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q1 = Utility.primeAnagramQueue();

		while (!q1.isEmpty()) {
			System.out.println(q1.dequeue());
		}
	}
}