package com.bridgelabz.oops;

import java.io.IOException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.utility.Utility;

public class InventoryManager {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		Utility.JsonFileReadAndWrite();
	}
}
