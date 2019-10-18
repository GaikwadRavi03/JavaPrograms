package com.bridgelabz.designpattern.behavioral.visitor;

public class Fruit implements ItemElement {

	private int pricePerKg;
	private int weight;
	private String name;

	// Parameterized Constructor.
	public Fruit(int priceKg, int wt, String nm) {
		this.pricePerKg = priceKg;
		this.weight = wt;
		this.name = nm;
	}

	// Getter method.
	public int getPricePerKg() {
		return pricePerKg;
	}

	// Getter method.
	public int getWeight() {
		return weight;
	}

	public String getName() {
		return this.name;
	}

	@Override
	public int accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}

}
