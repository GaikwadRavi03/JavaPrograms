/*
* Created by:Ravi Gaikwad.
* Date 24/09/2019
* Purpose: 1.User input and replace string template "Hello<<UserName>>, How are you?".
**/
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class HelloUser {
	public static void main(String[] args) {
		System.out.println("enter the user name");
		String str = Utility.inputString();
		Utility.printHelloUser(str);// fun call
	}
}
