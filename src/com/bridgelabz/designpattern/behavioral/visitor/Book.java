package com.bridgelabz.designpattern.behavioral.visitor;

public class Book implements ItemElement {

	private int price;
	private String isbnNumber;
	
	// Parameterized Constructor.
	public Book(int cost, String isbn){
		this.price=cost;
		this.isbnNumber=isbn;
	}
	
	// Getter method.
	public int getPrice() {
		return price;
	}

	// Getter method.
	public String getIsbnNumber() {
		return isbnNumber;
	}

	@Override
	public int accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}

}