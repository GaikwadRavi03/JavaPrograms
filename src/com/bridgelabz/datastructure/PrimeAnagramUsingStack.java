/*
* Created by:Ravi Gaikwad.
* Date 30/09/2019
* Purpose: 13.  Prime Anagram Using Stack.
**/
package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Utility;

public class PrimeAnagramUsingStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		com.bridgelabz.utility.Stack<Integer> s1 = Utility.primeAnagramStack();

		while (!s1.isEmpty()) {

			System.out.println(s1.pop());
		}

	}

}