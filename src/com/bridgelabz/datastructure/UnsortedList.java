/*
* Created by:Ravi Gaikwad.
* Date 27/09/2019
* Purpose: 1. UnsortedList
**/
package com.bridgelabz.datastructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.bridgelabz.utility.LinkedList;
import com.bridgelabz.utility.Node;
import com.bridgelabz.utility.Utility;

public class UnsortedList {

	public static void main(String[] args) throws IOException {

		Utility u1 = new Utility();
		LinkedList<String> list = new LinkedList<String>();
		File f1 = new File("/home/admin1/Desktop/File/unSorted.txt"); // Creation of File Descriptor for
																		// input file
		FileReader fr = new FileReader(f1); // Creation of File Reader object
		BufferedReader br = new BufferedReader(fr); // Creation of BufferedReader object
		String str;
		String[] words = null; // Intialize the word Array

		while ((str = br.readLine()) != null) // Reading Content from the file
		{
			words = str.split(" "); // Split the word using space
			for (int i = 0; i < words.length; i++) {
				list.insertAtLast(words[i]); // store data in linked list
			}
			list.printList(); // print file data
		}
		System.out.println("\nenter search item:");
		String item = u1.inputString();

		boolean flag = false;
		for (int i = 0; i < words.length; i++) {
			if (item.equals((words[i]))) {
				list.DeleteAtPosition(i);
				flag = true;
				break;
			}
		}
		if (!flag)
			list.insertAtLast(item);
		list.printList();
		String s = "";
		int n = list.getListSize();
		String[] arr = new String[n];
		Node<String> temp = list.start;
		for (int i = 0; i < n; i++) {
			arr[i] = temp.getData();
			temp = temp.getNext();
			s = s + arr[i] + " ";
		}
		list.toString();
		FileWriter fw = new FileWriter("/home/admin1/Desktop/File/unSortedAns.txt");
		fw.write(s);
		fw.flush();
		fw.close();
	}
}
