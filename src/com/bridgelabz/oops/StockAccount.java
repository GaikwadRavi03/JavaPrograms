package com.bridgelabz.oops;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class StockAccount {

	List<Stock> stocklist = new ArrayList<>();
	List<String> transition = new ArrayList<>();
	int amount;

	public StockAccount(String name) {
		// TODO Auto-generated constructor stub
		if (!new File("/home/admin1/eclipse-workspace/BridgeLabzPrograms/src/com/bridgelabz/files/" + name + ".json")
				.exists()) {
			FileOutputStream file;
			this.amount = 10000;
			try {
				file = new FileOutputStream(
						"/home/admin1/eclipse-workspace/BridgeLabzPrograms/src/com/bridgelabz/files/" + name + ".json");
				new ObjectMapper().writeValue(new File(
						"/home/admin1/eclipse-workspace/BridgeLabzPrograms/src/com/bridgelabz/files/" + name + ".json"),
						this);
				file.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Person Exists");
		}
	}

	public StockAccount(String name, int i) {
		// TODO Auto-generated constructor stub
		try {
			ObjectMapper ob = new ObjectMapper();

			StockAccount persontemp = (StockAccount) ob.readValue(new File(
					"/home/admin1/eclipse-workspace/BridgeLabzPrograms/src/com/bridgelabz/files/" + name + ".json"),
					new TypeReference<StockAccount>() {
					});

			this.stocklist = persontemp.stocklist;
			this.transition = persontemp.transition;
			this.amount = persontemp.amount;
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

}
