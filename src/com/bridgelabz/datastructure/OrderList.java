/*
* Created by:Ravi Gaikwad.
* Date 30/09/2019
* Purpose: 2. Order List.
**/
package com.bridgelabz.datastructure;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.bridgelabz.utility.LinkedList;
import com.bridgelabz.utility.Node;
import com.bridgelabz.utility.Utility;

public class OrderList {
	public static void main(String[] args) throws IOException {

		Utility u1 = new Utility();
		LinkedList<Integer> list = new LinkedList<Integer>();

		File f1 = new File("/home/admin1/eclipse-workspace/BridgeLabzPrograms/src/com/bridgelabz/files/OrderList.txt");
		FileReader fr = new FileReader(f1); // Creation of File Reader object
		BufferedReader br = new BufferedReader(fr); // Creation of BufferedReader object

		String str = "";
		String[] arr1 = null;
		while ((str = br.readLine()) != null) // Reading Content from the file
		{
			arr1 = str.split(" ");
			int[] arr2 = new int[arr1.length];
			System.out.println("data from file is:");
			for (int i = 0; i < arr1.length; i++) {
				arr2[i] = Integer.parseInt(arr1[i]);
				System.out.print(arr1[i] + " "); // data from file
				list.insertAtLast(arr2[i]); // insert data
			}
		}
		LinkedList.sort(list);
		System.out.println("\nsorted linked list from data is");
		list.printList();

		try {
			System.out.println("\nsearch the element:");
			int item = Utility.inputNumber();

			if (list.search(item)) {
				list.DeleteAtPosition(item);

			} else {
				list.insertAtSpecificPosition(item);
			}

			System.out.println("after searching operation list is");
			list.printList();

			String s = "";
			int n = list.getListSize()+1;
			int[] arr = new int[n];
			Node<Integer> temp = list.start;
			for (int i = 0; i < n; i++) {
				arr[i] = temp.getData();
				temp = temp.getNext();
				s = s + arr[i] + " ";
			}

			FileWriter fw = new FileWriter(
					"/home/admin1/eclipse-workspace/BridgeLabzPrograms/src/com/bridgelabz/files/OrderListAns.txt");
			fw.write(s);
			fw.flush();
			fw.close();
		} catch (Exception e) {
			System.out.println("Please Enter valid input");
		}
	}
}
