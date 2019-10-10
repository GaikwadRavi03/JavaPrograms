package com.bridgelabz.oops.commertialdata;

import java.io.File;
import java.io.IOException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import com.bridgelabz.utility.LinkedList;

public class StockAccountUsingLinkedList {

	static ObjectMapper objectmapper = new ObjectMapper();
	static String path = "/home/admin1/eclipse-workspace/BridgeLabzPrograms/src/com/bridgelabz/files/company.json";

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {

		CompanyModel companyModel = new CompanyModel();
		File file = new File(path);
//		List<Company> companylist = new ArrayList<>();
//		companylist = objectmapper.readValue(file, new TypeReference<List<Company>>() {
//		});
//		System.out.println(companylist);

		LinkedList<Company> companyList = new LinkedList<>();
//		companyList.insertAtLast();
	}
}
