package com.bridgelabz.designpattern.structural.facade;

public class FacadePatterDemo {

	public static void main(String[] args) {

		ShapeMaker shapeMaker = new ShapeMaker(); // Create object of ShapeMaker class.

		shapeMaker.drawCircle(); // Fun call to Circle class.
		shapeMaker.drawRectangle(); // Fun call to Rectangle class.
		shapeMaker.drawSquare(); // Fun call to Square class.
	}
}
