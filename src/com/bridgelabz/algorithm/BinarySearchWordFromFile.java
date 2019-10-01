/*
* Created by:Ravi Gaikwad.
* Date 24/09/2019
* Purpose: 6.Binary Search for the Word list form File.
**/
package com.bridgelabz.algorithm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.bridgelabz.utility.Utility;

public class BinarySearchWordFromFile {
	public static void main(String[] args) throws IOException {
		Utility u1 = new Utility();
		File f1 = new File(
				"/home/admin1/eclipse-workspace/BridgeLabzPrograms/src/com/bridgelabz/files/BinarySearchWordFromFile.txt");
		// Creation of File Descriptor for input file
		String[] words = null; // Intialize the word Array
		FileReader fr = new FileReader(f1); // Creation of File Reader object
		BufferedReader br = new BufferedReader(fr); // Creation of BufferedReader object
		String s;
		System.out.println("enter the word do u want to search:");
		String input = u1.inputString(); // Input word to be searched
		int count = 0; // Intialize the word to zero
		while ((s = br.readLine()) != null) // Reading Content from the file
		{
			words = s.split(" "); // Split the word using space
			for (String word : words) {
				if (word.equals(input)) // Search for the given word
				{
					count++; // If Present increase the count by one
				}
			}
		}
		if (count != 0) // Check for count not equal to zero
		{
			System.out.println("The given word is present for " + count + " Times in the file");
		} else {
			System.out.println("The given word is not present in the file");
		}

		fr.close();// fileReader here close here.
	}
}
