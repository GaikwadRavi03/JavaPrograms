/*
* Created by:Ravi Gaikwad.
* Date 1/10/2019
* Purpose: 6. Hashing Function to search a Number in a slot.
**/
package com.bridgelabz.datastructure;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.bridgelabz.utility.Utility;

public class Hashing {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub

		Utility input = new Utility();
		System.out.println("Enter Number To Search");
		int search = Utility.inputNumber();
		boolean b = Utility.hasingSearch(search);
		if (!b) {
			System.out.println("Number Was Not in List. added to list");
		} else {
			System.out.println("Number Deleted From list");
		}
	}
}
