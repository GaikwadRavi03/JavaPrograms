///*
//* Created by:Ravi Gaikwad.
//* Date 7/10/2019.
//* Purpose: 8. Commercial data processing using Queue.
//**/
//package com.bridgelabz.oops.commertialdata;
//
//import java.io.File;
//import java.io.IOException;
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//import java.util.Queue;
//
//import org.codehaus.jackson.map.JsonMappingException;
//import org.codehaus.jackson.map.ObjectMapper;
//import org.codehaus.jackson.type.TypeReference;
//
//import com.bridgelabz.utility.LinkedList;
//
//
//public class StockAccountUsingQueue {
//	public static void main(String args[]) throws JsonMappingException, IOException {
//		String companyName = null;
//		String symbol = null;
//		// object of queue class
//		ObjectMapper mapper = new ObjectMapper();
//	Queue<String> 
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"); // set date and time format
//		LocalDateTime now = LocalDateTime.now(); // get current time
//		String date = (dtf.format(now));
//		// read file data into linked list
//		LinkedList<Company> list = mapper.readValue(new File(
//				"/home/admin1/Desktop/BridgeLabzPrograms/src/com/bridgelabz/oops/commercialdataprocessing/commercialStockData.json"),
//				new TypeReference<LinkedList<Company>>() {
//				});
//		int i = 0;
//		int size = data1.size;
//		// check if file is empty
//		if (size == 0)
//			System.out.println("\nno data found");
//		// if file is not empty then print details
//		else {
//
//			for (i = 0; i < data1.size; i++) {
//				StringBuffer buffer = new StringBuffer();
//				companyName = data1.get(i).getgetCompanyName().trim();
//				buffer.append(companyName + " ");
//
//				symbol = data1.get(i).getSymbol().trim();
//				buffer.append(symbol + " ");
//				date = data1.get(i).getDate().trim();
//				buffer.append(date + " ");
//				queue.enque(buffer.toString());// add data to queue
//			}
//		}
//		System.out.println("  company\tsymbol\t  date & time of transaction\n");
//		System.out.println(queue);
//
//	}
//}
