package com.bridgelabz.designpattern.factory;

public class TestFactory {
	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer("PC", "2 GB", "500 Gb", "2.4 GHZ");
		Computer server = ComputerFactory.getComputer("Server", "16 GB", "1 TB", "2.9 GHZ");
		System.out.println("Factory PC Config::" + pc);
		System.out.println("Factory Server Config::" + server);
	}
}
