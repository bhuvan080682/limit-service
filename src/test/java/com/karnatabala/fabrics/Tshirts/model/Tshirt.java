package com.karnatabala.fabrics.Tshirts.model;

public class Tshirt {
	private String color;
	private String size;
	private int quantity;
	
	
	public Tshirt(String color, String size, int quantity) {
		super();
		this.color = color;
		this.size = size;
		this.quantity = quantity;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
