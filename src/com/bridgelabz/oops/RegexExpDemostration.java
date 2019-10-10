/*
* Created by:Ravi Gaikwad.
* Date 5/10/2019.
* Purpose: 2. Regular Expression Demonstration.
**/
package com.bridgelabz.oops;

import com.bridgelabz.utility.Utility;

public class RegexExpDemostration {

	public static void main(String[] args) {
		// create the string
		String string = "Read in the following message: Hello <<name>>, We have your full name\n"
				+ "as <<full name>> in our system. your contact number is +91-�xxxxxxxxxx. Please,let us\n"
				+ "know in case of any clarification Thank you BridgeLabz XX/XX/XXXX";

		Utility.regexExp(string);
	}
}
