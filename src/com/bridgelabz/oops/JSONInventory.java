/*
* Created by:Ravi Gaikwad.
* Date 5/10/2019.
* Purpose: 1. JSON Inventory Data Management of Rice, Pulses and Wheats.
**/
package com.bridgelabz.oops;

import org.json.simple.parser.ParseException;
import com.bridgelabz.utility.Utility;

public class JSONInventory {
	public static void main(String[] args) throws ParseException, java.text.ParseException {
		// Function call for json file read.
		Utility.jsonFileRead();
	}
}
