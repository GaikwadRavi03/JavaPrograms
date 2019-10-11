///*
//* Created by:Ravi Gaikwad.
//* Date 7/10/2019.
//* Purpose: 7. Commercial data processing using stack.
//**/
//package com.bridgelabz.oops.commertialdata;
//
//import java.io.File;
//import java.io.IOException;
//import java.util.StringJoiner;
//
//import org.codehaus.jackson.map.JsonMappingException;
//import org.codehaus.jackson.map.ObjectMapper;
//import org.codehaus.jackson.type.TypeReference;
//
//import com.bridgelabz.utility.LinkedList;
//import com.bridgelabz.utility.Stack;
//
//public class StockAccountUsingStack {
//
//	public static void main(String args[]) throws JsonMappingException, IOException {
//
////		String comapnyNo;
//		String comapnyName;
//		String comapnySymbol;
////		String noOfShares;
////		String sharePrice;
//		String totalValues;
//
//		ObjectMapper mapper = new ObjectMapper();
//		Stack<String> stack = new Stack<>(); // create object of stack class
//		// read data from file to linked list
//		LinkedList<Company> data1 = mapper.readValue(
//				new File("/home/admin1/eclipse-workspace/BridgeLabzPrograms/src/com/bridgelabz/files/company.json"),
//				new TypeReference<LinkedList<Company>>() {
//				});
//		int i = 0;
//		int size = data1.size;
//		if (size == 0) // if file is empty
//			System.out.println("\nno data found");
//		// if file is not empty then print details
//		else {
//			// StringBuffer symbolWithData=null;
//			for (i = 0; i < data1.size; i++) {
//				comapnyName =  data1.get(i).getCompanyName().trim();
//				comapnySymbol =  data1.get(i).getSymbol().trim();
//				totalValues = data1.get(i).getSymbolValue();
//				StringJoiner joiner = new StringJoiner(" ");
//				joiner.add(comapnyName + " ");
//				joiner.add(comapnySymbol + " ");
//				joiner.add(totalValues + " ");
//
//				// System.out.println("SysmbolWithData:"+symbolWithData);
//				stack.push(joiner.toString()); // add data to stack
//			}
//		}
//		System.out.println("company\t symbol\tSymbolvalue\n");
//		System.out.println(stack);
//		// System.out.println(str);
//	}
//}
