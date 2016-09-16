package com.ecommerce.Entity;

public class Part {
	
	private int pa_sku_number;
	private String pa_part_number;
	private String pa_description;
	private int pa_vendor_number;
	private double pa_cost_amt;
	private double pa_price_amt;
	
	public Part(int pa_sku_number, String pa_part_number,
			String pa_description, int pa_vendor_number, double pa_cost_amt,
			double pa_price_amt) {
		this.pa_sku_number = pa_sku_number;
		this.pa_part_number = pa_part_number;
		this.pa_description = pa_description;
		this.pa_vendor_number = pa_vendor_number;
		this.pa_cost_amt = pa_cost_amt;
		this.pa_price_amt = pa_price_amt;
	}

	
	public Part() {
	}


	public int getPa_sku_number() {
		return pa_sku_number;
	}

	public void setPa_sku_number(int pa_sku_number) {
		this.pa_sku_number = pa_sku_number;
	}

	public String getPa_part_number() {
		return pa_part_number;
	}

	public void setPa_part_number(String pa_part_number) {
		this.pa_part_number = pa_part_number;
	}

	public String getPa_description() {
		return pa_description;
	}

	public void setPa_description(String pa_description) {
		this.pa_description = pa_description;
	}

	public int getPa_vendor_number() {
		return pa_vendor_number;
	}

	public void setPa_vendor_number(int pa_vendor_number) {
		this.pa_vendor_number = pa_vendor_number;
	}

	public double getPa_cost_amt() {
		return pa_cost_amt;
	}

	public void setPa_cost_amt(double pa_cost_amt) {
		this.pa_cost_amt = pa_cost_amt;
	}

	public double getPa_price_amt() {
		return pa_price_amt;
	}

	public void setPa_price_amt(double pa_price_amt) {
		this.pa_price_amt = pa_price_amt;
	}

	public String toString(){
		return this.pa_sku_number + "-" + this.pa_part_number + "-" + this.pa_description + "-" + this.pa_vendor_number + "-" + this.pa_cost_amt + "-" + this.pa_price_amt;
	}
	

}	
	
