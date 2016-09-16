package com.ecommerce.Entity;

public class Sale {
	
	private int sa_invoice_number;
	private int sa_sku_number;
	private int sa_quantity_sold;
	private int sa_customer_id;
	private double sa_price_amount;
	//private double sa_tax_amount;
	
	public Sale(int sa_invoice_number, int sa_sku_number, int sa_quantity_sold,
			int sa_customer_id, double sa_price_amount) {
		
		this.sa_invoice_number = sa_invoice_number;
		this.sa_sku_number = sa_sku_number;
		this.sa_quantity_sold = sa_quantity_sold;
		this.sa_customer_id = sa_customer_id;
		this.sa_price_amount = sa_price_amount;
		//this.sa_tax_amount = sa_tax_amount;
	}
	public Sale() {
	}
	public int getSa_invoice_number() {
		return sa_invoice_number;
	}
	public void setSa_invoice_number(int sa_invoice_number) {
		this.sa_invoice_number = sa_invoice_number;
	}
	public int getSa_sku_number() {
		return sa_sku_number;
	}
	public void setSa_sku_number(int sa_sku_number) {
		this.sa_sku_number = sa_sku_number;
	}
	public int getSa_quantity_sold() {
		return sa_quantity_sold;
	}
	public void setSa_quantity_sold(int sa_quantity_sold) {
		this.sa_quantity_sold = sa_quantity_sold;
	}
	public int getSa_customer_id() {
		return sa_customer_id;
	}
	public void setSa_customer_id(int sa_customer_id) {
		this.sa_customer_id = sa_customer_id;
	}
	public double getSa_price_amount() {
		return sa_price_amount;
	}
	public void setSa_price_amount(double sa_price_amount) {
		this.sa_price_amount = sa_price_amount;
	}
	
	
	public double total_sale(){
		return this.sa_quantity_sold * this.sa_price_amount;
	}
}
