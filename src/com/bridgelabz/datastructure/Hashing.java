/*
* Created by:Ravi Gaikwad.
* Date 3/10/2019
* Purpose: 6. Hashing Function to search a Number in a slot.
**/
package com.bridgelabz.datastructure;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import com.bridgelabz.utility.LinkedList;
import com.bridgelabz.utility.Utility;

public class Hashing {
	public static void main(String[] args) throws Exception {
		File f1 = new File("/home/admin1/eclipse-workspace/BridgeLabzPrograms/src/com/bridgelabz/files/Hashing.txt");
		FileReader fr = new FileReader(f1);
		BufferedReader br = new BufferedReader(fr);

		LinkedList<Integer>[] list = new LinkedList[11];
		int rem = 0;

		// Initialized linked lists in array
		for (int i = 0; i < 11; i++) {
			list[i] = new LinkedList<Integer>();
		}
		int[] arr1 = new int[11];
		String str = "";
		String[] str1 = null;
		while ((str = br.readLine()) != null) // Reading Content from the file
		{
			str1 = str.split(" ");

			System.out.println("data from file is:");
			for (int i = 0; i < str1.length; i++) {
				arr1[i] = Integer.parseInt(str1[i]);
				System.out.print(str1[i] + " "); // data from file
			}
		}

		// Insert the numbers in specific Array linked list
		for (int i = 0; i < arr1.length; i++) {
			rem = arr1[i] % arr1.length;
			list[rem].insertAtLast(arr1[i]);
		}
		System.out.print("\nGiven Array Linked list is");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print("\n" + i + " : ");
			list[i].printList();
		}

		System.out.print("\n\nEnter the search element");
		int item = Utility.inputNumber();
		int j1 = 0;
		boolean isFoundKey = false;
		int index = 0;
		for (int i = 0; i < list.length; i++) {
			rem = item % 11;
			for (int j = 0; j < list[i].getListSize() - 1; j++) {
				if (list[rem].search(item)) {
					isFoundKey = true;
					index = j1;
					break;
				}
				j1++;
			}

		}
		if (isFoundKey) {
			list[rem].DeleteAtPositionHashing(j1);
		} else {
			list[rem].insertAtLast(item);
		}
		System.out.print("\nAfter searching operation Array Linked list is");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print("\n" + i + " : ");
			list[i].printList();
		}
		String out = "";
		System.out.println("\noutput in writer file");
		for (int i = 0; i < list.length; i++) {
			list[i].printList();
			out += list[i].returnListInString();
		}

		FileWriter fw = new FileWriter(
				"/home/admin1/eclipse-workspace/BridgeLabzPrograms/src/com/bridgelabz/files/Hashing Ans.txt");
		fw.write(out);
		fw.flush();
		fw.close();
	}
}
