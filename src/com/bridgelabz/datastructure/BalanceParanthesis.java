/*
* Created by:Ravi Gaikwad.
* Date 26/09/2019
* Purpose: 3. Simple Balanced Parenthesis.
**/
package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Utility;

public class BalanceParanthesis {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility u1 = new Utility();
		System.out.println("enter the expression:");
		String str = Utility.inputString();// give expression from user.
		u1.simpleBalanceParenthesis(str);// function call.
	}
}
