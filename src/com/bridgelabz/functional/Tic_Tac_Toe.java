/*
* Created by:Ravi Gaikwad.
* Date 26/09/2019
* Purpose:14.Cross Game or Tic-Tac_Toe.
**/
package com.bridgelabz.functional;

import com.bridgelabz.utility.Utility;

public class Tic_Tac_Toe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility u1 = new Utility();
		System.out.println("Tic Tac Toe Game");
		System.out.println("player1 is computer :O");
		// accept the name of player 2

		System.out.println("Enter name of player2 ");
		// store the name of player 2
		String name = u1.inputString();
		// calling this method to play game tictacteo
		u1.gameTictactoe(name); // function call.
	}
}
