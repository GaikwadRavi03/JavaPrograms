package com.bridgelabz.datastructure;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import com.bridgelabz.utility.LinkedList;
import com.bridgelabz.utility.Utility;

public class Hashing {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		Utility u1 = new Utility();
		File f1 = new File("/home/admin1/eclipse-workspace/BridgeLabzPrograms/src/com/bridgelabz/files/Hashing.txt");
		// Creation of File Descriptor for // input file
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
			}

			LinkedList<Integer>[] list = new LinkedList[arr1.length];
			for (int i = 0; i < list.length; i++) {
				list[i] = new LinkedList<Integer>();
			}
			int index = 0;
			for (int i = 0; i < list.length; i++) {
				index = arr2[i] % list.length;
				list[index].insertAtLast(arr2[i]);
			}
			

//			for (int i = 0; i < list.length; i++) {
//				System.out.print("" + i + " ");
//				for (int j = 0; j < list[i].size; j++) {
//					System.out.print(list[i].get(j + 1) + " ");
//				}
//			}
		}
	}
}
