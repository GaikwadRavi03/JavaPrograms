package com.bridgelabz.oops;

public class InventoryFactory {

	private String type;
	private String name;
	private int weight;
	private int price;

	public InventoryFactory() {
	}

	public InventoryFactory(String type, String name, int weight, int price) {
		super();
		this.type = type;
		this.name = name;
		this.weight = weight;
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int prize) {
		this.price = prize;
	}

}
