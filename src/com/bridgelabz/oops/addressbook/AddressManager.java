package com.bridgelabz.oops.addressbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import com.bridgelabz.utility.Utility;

public class AddressManager {

	List<Person> list = new ArrayList<>();
	ObjectMapper mapper = new ObjectMapper();
	String json = "[";
	private String name;
	AddressBook address = new AddressBook();

	Scanner sc = new Scanner(System.in);

	public void Create() {
		System.out.println("Enter Name Of Address Book");
		String name = sc.nextLine();

		if (new File("/home/admin1/eclipse-workspace/BridgeLabzPrograms/src/com/bridgelabz/files/" + name + ".json")
				.exists()) {
			System.out.println("Address Book Already Exists");
		} else {
			try {
				list.clear();
				mapper.writeValue(new File(
						"/home/admin1/eclipse-workspace/BridgeLabzPrograms/src/com/bridgelabz/files/" + name + ".json"),
						list);
				this.name = name;

			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				System.out.println("Address Book Created");
			}
		}

	}

	public void open() {

		File folder = new File("/home/admin1/eclipse-workspace/BridgeLabzPrograms/src/com/bridgelabz/files");
		File[] listOfFiles = folder.listFiles();

		for (File file : listOfFiles) {
			if (file.isFile()) {
				System.out.println(file.getName());
			}
		}

		System.out.println("Enter Name of File You Want To Open");
		String name = sc.nextLine();

		if (new File("/home/admin1/eclipse-workspace/BridgeLabzPrograms/src/com/bridgelabz/files/" + name + ".json")
				.exists()) {
			try {
				list = mapper.readValue(new File(
						"/home/admin1/eclipse-workspace/BridgeLabzPrograms/src/com/bridgelabz/files/" + name + ".json"),
						new TypeReference<List<Person>>() {
						});
				address.Opeartion(list);
				// personOperation.Opeartion(list);
				// System.out.println(list);

			}

			catch (Exception e) {
				e.printStackTrace();
			} finally {
				System.out.println("File Opened");
			}
		} else {
			System.out.println("File Not Found");
		}

	}

	public void save() {
		System.out.println("Enter File Name We Want to save");
		String name = sc.nextLine();
		try {

			mapper.writeValue(new File(
					"/home/admin1/eclipse-workspace/BridgeLabzPrograms/src/com/bridgelabz/files/" + name + ".json"),
					list);

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("File Saved");

	}

	public void saveAs() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter . extension you want");
		String format = sc.next();
		try {
			FileOutputStream fos = new FileOutputStream(
					"/home/admin1/eclipse-workspace/BridgeLabzPrograms/src/com/bridgelabz/files/" + name + "."
							+ format);

			byte b[] = "FirstName   LastName    City        State       Zip         PhoneNumber \n".getBytes();
			String spaces = "            ";
			fos.write(b);
			for (int i = 0; i < list.size(); i++) {

				b = (list.get(i).firstname + spaces.substring(list.get(i).firstname.length(), spaces.length()))
						.getBytes();
				fos.write(b);
				b = (list.get(i).lastname + spaces.substring(list.get(i).lastname.length(), spaces.length()))
						.getBytes();
				fos.write(b);
				b = (list.get(i).mobno + spaces.substring(list.get(i).mobno.length(), spaces.length())).getBytes();
				fos.write(b);
				b = (list.get(i).address.city + spaces.substring(list.get(i).address.city.length(), spaces.length()))
						.getBytes();
				fos.write(b);
				b = (list.get(i).address.state + spaces.substring(list.get(i).address.state.length(), spaces.length()))
						.getBytes();
				fos.write(b);
				b = (list.get(i).address.zip + spaces.substring(list.get(i).address.zip.length(), spaces.length()))
						.getBytes();
				fos.write(b);

				b = "\n".getBytes();
				fos.write(b);

			}
			fos.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
