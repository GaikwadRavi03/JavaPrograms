/*
* Created by:Ravi Gaikwad.
* Date 27/09/2019
* Purpose: 11. 2D Array Prime numbers in 0-1000 range.
**/
package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Utility;

public class PrimeNumber2DArray {
	/* Method to to check if number is Prime? */

	public static void main(String[] args) {
		Object[][] obj = new Object[11][26];

		obj[0][0] = "--------Range------";
		obj[0][1] = "--------------Prime numbers-----------------------------------------------";
		obj[1][0] = "       [0-100]     ";
		obj[2][0] = "      [101-200]   ";
		obj[3][0] = "      [201-300]   ";
		obj[4][0] = "      [301-400]   ";
		obj[5][0] = "      [401-500]   ";
		obj[6][0] = "      [501-600]   ";
		obj[7][0] = "      [601-700]   ";
		obj[8][0] = "      [701-800]   ";
		obj[9][0] = "      [801-900]   ";
		obj[10][0] = "     [901-1000]   ";

		int columnindex = 1;
		int rowindex = 1;
		int range = 100;

		for (int i = 2; i <= 1000; i++) {
			if (Utility.isPrime(i) && i <= range) {
				obj[rowindex][columnindex] = i;
				columnindex++;
			}

			if (i > range) // Moving cursor to next row and first column
			{
				range = range + 100;
				columnindex = 1;
				rowindex++;
			}
		}

		/* Display 2-D Array */
		for (int i = 0; i < 11; i++) {
			for (int j = 0; j < 26; j++) {
				if (obj[i][j] != null)
					System.out.print(obj[i][j] + "  ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}