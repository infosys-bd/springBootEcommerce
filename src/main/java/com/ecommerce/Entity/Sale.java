package com.ecommerce.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Sale")
public class Sale {
	
	@Id
	@Column(name="sa_invoice_number")
	private Integer sa_invoice_number;

	@Column
	private Integer sa_sku_number;
	
	@Column
	private Integer sa_quantity_sold;
	
	@Column
	private Integer sa_customer_id;
	
	@Column
	private Double sa_price_amount;
	
	@Column
	private Tax tax;
	
	public Sale() {
	}
	
	
	
	public double total_sale(){
		return this.sa_quantity_sold * this.sa_price_amount;
	}

	public Integer getSa_invoice_number() {
		return sa_invoice_number;
	}

	public void setSa_invoice_number(Integer sa_invoice_number) {
		this.sa_invoice_number = sa_invoice_number;
	}

	public Integer getSa_sku_number() {
		return sa_sku_number;
	}

	public void setSa_sku_number(Integer sa_sku_number) {
		this.sa_sku_number = sa_sku_number;
	}

	public Integer getSa_quantity_sold() {
		return sa_quantity_sold;
	}


	public void setSa_quantity_sold(Integer sa_quantity_sold) {
		this.sa_quantity_sold = sa_quantity_sold;
	}

	public Integer getSa_customer_id() {
		return sa_customer_id;
	}

	public void setSa_customer_id(Integer sa_customer_id) {
		this.sa_customer_id = sa_customer_id;
	}

	public Double getSa_price_amount() {
		return sa_price_amount;
	}

	public void setSa_price_amount(Double sa_price_amount) {
		this.sa_price_amount = sa_price_amount;
	}

	public Tax getTax() {
		return tax;
	}

	public void setTax(Tax tax) {
		this.tax = tax;
	}
	
}
