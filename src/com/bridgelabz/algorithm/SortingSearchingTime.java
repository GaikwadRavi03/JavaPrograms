/*
* Created by:Ravi Gaikwad.
* Date 24/09/2019
* Purpose: 4.Stopwatch the Elapsed time for every method call.
**/
package com.bridgelabz.algorithm;

import com.bridgelabz.utility.Utility;

public class SortingSearchingTime {
	public long startTimer = 0;
	public long stopTimer = 0;
	public long elapsed;
	public static int[] brr = new int[6];

	public void start() {
		// TODO Auto-generated method stub
		// startTimer stores the currnt time as a start time.
		startTimer = System.nanoTime();
	}

	private void stop() {
		// TODO Auto-generated method stub
		// startTimer stores the currnt time as a stop time.
		stopTimer = System.nanoTime();
	}

	// elapsedTime finds how much time require for this method to execute.
	private long elapsedTime() {
		elapsed = stopTimer - startTimer;
		return elapsed;
		// TODO Auto-generated method stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility u1 = new Utility();
		SortingSearchingTime sw = new SortingSearchingTime();

		// initilaize Integer array and String array.
		int arr[] = new int[] { 1, 8, 3, 7, 6, 5, 4, 2, 9 };
		String str[] = { "DDD", "FFF", "EEE", "GGG", "AAA", "CCC", "BBB" };

		// I. Binary search method for integer
		sw.start();// fun call start to store currnt time as start.
		u1.binarySearchInteger(arr);// function call for binary search integer
		sw.stop();// fun call start to store currnt time as stop.
		long binarySearchIntegerTime = sw.elapsedTime();
		brr[0] = (int) binarySearchIntegerTime;
		System.out.println("binarySearchInteger elapsed(in millisec)time : " + binarySearchIntegerTime);

		// II. Binary search method for string
		sw.start();// fun call start to store currnt time as start.
		u1.binarySearchString(str);// function call for binary search string
		sw.stop();// fun call start to store currnt time as stop.
		long binarySearchStringTime = sw.elapsedTime();
		brr[1] = (int) binarySearchStringTime;
		System.out.println("binarySearchString elapsed(in millisec)time : " + binarySearchStringTime);

		// III. InsertionSort method for integer
		sw.start();// fun call start to store currnt time as start.
		u1.insertionSortInteger(arr);// function call for insertion search integer
		sw.stop();// fun call start to store currnt time as stop.
		long InsertionSortIntegerTime = sw.elapsedTime();
		brr[2] = (int) InsertionSortIntegerTime;
		System.out.println("InsertionSortInteger elapsed(in millisec)time : " + InsertionSortIntegerTime);

		// IV. InsertionSort method for string
		sw.start();// fun call start to store currnt time as start.
		u1.insertionSortString(str);// function call for insertion search string.
		sw.stop();// fun call start to store currnt time as stop.
		long InsertionSortStringTime = sw.elapsedTime();
		brr[3] = (int) InsertionSortStringTime;
		System.out.println("insertionSortString elapsed(in millisec)time : " + InsertionSortStringTime);

		// V. BubbleSort method for integer
		sw.start();// fun call start to store currnt time as start.
		u1.bubbleSortInteger(arr);// function call for bubble search integer
		sw.stop();// fun call start to store currnt time as stop.
		long BubbleSortIntegerTime = sw.elapsedTime();
		brr[4] = (int) BubbleSortIntegerTime;
		System.out.println("bubbleSortInteger elapsed(in millisec)time : " + BubbleSortIntegerTime);

		// VI. BubbleSort method for string
		sw.start();// fun call start to store currnt time as start.
		u1.bubbleSortstring(str);// function call for bubble search string
		sw.stop();// fun call start to store currnt time as stop.
		long BubbleSortStringTime = sw.elapsedTime();
		brr[5] = (int) BubbleSortStringTime;
		System.out.println("bubbleSortstring elapsed(in millisec)time : " + BubbleSortStringTime);

		System.out.println("\nElapsed time for all sorted metode is:");
		for (int i = 0; i < brr.length; i++) {
			System.out.print(brr[i] + " ");
		}
		u1.bubbleSortIntegerDesending(brr); // Function call for desending order

		System.out.println("\nAll method sorting in order is:");
		for (int i = 0; i < brr.length; i++) {
			System.out.print(brr[i] + " ");
		}
	}
}
