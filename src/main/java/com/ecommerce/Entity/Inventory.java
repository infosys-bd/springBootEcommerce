package com.ecommerce.Entity;

public class Inventory {

	private int in_sku_number;
	private String in_location;
	private int in_quantity_on_hand;
	
	public Inventory(int in_sku_number, String in_location,
			int in_quantity_on_hand) {
		this.in_sku_number = in_sku_number;
		this.in_location = in_location;
		this.in_quantity_on_hand = in_quantity_on_hand;
	}

	public Inventory() {
	}

	public int getIn_sku_number() {
		return in_sku_number;
	}

	public void setIn_sku_number(int in_sku_number) {
		this.in_sku_number = in_sku_number;
	}

	public String getIn_location() {
		return in_location;
	}

	public void setIn_location(String in_location) {
		this.in_location = in_location;
	}

	public int getIn_quantity_on_hand() {
		return in_quantity_on_hand;
	}

	public void setIn_quantity_on_hand(int in_quantity_on_hand) {
		this.in_quantity_on_hand = in_quantity_on_hand;
	}
	
	
	
}
