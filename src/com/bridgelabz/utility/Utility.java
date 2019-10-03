package com.bridgelabz.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Utility {

	/**
	 * Scanner.
	 */
	static Scanner sc = new Scanner(System.in);

	public static int inputNumber() {
		return sc.nextInt();
	}

	public String inputString() {
		return sc.next();
	}

	public double inputdouble() {
		return sc.nextDouble();
	}

	/**
	 * ---------------------------------------------------------------
	 * ---------------------Functional Programs-----------------------
	 * ----------------------------------------------------------------
	 */

	/**
	 * Purpose: User input and replace string template "Hello<<UserName>>, How are
	 * 
	 * @param str
	 */
	public static void printHelloUser(String str) {
		// TODO Auto-generated method stub
		System.out.println("hello " + str + ", how are you?");
	}

	/**
	 * Purpose: Flip coin and print percentage of Heads and Tails.
	 * 
	 * @param times
	 */
	public void tossCoin(int times) {
		// TODO Auto-generated method stub
		double head = 0;
		for (int i = 0; i < times; i++) {
			// Generatr Random numbers till user define number times.
			if (Math.random() > 0.5) {
				head++;
			}
		}
		System.out.println("head % =" + (float) (head / times) * 100);
		System.out.println("tails % =" + (float) (times - head) / times * 100);
	}

	/**
	 * Purpose: Find leap year or not.
	 * 
	 * @param year
	 */
	public void findLeapYear(int year) {
		// TODO Auto-generated method stub
		if (year % 400 == 0 || year % 4 == 0 || year % 100 == 0) {
			System.out.println("leap year:");
		} else {
			System.out.println("not leap year");
		}
	}

	/**
	 * Purpose: Power of two.
	 */
	public void powerOfTwo(int num) {
		// TODO Auto-generated method stub
		int power = 1;
		for (int i = 0; i <= num; i++) {
			System.out.println("2^" + i + "=" + power);
			power *= 2;
		}
	}

	/**
	 * Purpose: Harmonic Number.
	 * 
	 * @param n
	 */
	public static void findHarmonic(int n) {
		// TODO Auto-generated method stub
		double sum = 1;
		for (int i = 2; i <= n; i++) {
			sum += 1.0 / i;
			System.out.print(sum + " ");
		}
		System.out.println("total is:" + sum);
	}

	/**
	 * Purpose: Prime Factors.
	 * 
	 * @param n
	 */
	public void findPrimeFactores(int n) {
		// TODO Auto-generated method stub
		System.out.println("given no is:" + n);
		for (int i = 2; i <= n; i++) {
			while (n % i == 0) {
				System.out.print(i + " ");
				n = n / i;
			}
		}
	}

	/**
	 * Purpose: Gambler.
	 * 
	 * @param stake
	 * @param goal
	 * @param trails
	 */
	public void findGambling(int stake, int goal, int trails) {
		// TODO Auto-generated method stub
		int WinCount = 0, LossCount = 0;
		for (int i = 1; i <= trails; i++) {
			if (Math.random() > 0.5) {
				if ((stake == goal) || (stake == 0))
					break;
				WinCount++;
				stake++;
			} else {
				if ((stake == goal) || (stake == 0))
					break;
				LossCount++;
				stake++;
			}
		}

		System.out.println("win % :" + (WinCount * 100) / (WinCount + LossCount));
		System.out.println("loss % :" + (LossCount * 100) / (WinCount + LossCount));

	}

	/**
	 * Purpose: Print Two Dimensional Array.
	 */
	// Two D Array for Integer
	public static void TwoD_ArrayForInteger() {
		// TODO Auto-generated method stub
		int arr[][] = new int[3][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the integers");
		// Integer numbers store in two D array
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	// Two D Array for Double
	public static void TwoD_ArrayForDouble() {
		// TODO Auto-generated method stub
		double drr[][] = new double[3][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the decimal integers");
		// numbers store in two D array
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				drr[i][j] = sc.nextDouble();
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(drr[i][j] + " ");
			}
			System.out.println();
		}
	}

	// Two D Array for Boolean
	public static void TwoD_ArrayForBoolean() {
		// TODO Auto-generated method stub
		String str[][] = new String[3][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		// store in two D array
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				str[i][j] = sc.next();
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(str[i][j] + " ");
			}
			System.out.println();
		}
	}

	/**
	 * Purpose: Sum of three Integers adds to zero.
	 * 
	 * @param arr
	 * @param n
	 */
	public void findTriples(int[] arr, int n) {
		// TODO Auto-generated method stub
		boolean found = false;
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					if (arr[i] + arr[j] + arr[k] == 0) {
						System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
						found = true;
					}
				}
			}
		}
		if (found == false) {
			System.out.println("not exist");
		}
	}

	/**
	 * purpose : find Distance.
	 * 
	 * @param x
	 * @param y
	 */
	public static void findDistance(int x, int y) {
		// TODO Auto-generated method stub
		double distance = Math.sqrt(x * x + y * y);
		System.out.println("distance from (" + x + " " + y + ") to (0,0)= " + distance);
	}

	/**
	 * purpose : Permutation of a string.
	 * 
	 * @param str
	 * @param first
	 * @param last
	 */
	public void permute(String str, int first, int last) {
		// TODO Auto-generated method stub
		if (first == last) { // if first and last is equal then it will print sting
			System.out.println(str);
		} else {
			for (int i = first; i <= last; i++) {
				str = swap(str, first, i);// swap methode call
				permute(str, first + 1, last);// Recusively permute method call.
				str = swap(str, first, i);// swap methode call
			}
		}
	}

	/**
	 * purpose : swap methode body of function.
	 * 
	 * @param str
	 * @param first
	 * @param i
	 * @return
	 */
	private String swap(String str, int first, int i) {
		// TODO Auto-generated method stub
		char temp;
		char ch[] = str.toCharArray();// convert string into char array.
		temp = ch[first];
		ch[first] = ch[i];
		ch[i] = temp;
		return String.valueOf(ch);// Returns the string representation of argument.
	}

	/**
	 * purpose : Simulate Stopwatch Progarm.
	 */
	public long startTimer = 0;
	public long stopTimer = 0;
	public long elapsed;

	/**
	 * purpose : Store currnt system time int start variable .
	 */
	public void start() {
		// TODO Auto-generated method stub
		startTimer = System.currentTimeMillis();
		System.out.println("start time is: " + startTimer);
	}

	/**
	 * purpose : Store currnt system time int stop variable
	 */
	public void stop() {
		// TODO Auto-generated method stub
		stopTimer = System.currentTimeMillis();
		System.out.println();
		System.out.println("stop time is: " + stopTimer);
	}

	/**
	 * Purpose : Store elapsed time.
	 * 
	 * @return
	 */
	public long elapsedTime() {
		elapsed = stopTimer - startTimer;
		return elapsed;
	}

	/**
	 * Purpose : tic Tac Toe Game.
	 * 
	 * @param name
	 */
	public static void gameTictactoe(String name) {
		// this board is an array to initailize play board
		String[] board = new String[9];
		String turn = "X"; // player Turn
		String winner = null; // to check who is win.
		String player2; // name of player 2

		// calling this method to load the board instruction
		isEmptyBoard(board);// it call when board is empty at first.

		player2 = name;
		System.out.println("Board Insrtuction");
		// this varible number to get player chosen number of slot
		System.out.println("Enter slot number to place in");
		printBoard(board);
		int num;
		turn = "0";
		// check the condition who is win assign the condition to enter input between o
		// to n
		// and they index filled
		while (winner == null) {

			try {

				if (turn.equalsIgnoreCase("0")) {
					Random rn = new Random();
					num = rn.nextInt(10);
					System.out.println("Computer choosed slot number :" + num);

				} else {
					num = Utility.inputNumber();
				}
				if (!(num > 0 && num <= 9)) {
					System.out.println("Invalid input; re-enter slot number:");
					continue;
				}
			} catch (InputMismatchException e) {
				System.out.println("Invalid input; re-enter slot number:");
				continue;
			}
			if (board[num - 1].equals(String.valueOf(num))) {
				board[num - 1] = turn;
				if (turn.equals("X")) {
					turn = "0";
				} else {
					turn = "X";
				}
				printBoard(board);// Print the tic tak toe board.
				winner = checkWinner(board, turn);
			} else {
				System.out.println("Slot already taken; re-enter slot number:");
				continue;
			}
		}
		// check the who is win otherwise play again task
		if (winner.equalsIgnoreCase("draw")) {
			System.out.println("It's a draw! Thanks for playing.");
		} else {
			System.out.println("Congratulations! " + winner + "'s have won! Thanks for playing.");
		}
	}

	// this are the condition to check win or not
	public static String checkWinner(String[] board, String turn) {
		for (int a = 0; a < 8; a++) {

			String line = null;
			switch (a) {
			case 0:
				line = board[0] + board[1] + board[2];
				break;
			case 1:
				line = board[3] + board[4] + board[5];
				break;
			case 2:
				line = board[6] + board[7] + board[8];
				break;
			case 3:
				line = board[0] + board[3] + board[6];
				break;
			case 4:
				line = board[1] + board[4] + board[7];
				break;
			case 5:
				line = board[2] + board[5] + board[8];
				break;
			case 6:
				line = board[0] + board[4] + board[8];
				break;
			case 7:
				line = board[2] + board[4] + board[6];
				break;
			}
			if (line.equals("XXX")) {
				return "X";
			} else if (line.equals("OOO")) {
				return "O";
			}
		}

		for (int a = 0; a < 9; a++) {

			if (Arrays.asList(board).contains(String.valueOf(a + 1))) {
				break;
			} else if (a == 8)
				return "draw";
		}

		// String turn = "X";
		System.out.println(turn + "'s turn:- enter a slot number to place " + turn + " in:");
		return null;
	}

	// This method is used to print the board
	public static void printBoard(String[] board) {

		System.out.println("|---|---|---|");
		System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
		System.out.println("|---|---|---|");
		System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
		System.out.println("|---|---|---|");
		System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
		System.out.println("|---|---|---|");
	}

	// empty board
	public static void isEmptyBoard(String[] board) {
		for (int a = 0; a < 9; a++) {
			board[a] = String.valueOf(a + 1);
		}
	}

	/**
	 * Purpose : Quadatic Equation.
	 * 
	 * @param a
	 * @param b
	 * @param c
	 */
	public void findQuadraticEqh(double a, double b, double c) {
		// TODO Auto-generated method stub
		double root1, root2;
		double determinant = b * b - 4 * a * c;

		// condition for real and different roots
		if (determinant > 0) {
			root1 = (-b + Math.sqrt(determinant)) / (2 * a);
			root2 = (-b - Math.sqrt(determinant)) / (2 * a);
			System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
		}
		// Condition for real and equal roots
		else if (determinant == 0) {
			root1 = root2 = -b / (2 * a);
			System.out.format("root1 = root2 = %.2f;", root1);
		}
		// If roots are not real
		else {
			double realPart = -b / (2 * a);
			double imaginaryPart = Math.sqrt(-determinant) / (2 * a);
			System.out.format("root1 = %.2f+%.2fi and root2 = %.2f-%.2fi", realPart, imaginaryPart, realPart,
					imaginaryPart);
		}
	}

	/**
	 * Purpose : WindChill.
	 * 
	 * @param t
	 * @param v
	 */
	public void findWindChill(double t, double v) {
		// TODO Auto-generated method stub
		if (t < 50 && (v < 120 && v > 3)) {
			double w = 35.74 + 0.6215 + (0.4275 * t + 35.75) * Math.pow(v, 0.16);
			System.out.println("Wind Chill = " + w);

		} else {
			System.out.println(
					"Please enter the temperature in less than 50 Fahrenheit\n and speed is between 3 to 120 (miles per hour)");
		}
	}

	/**
	 * ---------------------------------------------------------------
	 * ---------------------Algorithm Programs-----------------------
	 * ----------------------------------------------------------------
	 */
	/**
	 * Purpose : Anagram Detection for two strings.
	 * 
	 * @param str1
	 * @param str2
	 */
	public void isAnagram(String str1, String str2) {
		// TODO Auto-generated method stub
		String s1 = str1.replaceAll("\\s", "");
		String s2 = str2.replaceAll("\\s", "");
		boolean status = true;
		if (s1.length() != s2.length()) {
			status = false;
		} else {
			char[] ArrayS1 = s1.toLowerCase().toCharArray();// string1 convert in char array
			char[] ArrayS2 = s2.toLowerCase().toCharArray();// string2 convert in char array
			Arrays.sort(ArrayS1);// array1 sorted
			Arrays.sort(ArrayS2);// array2 sorted
			status = Arrays.equals(ArrayS1, ArrayS2);// check equal here.
		}
		if (status) {
			System.out.println("anagram");
		} else {
			System.out.println("not anagram");
		}
	}

	/**
	 * Purpose : Prime Numbers in Range of 0 -1000.
	 */
	public static void printPrimenumber() {
		// TODO Auto-generated method stub
		int flag;
		for (int num = 2; num <= 1000; num++) {
			flag = 0;
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.print(num + " ");
			}
		}
	}

	/**
	 * Purpose : Prime And Anagram.
	 */
	public static void primeAnagram() {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		boolean flag;
		for (int num = 2; num <= 1000; num++) {
			flag = true;
			for (int i = 2; i < num / 2; i++) {
				if (num % i == 0) {
					flag = false;
					break;
				}
			}
			if (flag)
				arr.add(num);// array stored with prime numbers.
		}
		for (int i = 0; i <= arr.size(); i++) {
			for (int j = i + 1; j < arr.size(); j++) {
				// anagram check here
				if (anagram(arr.get(i), arr.get(j))) {
					System.out.println("prime number :" + arr.get(i) + " Anagram :" + arr.get(j));
				}
			}
		}
	}

	// The numbers are anagram or not
	public static boolean anagram(int n1, int n2) {
		int[] ncount1 = count(n1);
		int[] ncount2 = count(n2);
		for (int i = 0; i < ncount2.length; i++) {
			if (ncount1[i] != ncount2[i]) {
				return false;
			}
		}
		return true;
	}

	private static int[] count(int n) {
		// TODO Auto-generated method stub
		int[] count = new int[20];
		int temp = n;
		while (temp != 0) {
			int r = temp % 10;
			count[r]++;
			temp = temp / 10;
		}
		return count;
	}

	/**
	 * prime and palindrome check.
	 */
	public static void primePalindrome() {
		int flag;
		for (int num = 2; num <= 1000; num++) {
			flag = 0;
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				int pnum = num;
				// pnum stores prime numbers till 1000.

				for (int i = 0; i < pnum; i++) {
					int d, rev = 0, temp;
					temp = pnum;
					while (pnum > 0) {
						d = pnum % 10;
						rev = rev * 10 + d;
						pnum = pnum / 10;
					}
					if (temp == rev) {
						int anum = num;
						System.out.println("prime & palindrome :" + num);
					} else {
						System.out.print("");
					}
				}
			}
		}
	}

	// Find Elapsed time for every sorting method.
	/**
	 * Purpose : Binary search method for integer
	 * 
	 * @param arr
	 */
	public void binarySearchInteger(int[] arr) {
		// TODO Auto-generated method stub

		sort(arr);
		int item = 7;
		int first = 0;
		int last = arr.length - 1;
		int middle = (first + last) / 2;

		while (first <= last) {
			if (arr[middle] == item) {

//				System.out.println(arr[middle] + ": found at index : " + middle);
				break;
			} else if (arr[middle] < item) {
				first = middle + 1;
			} else {
				last = middle - 1;
			}
			middle = (first + last) / 2;
		}
		if (first > last) {
			System.out.println("not found item");
		}
	}

	public static void sort(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		int temp;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	/**
	 * Purpose : Binary search method for String
	 * 
	 * @param str
	 */
	public void binarySearchString(String[] str) {
		// TODO Auto-generated method stub
		sort(str);

		String item = "EEE";
		int first = 0;
		int last = str.length - 1;
		int middle = (first + last) / 2;

		while (first <= last) {
			if (str[middle] == (item)) {
//				System.out.println();
//				System.out.println(str[middle] + ": found at index : " + middle);
				break;
			} else if (str[middle].compareTo(item) < 0) {
				first = middle + 1;
			} else {
				last = middle - 1;
			}
			middle = (first + last) / 2;
		}
		if (first > last) {
			System.out.println("not found item");
		}
	}

	private static void sort(String[] str) {
		// TODO Auto-generated method stub
		int n = str.length;
		String temp;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (str[i].compareTo(str[j]) > 0) {
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
	}

	/**
	 * Purpose : InsertionSort method for integer.
	 * 
	 * @param arr
	 */
	public void insertionSortInteger(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		int temp;
		for (int i = 1; i < n; i++) {
			temp = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}
	}

	/**
	 * Purpose : InsertionSort method for string.
	 * 
	 * @param str
	 */
	public void insertionSortString(String[] str) {
		// TODO Auto-generated method stub
		int n = str.length;
		String temp;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (str[i].compareToIgnoreCase(str[j]) > 0) {
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}

	}

	/**
	 * Purpose : BubbleSort method for integer.
	 * 
	 * @param arr
	 */
	public void bubbleSortInteger(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		int temp = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

	}

	/**
	 * Purpose : BubbleSort method for string
	 * 
	 * @param str
	 */
	public void bubbleSortstring(String[] str) {
		// TODO Auto-generated method stub
		int n = str.length;
		String temp;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (str[i].compareTo(str[j]) > 0) {
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
	}

	/**
	 * Purpose : BubbleSort method for integer in desending order.
	 * 
	 * @param arr
	 */
	public void bubbleSortIntegerDesending(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		int temp = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

	}

	/**
	 * Purpose : Binary Search to find the Number.
	 * 
	 * @param arr
	 * @param item
	 */
	public void binarySearchSort(int[] arr, int item) {
		// TODO Auto-generated method stub
		sort1(arr);
		System.out.println("sorted array list is:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		int first = 0;
		int last = arr.length - 1;
		int middle = (first + last) / 2;

		while (first <= last) {
			if (arr[middle] == item) {
				System.out.println();
				System.out.println(arr[middle] + ":Number found at index : " + middle);
				break;
			} else if (arr[middle] < item) {
				first = middle + 1;
			} else {
				last = middle - 1;
			}
			middle = (first + last) / 2;
		}
		if (first > last) {
			System.out.println("not found item");
		}
	}

	// sort
	private static void sort1(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		int temp;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	/**
	 * Purpose : Binary Search for the Word list.
	 * 
	 * @param str
	 * @param item
	 */
	public void BinarySearchForWord(String[] str, String item) {
		// TODO Auto-generated method stub
		sort4(str);
		System.out.println("string list is:");
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i] + " ");
		}

		int first = 0;
		int last = str.length - 1;
		int middle = (first + last) / 2;

		while (first <= last) {
			if (str[middle] == (item)) {
				System.out.println();
				System.out.println(str[middle] + ": found at index : " + middle);
				break;
			} else if (str[middle].compareTo(item) < 0) {
				first = middle + 1;
			} else {
				last = middle - 1;
			}
			middle = (first + last) / 2;
		}
		if (first > last) {
			System.out.println("not found item");
		}
	}

	private static void sort4(String[] str) {
		// TODO Auto-generated method stub
		int n = str.length;
		String temp;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (str[i].compareTo(str[j]) > 0) {
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
	}

	/**
	 * Purpose : sort the array into first and the second half.
	 * 
	 * @param str
	 * @param low
	 * @param hi
	 */
	public void mergeSort(String[] str, int low, int hi) {
		// TODO Auto-generated method stub
		if (low == hi) {
			return;
		}
		int mid = (low + hi) / 2;
		mergeSort(str, low, mid); // array divide first side
		mergeSort(str, mid + 1, hi); // array divide second side
		merge(str, low, mid, hi); // merge array
	}

	// merge string.
	private void merge(String[] str, int low, int mid, int hi) {
		// TODO Auto-generated method stub
		int n = hi - low + 1;
		String[] b = new String[n];
		int i1 = low;
		int i2 = mid + 1;
		int j = 0;
		while (i1 <= mid && i2 <= hi) {
			if (str[i1].compareTo(str[i2]) < 0) {
				b[j] = str[i1];
				i1++;
			} else {
				b[j] = str[i2];
				i2++;
			}
			j++;
		}
		while (i1 <= mid) {
			b[j] = str[i1];
			i1++;
			j++;
		}
		while (i2 <= hi) {
			b[j] = str[i2];
			i2++;
			j++;
		}

		for (j = 0; j < n; j++) {
			str[low + j] = b[j];
		}
	}

	/**
	 * Purpose : Day of Weeks.
	 * 
	 * @param d
	 * @param m
	 * @param y
	 */
	public void findDayOfWeeks(int d, int m, int y) {
		// TODO Auto-generated method stub
		int y1 = y - (14 - m) / 12;
		int x = y1 + y1 / 4 - y1 / 100 + y1 / 400;
		int m1 = m + 12 * ((14 - m) / 12) - 2;
		int d1 = (d + x + 31 * m1 / 12) % 7;
		System.out.println("day :" + d1);

		switch (d1) {
		case 0:
			System.out.println("sunday");
			break;
		case 1:
			System.out.println("monday");
			break;
		case 2:
			System.out.println("tuesday");
			break;
		case 3:
			System.out.println("wednsday");
			break;
		case 4:
			System.out.println("thursday");
			break;
		case 5:
			System.out.println("friday");
			break;
		case 6:
			System.out.println("saturday");
			break;

		default:
			System.out.println("invalid output");
			break;
		}
	}

	/**
	 * Purpose : Temprature conversion.
	 * 
	 * @param n
	 * @param c
	 * @param f1
	 */
	public void checkTemprature(int n, double c, double f1) {

		switch (n) {
		case 1:

			// it converts Celsius into Fahrenheit
			double f = (c * 9 / 5) + 32;
			System.out.print("Temperature in Fahrenheit : " + f);
			break;
		case 2:

			// it converts Fahrenheit into Celsius
			double c1 = (f1 - 32) * 5 / 9;
			System.out.print("\nTemperature in Celsius : " + c1);
			break;
		}
	}

	/**
	 * Purpose : Monthly Payment.
	 * 
	 * @param P
	 * @param Y
	 * @param R
	 * @return
	 */
	public static double monthlyPaymentIs(double P, double Y, double R) {
		double n = 12 * Y;
		double r = R / (12 * 100);
		double a = (double) Math.pow((1 + r), -n);
		// Math.pow return the value of first argument raised to the power of the second
		// argument
		double payment = (P * r) / 1 - a;
		return payment;// it return the payment.
	}

	/**
	 * Purpose : Square Root.
	 * 
	 * @param c
	 * @return
	 */
	public double sqrt(double c) {
		// TODO Auto-generated method stub
		double t = c;
		double epsilon = 1e-15;
		// Math.abs returns the absolute value of an int value.
		while (Math.abs(t - c / t) > epsilon * t) {
			t = (c / t + t) / 2;
		}
		return t;
	}

	/**
	 * Purpose : decimal to Binary with base2 Representation.
	 * 
	 * @param num
	 */
	public void FindBinaryRepresentation(int num) {
		// TODO Auto-generated method stub
		String binary = "";
		while (num > 0) {
			int d = num % 2;
			binary = binary + d;
			num = num / 2;
		}
		// padding 0 .
		if (binary.length() % 4 != 0)
			for (int i = 0; i < 4 - binary.length(); i++) {
				binary = "0" + binary;
			}
		System.out.println("Binary desending order :" + binary);
	}

	/**
	 * Purpose : Swap Nibbles.
	 * 
	 * @param n
	 */
	public void findSwapNibble(int n) {
		// TODO Auto-generated method stub
		int temp = n;
		String binary = "";
		while (n > 0) {
			int rem = n % 2;
			binary = rem + binary;
			n = n / 2;
		}
		System.out.println(temp + " in binaryary: " + binary);
		// System.out.println(binary.length());

		if (binary.length() >= 4 && binary.length() < 8 || binary.length() < 4) {
			int pad = 8 - binary.length();

			while (pad != 0) {
				binary = "0" + binary;
				pad--;
			}
		}

		System.out.println(temp + " in binaryary after padding 0's : " + binary);

		char c[] = binary.toCharArray();
		int j = binary.length() / 2;
		for (int i = 0; i < binary.length() / 2; i++) {
			char t = c[i];
			c[i] = c[j];
			c[j] = t;
			j++;
		}

		System.out.println("After swapping nibbles: " + String.valueOf(c));
		double decimal = 0;
		int number = Integer.parseInt(String.valueOf(c));

		for (int i = 0; i < binary.length(); i++) {
			int rem = number % 10;
			decimal = decimal + rem * Math.pow(2, i);
			number = number / 10;
		}
		System.out.println("Decimal equivalent of: " + String.valueOf(c) + " is: " + (int) decimal);

	}

	/**
	 * ---------------------------------------------------------------
	 * ---------------------DataStructure Programs-----------------------
	 * ----------------------------------------------------------------
	 */

	/**
	 * Purpose : Simple Balanced Parenthesis.
	 * 
	 * @param str
	 */
	public void simpleBalanceParenthesis(String str) {
		// TODO Auto-generated method stub
		// use stack
		Stack<Integer> stk = new Stack<Integer>();
		int n = str.length();
		for (int i = 0; i < n; i++) {
			char ch = str.charAt(i);
			if (ch == '(')
				stk.push(i);
			else if (ch == ')') {
				try {
					int p = stk.pop() + 1;
					System.out.println("balanced");
				} catch (Exception e) {
					System.out.println("UnBalanced");
				}
			}
		}
		while (!stk.isEmpty())
			System.out.println((stk.pop() + 1) + " unBalaned");
	}

	/**
	 * Purpose : Calendar show using Two D Array.
	 * 
	 * @param month
	 * @param year
	 */
	public static void calenderShow(int month, int year) {
		// TODO Auto-generated method stub
		String s[] = { "January", "Februry", "March", "April", "May", "June", "July", "August", "September", "October",
				"November", "December" };
		int arr[][] = new int[6][7];
		int start = dayOfWeek(month, 1, year);
		int fill = 1;
		int max = 0;
		if (month == 2) {
			boolean b = isLeapYear(year);
			if (b) {
				max = 29;
			} else {
				max = 28;
			}
		} else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			max = 31;
		} else {
			max = 30;
		}
		outer: for (int i = 0; i < 6; i++) {
			for (int j = start; j < 7; j++) {
				if (fill <= max) {
					arr[i][j] = fill;
					fill++;
				} else {
					break outer;
				}
			}
			start = 0;
		}
		System.out.println(s[month - 1] + " " + year);
		System.out.println("S  M  T  W  T  F  S");
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				if (arr[i][j] == 0) {
					System.out.print("   ");
				} else if (arr[i][j] > 9) {
					System.out.print(arr[i][j] + " ");
				} else {
					System.out.print(arr[i][j] + "  ");
				}
			}
			System.out.println();
		}
	}

	/**
	 * Purpose : Check Whether A Year is LeapYear Or Not.
	 * 
	 * @param n
	 * @return
	 */
	public static boolean isLeapYear(int n) {
		String s = n + "";

		if (s.charAt(2) == '0' && s.charAt(3) == '0') {
			if (n % 400 == 0)
				return true;

			else
				return false;
		} else {
			if (n % 4 == 0)
				return true;
			else
				return false;
		}

	}

	/**
	 * Purpose-Finding The Day Of Week
	 * 
	 * @param month
	 * @param day
	 * @param year
	 * @return
	 */
	public static int dayOfWeek(int m, int d, int y) {
		int y0 = y - (14 - m) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		int d0 = (d + x + 31 * m0 / 12) % 7;
		return d0;
	}

	/**
	 * Purpose : Printing The Calendar Of Random Month and Year Using Queue
	 * 
	 * @param month
	 * @param year
	 * @return void
	 */
	public static void calenderQueue(int month, int year) {
		String s[] = { "January", "Februry", "March", "April", "May", "June", "July", "August", "September", "October",
				"November", "December" };
		Queue<String> q1 = new Queue<>();
		int start = dayOfWeek(month, 1, year);

		int fill = 1;
		int max = 0;
		if (month == 2) {
			boolean b = Utility.isLeapYear(year);
			if (b) {
				max = 29;
			} else {
				max = 28;
			}
		} else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			max = 31;
		} else {
			max = 30;
		}
		while (start != 0) {
			q1.enqueue("   ");
			start--;
		}

		while (fill <= max) {
			if (fill <= 9)
				q1.enqueue(fill + "  ");
			else
				q1.enqueue(fill + " ");
			fill++;
		}

		System.out.println(s[month - 1] + " " + year);
		System.out.println("S  M  T  W  T  F  S");
		fill = 1;
		while (!q1.isEmpty()) {
			System.out.print(q1.dequeue());
			if (fill % 7 == 0) {
				System.out.println();
			}
			fill++;
		}
	}

	/**
	 * Purpose : Printing The Calendar Of Random Month and Year Using Stack
	 * 
	 * @param month
	 * @param year
	 * @return void
	 */
	public static void calenderStack(int month, int year) {
		String s[] = { "January", "Februry", "March", "April", "May", "June", "July", "August", "September", "October",
				"November", "December" };
		Stack<String> s1 = new Stack<>();
		Stack<String> s2 = new Stack<>();
		int start = dayOfWeek(month, 1, year);
		int fill = 1;
		int max = 0;
		if (month == 2) {
			boolean b = Utility.isLeapYear(year);
			if (b) {
				max = 29;
			} else {
				max = 28;
			}
		} else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			max = 31;
		} else {
			max = 30;
		}
		while (start != 0) {
			s1.push("   ");
			start--;
		}

		while (fill <= max) {
			if (fill <= 9)
				s1.push(fill + "  ");
			else
				s1.push(fill + " ");
			fill++;
		}
		while (!s1.isEmpty()) {
			s2.push(s1.pop());
		}

		System.out.println(s[month - 1] + " " + year);
		System.out.println("S  M  T  W  T  F  S");
		fill = 1;
		while (!s2.isEmpty()) {
			System.out.print(s2.pop());
			if (fill % 7 == 0) {
				System.out.println();
			}
			fill++;
		}
	}

	/**
	 * Purpose : Check A String is Palindrome Or not using Deque As DataStructure
	 * 
	 * @param s
	 * @return (boolean)
	 */
	public static boolean palindromeChecker(String s) {
		Deque<Character> D = new Deque<>();
		int index = 0;
		while (index < s.length()) {
			D.addRear(s.charAt(index));
			index++;
		}
		while (D.size() > 1) {
			Character c1 = D.removeFront();
			Character c2 = D.removeRear();
			if (c1 != c2) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Purpose : Finding Prime Number Upto 1000 Who Anagram With Other Prime Number
	 * And Store In A Stack
	 * 
	 * @return Stack<Integer>
	 */
	public static Stack<Integer> primeAnagramStack() {
		int arr[] = new int[500];
		arr[0] = 2;
		int size = 1;
		for (int i = 3; i < 1000; i++) {
			boolean flag = true;
			for (int j = size - 1; j >= 0; j--) {
				if (i % arr[j] == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				arr[size] = i;
				size++;
			}
		}
		Stack<Integer> s1 = new Stack<Integer>();

		int arr1[] = new int[10];
		int arr2[] = new int[10];

		for (int i = 0; i < size; i++) {
			int x = arr[i];
			int xvalue = x;
			int count1 = 0;
			if (x <= 9) {
				continue;
			} else {
				while (x > 0) {
					int temp1 = x % 10;
					x = x / 10;
					arr1[temp1]++;
					count1++;
				}
			}
			for (int j = 0; j < size; j++) {
				int x2 = arr[j];
				if (j == i || x2 <= 9) {
					continue;
				}
				int x2value = x2;
				int count2 = 0;
				while (x2 > 0) {
					int temp2 = x2 % 10;
					x2 = x2 / 10;
					arr2[temp2]++;
					count2++;
				}

				if (count1 == count2) {
					int k1 = 0;
					for (k1 = 0; k1 < 10; k1++) {
						if (arr1[k1] != arr2[k1])
							break;

					}
					if (k1 == 10) {
						s1.push(xvalue);
						break;
					}
				}
				Arrays.fill(arr2, 0);
			}
			Arrays.fill(arr1, 0);
		}
		return s1;
	}

	/**
	 * Purpose : Finding Prime Number Upto 1000 Who Anagram With Other Prime Number
	 * And Store In A Queue
	 * 
	 * @return Queue<Integer>
	 */
	public static Queue<Integer> primeAnagramQueue() {
		int arr[] = new int[500];
		arr[0] = 2;
		int size = 1;
		for (int i = 3; i < 1000; i++) {
			boolean flag = true;
			for (int j = size - 1; j >= 0; j--) {
				if (i % arr[j] == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				arr[size] = i;
				size++;
			}
		}
		Queue<Integer> q1 = new Queue<Integer>();

		int arr1[] = new int[10];
		int arr2[] = new int[10];

		for (int i = 0; i < size; i++) {
			int x = arr[i];
			int xvalue = x;
			int count1 = 0;
			if (x <= 9) {
				continue;
			} else {
				while (x > 0) {
					int temp1 = x % 10;
					x = x / 10;
					arr1[temp1]++;
					count1++;
				}
			}
			for (int j = 0; j < size; j++) {
				int x2 = arr[j];
				if (j == i || x2 <= 9) {
					continue;
				}
				int x2value = x2;
				int count2 = 0;
				while (x2 > 0) {
					int temp2 = x2 % 10;
					x2 = x2 / 10;
					arr2[temp2]++;
					count2++;
				}

				if (count1 == count2) {
					int k1 = 0;
					for (k1 = 0; k1 < 10; k1++) {
						if (arr1[k1] != arr2[k1])
							break;

					}
					if (k1 == 10) {
						q1.enqueue(xvalue);
						break;
					}
				}
				Arrays.fill(arr2, 0);
			}
			Arrays.fill(arr1, 0);
		}
		return q1;
	}

	/**
	 * Purpose : check the number is prime or not.
	 * 
	 * @param n
	 * @return
	 */
	public static boolean isPrime(int n) {
		int i = 2;
		while (i <= n / 2) {
			if (n % i == 0)
				return false;
			i++;
		}
		return true;
	}

	/**
	 * Purpose : Check Number is prime or not.
	 * 
	 * @param number
	 * @return
	 */
	public static ArrayList<Integer> prime(int number) {
		ArrayList<Integer> prime = new ArrayList<Integer>();

		// This for loop is starts from 2 and iterate n times
		for (int i = 2; i <= number; i++) {
			int c = 0;

			// This for loop is starts from 2 and iterate half of the value of the first
			// loop
			for (int j = 2; j <= i / 2; j++) {

				/*
				 * If the reminder of the first loop value and the second loop value is 0 then
				 * the value of the c is equal to 1 and break the inner loop
				 */
				if (i % j == 0) {
					c = 1;
					break;
				}
			}

			// if c is equal to 0 its mean the value of i is prime number and print the
			// value of i
			if (c == 0)
				prime.add(i);
		}
		return prime;
	}

	/**
	 * Purpose : Check Anagram for strings.
	 * 
	 * @param string1
	 * @param string2
	 * @return
	 */
	public static boolean CheckAnagram(String string1, String string2) {

		// compare the length of two strings is equal or not
		if (string1.length() != string2.length())
			return false;

		// call count method and pass first string
		int count1[] = count(string1);

		// call count method and pass second string
		int count2[] = count(string2);

		// check the value of the two strings are equal or not
		for (int i = 0; i < count1.length; i++) {
			if (count1[i] != count2[i])
				return false;
		}
		return true;
	}

	/**
	 * Purpose: This method is used to count the alphabets present in the string and
	 * increment the index of the count array.
	 * 
	 * @param string
	 * @return integer one dimensional array
	 */
	public static int[] count(String string) {

		// Convert String to character array
		char c[] = string.toCharArray();

		// Define a count array and the size of the array is 36
		int count[] = new int[36];

		// using loop 0 to size of the character array
		for (int i = 0; i < c.length; i++) {

			// if character array is small alphabet
			if (c[i] >= 'a' && c[i] <= 'z')

				// small alphabet covert into the integer and increment the count array
				count[c[i] - 97]++;

			// if character array is capital alphabet
			if (c[i] >= 'A' && c[i] <= 'Z')

				// capital alphabet convert into the integer and increment the count array
				count[c[i] - 65]++;

			// if character array is digit between 0 to 9
			if (c[i] >= '0' && c[i] <= '9')

				// digit convert into the integer and increment the count array
				count[c[i] - 22]++;
		}

		// return count array
		return count;
	}

	/**
	 * Purpose : Possibilities of Binary search tree.
	 * 
	 * @param i
	 * @return
	 */
	public static int numOfBST(int key) {
		int catalanNumber = factorial(2 * key) / (factorial(key + 1) * factorial(key));
		return catalanNumber;
	}

	/**
	 * Purpose : factorial() will calculate the factorial of given number.
	 * 
	 * @param num
	 * @return
	 */
	public static int factorial(int num) {
		int fact = 1;
		if (num == 0)
			return 1;
		else {
			while (num > 1) {
				fact = fact * num;
				num--;
			}
			return fact;
		}
	}

	/**
	 * Purpose : Simulate Banking Cash Counter.
	 * 
	 * @return
	 */
	public static int simulateBanking() {
		// TODO Auto-generated method stub
		Utility input = new Utility();
		Queue<Integer> q = new Queue<>();
		int Amount = 0;
		int answer = 0;
		do {
			System.out.println("1. Insert Person");
			System.out.println("2. Remove Person");
			System.out.println("3. Exit");
			System.out.println("Enetr your choice:");
			answer = inputNumber();
			switch (answer) {
			case 1:
				System.out.println("1. Deposit");
				System.out.println("2. Withdraw");

				int answer2 = inputNumber();
				if (answer2 == 1) {
					System.out.println("Enter Amount");
					int amt = inputNumber();
					Amount += amt;
					System.out.println("Amount Added");
					q.enqueue(amt);
				} else {
					System.out.println("Enter Amount");
					int amt = inputNumber();
					if (amt > Amount) {
						System.out.println("Insufficient Balance");
					} else {
						Amount -= amt;
						System.out.println("Amount Deduct");
					}
					q.enqueue(amt);
				}
				break;

			case 2:
				if (q.isEmpty()) {
					System.out.println("No Person In Queue");
				} else {
					System.out.println("Person Deleted From Queue");
					q.dequeue();
				}
				break;
			}
		} while (answer != 3);
		return Amount;
	}

	/**
	 * Purpose : Hashing Function to search a Number in a slot.
	 * 
	 * @param search
	 * @return
	 * @throws IOException
	 */
	public static boolean hasingSearch(int search) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream(
				"/home/admin1/eclipse-workspace/BridgeLabzPrograms/src/com/bridgelabz/files/Hashing.txt");
		HashList<Integer> arr[] = new HashList[11];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new HashList<Integer>();
		}
		Scanner sc = new Scanner(fis);
		while (sc.hasNext()) {
			int value = Integer.parseInt(sc.next());

			int temp_val = value % 11;

			arr[temp_val].add(value);
		}
		sc.close();
		System.out.println();

		int value = search % 11;
		boolean flag = arr[value].search(search);
		if (flag) {
			arr[value].remove(search);
		} else {
			arr[value].add(search);
		}

		FileOutputStream fos = new FileOutputStream(
				"/home/admin1/eclipse-workspace/BridgeLabzPrograms/src/com/bridgelabz/files/HashingAns.txt");
		int i = 0;
		for (i = 0; i < arr.length; i++) {
			while (!arr[i].isEmpty()) {
				fos.write((arr[i].pop() + " ").getBytes());
			}
		}
		fis.close();
		return flag;
	}
}