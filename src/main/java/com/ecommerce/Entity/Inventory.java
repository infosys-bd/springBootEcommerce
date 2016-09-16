package com.ecommerce.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Inventory")
public class Inventory {

	@Id
	@Column(name = "in_sku_number")
	private Integer in_sku_number;
	
	@Column
	private String in_location;
	
	@Column
	private Integer in_quantity_on_hand;
	
	
	public Inventory() {
	}


	public Integer getIn_sku_number() {
		return in_sku_number;
	}


	public void setIn_sku_number(Integer in_sku_number) {
		this.in_sku_number = in_sku_number;
	}


	public String getIn_location() {
		return in_location;
	}


	public void setIn_location(String in_location) {
		this.in_location = in_location;
	}


	public Integer getIn_quantity_on_hand() {
		return in_quantity_on_hand;
	}


	public void setIn_quantity_on_hand(Integer in_quantity_on_hand) {
		this.in_quantity_on_hand = in_quantity_on_hand;
	}

	
	
	
}
