package com.bridgelabz.oops.address;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import com.bridgelabz.utility.Utility;

public class AddressBook {

	@SuppressWarnings("unused")
	private static final Consumer<Person> Person = null;
	static Scanner sc = new Scanner(System.in);
	static List<Person> personlist;
	// static List<Person> listdata;
	static List<Person> list = new ArrayList<>();

	static Person person = new Person();
	String fname = "";
	String lname = "";
	String mobno = "";
	String city = "";
	String state = "";
	String zip = "";
	boolean opeationresult = false;

	static Address address = new Address();

	public boolean Opeartion(List<Person> recvlist) {
		list = recvlist;
		int choice = 0;
		do {
			System.out.println("***********Operation of User***********");
			System.out.println("1.Add");
			System.out.println("2.Edit");
			System.out.println("3.Delete");
			System.out.println("4.SearchByName");
			System.out.println("5.SearchByZip");
			System.out.println("6.sortByName");
			System.out.println("7.sortByZip");
			System.out.println("8.print");
			System.out.println("9.Exit");
			choice = Utility.inputNumber();
			switch (choice) {

			case 1:
				System.out.println("Add USer");
				addUser();
				break;

			case 2:
				System.out.println("Edit USer");
				editUser();
				break;

			case 3:
				System.out.println("Delete USer");
				deleteUser();
				break;

			case 4:
				System.out.println("SearchByName USer");
				searchbyName();
				break;

			case 5:
				System.out.println("SearchByZip USer");
				searchbyZip();
				break;

			case 6:
				System.out.println("Sort By Name");
				sortByName();
				break;

			case 7:
				System.out.println("Sort By Zip");
				sortByZip();
				break;

			case 8:
				System.out.println("Print USer Details");
				print(list);

				break;

			case 9:
				System.out.println("Exiting");

				break;
			default:
				System.out.println("Invalid Input Please Enter Correct Choice");

			}

		} while (choice != 9);

		return opeationresult;

	}

	// Add person with his details.
	@SuppressWarnings("resource")
	public static void addUser() {

		System.out.println("****************Pserson Details******************");
		System.out.println("Enter Person First Name");
		// String fname=Jsonutil.getString();
		String firstname = sc.nextLine();
		person.setFirstname(firstname);

		System.out.println("Enter Person Last Name");
		String lastname = sc.nextLine();
		person.setLastname(lastname);

		System.out.println("Enter Person Contact Number");
		String mobno = sc.nextLine();
		person.setMobno(mobno);

		System.out.println("Enter City");
		String city = sc.nextLine();
		address.setCity(city);

		System.out.println("Enter State");
		String state = sc.nextLine();
		address.setState(state);

		System.out.println("Enter Zip");
		String zip = sc.nextLine();
		address.setState(zip);

		Person temp = new Person(firstname, lastname, mobno, new Address(city, zip, state));
		list.add(temp);

		ObjectMapper mapper = new ObjectMapper();
		String json = "[";
		JSONParser parser = new JSONParser();
		try {
			File file = new File(
					"/home/admin1/eclipse-workspace/BridgeLabzPrograms/src/com/bridgelabz/files/person.json");
			// if the file is empty
			if (file.length() == 0) {

				json = json + mapper.writeValueAsString(temp) + "]";
			}

			{
				// read the data from file
				Object object = parser.parse(new FileReader(
						"/home/admin1/eclipse-workspace/BridgeLabzPrograms/src/com/bridgelabz/files/person.json"));
				JSONArray array = new JSONArray();
				array = (JSONArray) object;
				for (int j = 0; j < array.size(); j++) {
					json = json + array.get(j) + ",";
					// System.out.println(json);
				}
				json = json + mapper.writeValueAsString(temp) + "]";
				System.out.println(json);

			}

		}

		catch (IOException e1) {
			e1.printStackTrace();
		} catch (org.json.simple.parser.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			FileWriter file = new FileWriter(
					"/home/admin1/eclipse-workspace/BridgeLabzPrograms/src/com/bridgelabz/files/person.json");
			file.write(json);
			file.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Edit and change the user Data.
	public static void editUser() {
		int i = 0;
		System.out.println("Enter User Edited Name");
		String editname = sc.nextLine();

		System.out.println("Enter User Editied Mobile Number");
		String editmobno = sc.nextLine();

		for (i = 0; i < list.size(); i++) {
			Person temp = list.get(i);
			if (temp.getFirstname().equals(editname) && temp.getMobno().equals(editmobno)) {
				int choice1 = 0;
				do {
					System.out.println("Choose Which Opeartion You Want to Perform");
					System.out.println("1.FirstName");
					System.out.println("2.LastName");
					System.out.println("3.MobNo");
					System.out.println("4.City");
					System.out.println("5.State");
					System.out.println("6.Zip");
					System.out.println("7.Exit");
					choice1 = Utility.inputNumber();
					switch (choice1) {

					case 1:
						System.out.println("Enter User First Name");
						String firstname = sc.nextLine();
						list.get(i).setFirstname(firstname);
						break;

					case 2:
						System.out.println("Enter User Last Name");
						String lastname = sc.nextLine();
						list.get(i).setLastname(lastname);
						break;

					case 3:

						System.out.println("Enter User Mobile Number");
						String mobno = sc.nextLine();
						list.get(i).setMobno(mobno);
						break;

					case 4:

						System.out.println("Enter City");
						String city = sc.nextLine();
						list.get(i).address.city = city;
						break;

					case 5:
						System.out.println("Enter state");
						String state = sc.nextLine();
						list.get(i).address.state = state;
						break;

					case 6:
						System.out.println("Enter zip");
						String zip = sc.nextLine();
						list.get(i).address.zip = zip;
						break;

					case 7:
						System.out.println("Exit");
						break;
					default:
						System.out.println("Invalid Input");
					}
				} while (choice1 != 7);
			}
		}

		if (i > list.size()) {
			System.out.println("Person Not Exist");
		}
	}

	// Delete the person.
	public void deleteUser() {

		System.out.println("Enter User by Mobile Number");
		String deleteMobNo = sc.nextLine();
		int i = 0;
		for (i = 0; i < list.size(); i++) {
			Person temp = list.get(i);
			if (temp.getMobno().equals(deleteMobNo)) {
				list.remove(i);
			}
		}
	}

	// Search person by his name.
	public void searchbyName() {

		System.out.println("Enter User Name");
		String name = sc.nextLine();

		try {
			List<Person> listsearch = (List<Person>) list.stream().filter(i -> i.getFirstname().equals(name))
					.collect(Collectors.toList());
			System.out.println("FirstName   LastName    Mobile_Number     City     State     Zip   \n");
			for (int i = 0; i < listsearch.size(); i++) {
				System.out.print(listsearch.get(i).firstname + "     " + listsearch.get(i).lastname + "     "
						+ listsearch.get(i).mobno + "     " + listsearch.get(i).address.state + "    "
						+ listsearch.get(i).address.city + "    " + listsearch.get(i).address.zip);
			}
		} catch (Exception e) {
			System.out.println("Name not found");
		}
	}

	// Sort persons list by name.
	public void sortByName() {
		// sort by name
		List<Person> listTemp = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			listTemp.add(list.get(i));
		}

		for (int i = 0; i < listTemp.size() - 1; i++) {
			for (int j = i + 1; j < listTemp.size(); j++) {
				if (listTemp.get(i).firstname.compareTo(listTemp.get(j).firstname) > 0) {
					Person temp1 = listTemp.remove(i);
					Person temp2 = listTemp.remove(j - 1);
					listTemp.add(i, temp2);
					listTemp.add(j, temp1);
				}
			}
		}
		print(listTemp);
	}

	// Sort persons by his zip.
	public void sortByZip() {

		// sort by zip
		List<Person> listTemp = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			listTemp.add(list.get(i));
		}

		for (int i = 0; i < listTemp.size() - 1; i++) {
			for (int j = i + 1; j < listTemp.size(); j++) {

				if (listTemp.get(i).address.state.compareTo(listTemp.get(i + 1).address.state) > 0) {
					Person temp1 = listTemp.remove(i);
					Person temp2 = listTemp.remove(j - 1);
					listTemp.add(i, temp2);
					listTemp.add(j, temp1);
				}
			}
		}
		print(listTemp);
	}

	// Search person by his zip.
	public void searchbyZip() {

		System.out.println("Enter User Zip code");
		String zipname = sc.nextLine();

		try {
			List<Person> listsearch = (List<Person>) list.stream().filter(i -> i.getAddress().zip.equals(zipname))
					.collect(Collectors.toList());

			System.out.println("FirstName   LastName    Mobile_Number     City     State     Zip   \n");
			for (int i = 0; i < listsearch.size(); i++) {
				System.out.print(listsearch.get(i).firstname + "     " + listsearch.get(i).lastname + "     "
						+ listsearch.get(i).mobno + "     " + listsearch.get(i).address.state + "    "
						+ listsearch.get(i).address.city + "    " + listsearch.get(i).address.zip);
			}
		} catch (Exception e) {
			System.out.println("Zip not Found");
		}
	}

	// Print all details of person.
	public void print(List<Person> listdata) {
		System.out.println("FirstName   LastName    Mobile_Number     Zip       City     State        \n");
		@SuppressWarnings("unused")
		String spaces = " ";
		for (int i = 0; i < listdata.size(); i++) {

			System.out.print(listdata.get(i).firstname + "     " + listdata.get(i).lastname + "     "
					+ listdata.get(i).mobno + "     " + listdata.get(i).address.state + "    "
					+ listdata.get(i).address.city + "    " + list.get(i).address.zip);

			System.out.println();
		}
	}
}
