/*
* Created by:Ravi Gaikwad.
* Date 7/10/2019.
* Purpose: 6. Commercial data processing using Linked List.
**/
package com.bridgelabz.oops.commertialdata;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.codehaus.jackson.map.ObjectMapper;
import com.bridgelabz.utility.LinkedList;
import com.bridgelabz.utility.Utility;

public class StockAccountUsingLinkedList {

	static ObjectMapper mapper = new ObjectMapper();

	// store transaction data using linked list.
	public static LinkedList<Company> list = new LinkedList<>();

	public static void main(String args[]) throws Exception {
		int choice = 0;
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		Company com = new Company();
		do {
			System.out.println("\n1. Add data to the stock");
			System.out.println("2. Remove data from the stock");
			System.out.println("3. display list of stock ");
			System.out.println("4. buy symbol from stock ");
			System.out.println("5. sell symbol from stock");
			System.out.println("6. For Exit the stock management");
			choice = Utility.inputNumber();
			switch (choice) {
			case 1:
				// to add new data
				System.out.println("Enter company No:");
				String no = Utility.inputString();

				System.out.println("Enter company Name:");
				String name = Utility.inputString();

				System.out.println("Enter symbol:");
				String symbol = Utility.inputString();

				System.out.println("Enter No of shares");
				String nos = Utility.inputString();

				System.out.println("Enter company share prices:");
				String sharePrice = Utility.inputString();

				com.setComapnyNo(no);
				com.setComapnyName(name);
				com.setComapnySymbol(symbol);
				com.setNoOfShares(nos);
				com.setSharePrice(sharePrice);
				// get current time
				String date = (dtf.format(now));
				com.setDate(date);

				list.insertAtLast(com);
				// add new data
				// saveFile(com);
				System.out.println("data added successfully ");
				break;

			case 2:
				// to remove data
				list.DeleteFirst();
				System.out.println("data removed successfully");
				break;

			case 3:
				// to display data
				list.printList();
				break;

			case 4:
				System.out.println("Exiting");
				break;
			default:
				System.out.println("Invalid Entry Retype");
			}
		} while (choice <= 4 && choice > 0);
	}
}
