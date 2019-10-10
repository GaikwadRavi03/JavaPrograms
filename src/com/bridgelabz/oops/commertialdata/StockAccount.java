package com.bridgelabz.oops.commertialdata;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.utility.Utility;

public class StockAccount {

	@SuppressWarnings("unchecked")
	public void createAccount() throws IOException, ParseException {
		// TODO Auto-generated method stub
		File file = new File(
				"/home/admin1/eclipse-workspace/BridgeLabzPrograms/src/com/bridgelabz/files/customer.json");
		if (file.exists()) {

			FileReader fr = new FileReader(file);
			JSONParser parser = new JSONParser();// parse json file into java objects
			JSONArray arr1 = (JSONArray) parser.parse(fr);// JSONArray is order sequence of values
			JSONObject json = new JSONObject();// creates json object
			System.out.println("Enter name");
			String name = Utility.inputString();
			System.out.println("Enter balance");
			int bal = Utility.inputNumber();
			json.put("Name", name);// here passing objects
			json.put("Balance", bal);
			json.put("ShareCount", 100);
			System.out.println("Created new Acc success");
			arr1.add(json);// here we pass all objects in array
			FileWriter fw = new FileWriter(file);
			fw.write(JSONArray.toJSONString(arr1));
			fw.flush();
			fw.close();
		}
	}

	@SuppressWarnings("unchecked")
	public static void buyShare() throws IOException, ParseException, org.json.simple.parser.ParseException {
		File file = new File(
				"/home/admin1/eclipse-workspace/BridgeLabzPrograms/src/com/bridgelabz/files/customer.json");
		File file1 = new File(
				"/home/admin1/eclipse-workspace/BridgeLabzPrograms/src/com/bridgelabz/files/company.json");
		File transaction = new File(
				"/home/admin1/eclipse-workspace/BridgeLabzPrograms/src/com/bridgelabz/files/Transaction.json");
		if (file.exists()) {

			if (file.exists() && file1.exists())

			{
				// reading stock file
				FileReader fr = new FileReader(file);// give file to read
				JSONParser parser = new JSONParser();// parse json file into java objects
				JSONArray stock = (JSONArray) parser.parse(fr);

				// reading share file
				FileReader sf = new FileReader(file1);
				JSONParser parser1 = new JSONParser();
				JSONArray share = (JSONArray) parser1.parse(sf);

				System.out.println("Enter the user");
				String name = Utility.inputString();
				Iterator<?> itr = stock.iterator();// iterator for customer json
				Iterator<?> itr1 = share.iterator();// iterator for company json
				boolean flag = false;
				while (itr.hasNext()) { // For comparing user name with stored we have to use the iterate customer.json
					JSONObject obj = (JSONObject) itr.next();//
					if (obj.get("Name").equals(name)) {
						System.out.println("Enter the share sysmbol to buy share:[@.#,!]");
						String sym = Utility.inputString();
						/*
						 * obj.put("Share symbol", sym); if(obj.get("Share Symbol").equals(sym)) {
						 */
						while (itr1.hasNext()) { // symbol in company json so iterate that
							JSONObject obj1 = (JSONObject) itr1.next();
							if (obj1.get("Symbol").equals(sym)) {
								System.out.println("Enter the amount to Buy share");
								int amt = Utility.inputNumber();
								int bal = Integer.parseInt(obj.get("Balance").toString());// taken from customerShare

								int noShare = Integer.parseInt(obj.get("ShareCount").toString());// taken from
																									// customerShare

								int price = Integer.parseInt(obj1.get("Price").toString());// taken from companyStock

								int stockShare = Integer.parseInt(obj1.get("Count").toString());// taken from
																								// companyStock

								int numofshare = amt / price;// amount is divided by Price we get from companyShare

								int newbal = bal - amt;// buying share so new balance reduce n number
								int sharecountcus = noShare + numofshare;// sharecount increases of user
								int sharecountstock = stockShare - numofshare;// n company share count reduced

								obj.remove("Balance");
								obj.remove("ShareCount");
								obj1.remove("Count");

								obj.put("Balance", newbal);
								obj.put("ShareCount", sharecountcus);
								obj1.put("Count", sharecountstock);
								Date d = new Date();
								String date = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a").format(d);
								System.out.println("Date " + date);
								flag = true;
								break;
							}
						}
					}
					FileWriter fs = new FileWriter(transaction);
					fs.write(JSONValue.toJSONString(stock));
					fs.flush();
					fs.close();
				}
				if (flag == false) {
					System.out.println("User name not exits");
				}
				FileWriter fw = new FileWriter(file1);
				fw.write(JSONValue.toJSONString(share));
				fw.flush();
				fw.close();
			} else {
				System.out.println("File does not exits");
			}
		}
		// StockAccount();
	}

	// here we selling shares so balance increses and number of shares of user
	// decreses and companys count share increses
	@SuppressWarnings("unchecked")
	public static void sellShare() throws IOException, ParseException, org.json.simple.parser.ParseException {
		File file = new File(
				"/home/admin1/eclipse-workspace/BridgeLabzPrograms/src/com/bridgelabz/files/customer.json");
		File file1 = new File(
				"/home/admin1/eclipse-workspace/BridgeLabzPrograms/src/com/bridgelabz/files/company.json");
		File transaction = new File(
				"/home/admin1/eclipse-workspace/BridgeLabzPrograms/src/com/bridgelabz/files/Transaction.json");
		if (file.exists()) {

			if (file.exists() && file1.exists()) {
				// Scanner scan = new Scanner(System.in);
				// reading stock file
				FileReader fr = new FileReader(file);
				JSONParser parser = new JSONParser();
				JSONArray stock = (JSONArray) parser.parse(fr);
				// reading share file

				FileReader sf = new FileReader(file1);
				JSONParser parser1 = new JSONParser();
				JSONArray share = (JSONArray) parser1.parse(sf);

				System.out.println("Enter the user");
				String name = Utility.inputString();
				Iterator<?> itr = stock.iterator();// iterate customerShare.json
				Iterator<?> itr1 = share.iterator();// iterate companyShare.json
				boolean flag = false;
				while (itr.hasNext()) {
					JSONObject obj = (JSONObject) itr.next();
					if (obj.get("Name").equals(name)) {
						System.out.println("Enter the share sysmbol to sale share:[@.#,!]");
						String sym = Utility.inputString();
						System.out.println("Enter the number of share to sale");
						int count = Utility.inputNumber();
						// obj.put("Share Symbol", sym);
						while (itr1.hasNext()) {
							JSONObject obj1 = (JSONObject) itr1.next();
							if (obj1.get("Symbol").equals(sym)) {// here we checking entered symbol is available or not
																	// in
																	// CompanyShare
								int bal = Integer.parseInt(obj.get("Balance").toString());// CustomerShare.json balance
																							// taken
								int price = Integer.parseInt(obj1.get("Price").toString());// Taken from
																							// CompanyStock.json
								int noShare = Integer.parseInt(obj.get("ShareCount").toString());// taken from
																									// CustomerShare.json
								int stockShare = Integer.parseInt(obj1.get("Count").toString());// Taken from
																								// CompanyStock.json
								int saleprize = count * price;// calculating for newbalance
								int newbal = bal + saleprize;
								int sharecountscustomer = noShare - count;// after sell sharecount reduced

								int sharecountstockcompany = stockShare + count;
								if (sharecountscustomer > 0 && noShare > 0) {
									obj.remove("Balance"); // remove old values
									obj.remove("ShareCount");
									obj1.remove("Count");
									obj.put("Balance", newbal);// store updated values
									obj.put("ShareCount", sharecountscustomer);
									obj1.put("Count", sharecountstockcompany);
								} else {
									System.out.println("No Shares Available");
								}
								Date d = new Date();
								String date = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a").format(d);
								System.out.println("Date " + date);
								flag = true;
								break;
							}
						}
					}

					FileWriter fs = new FileWriter(file);
					fs.write(JSONValue.toJSONString(stock));
					fs.flush();
					fs.close();
				}
				if (flag == false) {
					System.out.println("User name not exits");
				}
				FileWriter fw = new FileWriter(transaction);
				fw.write(JSONValue.toJSONString(share));
				fw.flush();
				fw.close();
			} else {
				System.out.println("File Does not exits");
			}
		}
		// StockAccount();
	}

	public static void printReport() throws IOException, ParseException, org.json.simple.parser.ParseException {

		File file = new File(
				"/home/admin1/eclipse-workspace/BridgeLabzPrograms/src/com/bridgelabz/files/customer.json");

		if (!file.exists()) {// if file not exists n file having
			System.out.println("NO customer is there.");
		} else {
			FileReader file1 = new FileReader(
					"/home/admin1/eclipse-workspace/BridgeLabzPrograms/src/com/bridgelabz/files/company.json");
			JSONParser parser = new JSONParser();
			JSONArray shareArray = (JSONArray) parser.parse(file1);
			Iterator<?> iterator = shareArray.iterator();
			while (iterator.hasNext()) {
				JSONObject shareobj = (JSONObject) iterator.next();
				System.out.println(shareobj);
			}
		}
		System.out.println();
	}
}
