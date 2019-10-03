/*
* Created by:Ravi Gaikwad.
* Date 27/09/2019
* Purpose: 12. Prime Number And Anagram Two D Array.
**/
package com.bridgelabz.datastructure;

import java.util.ArrayList;

import com.bridgelabz.utility.Utility;

public class PrimeNumberAndAnagram2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Utility u1 = new Utility();
		String string1 = "";
		String string2 = "";
		int count = 0;

		// create Arraylist and store the prime number in array
		ArrayList<Integer> prime = Utility.prime(1000);
		int row = prime.size(); // calculate size
		String anagram[][] = new String[row][2];

		System.out.println("\nPrime numbers that are Anagram\n");
		for (int i = 0; i < prime.size(); i++) {
			for (int j = i + 1; j < prime.size(); j++) {
				string1 = Integer.toString(prime.get(i)); // string value convert to Integer and
				string2 = Integer.toString(prime.get(j));
				if (Utility.CheckAnagram(string1, string2)) // check the string is equal or not
				{
					anagram[count][0] = string1;
					anagram[count][1] = string2;
					count++;
				}
			}
		}
		for (int i = 0; i < count; i++) {
			for (int j = 0; j < anagram[0].length; j++) {
				System.out.printf(anagram[i][j] + " "); // display values
			}
			System.out.println();
		}
	}
}
