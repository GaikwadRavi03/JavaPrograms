/*
* Created by:Ravi Gaikwad.
* Date 24/09/2019
* Purpose: 1.Anagram Detection.
**/
package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class Anagram {
	public static void main(String[] args) {
		Utility u1 = new Utility();
		// TODO Auto-generated method stub
		System.out.println("enter the two strings");
		// string1 and string2 takes from user
		String str1 = Utility.inputString();
		String str2 = Utility.inputString();
		u1.isAnagram(str1, str2);// function call.
	}
}// class ends here.
