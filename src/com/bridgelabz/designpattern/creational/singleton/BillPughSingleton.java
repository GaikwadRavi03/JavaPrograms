package com.bridgelabz.designpattern.creational.singleton;

public class BillPughSingleton {

	private BillPughSingleton() {
	}

	private static class SingletonHelper {
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}

	// Inner static class contains instance of singleton class.
	public static BillPughSingleton getInstance() {
		return SingletonHelper.INSTANCE;
	}
}
