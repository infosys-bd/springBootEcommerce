package com.ecommerce.Entity;

public class Tax {

	private String ta_state_code;
	private double ta_tax_pct;
	
	public Tax(String ta_state_code, double ta_tax_pct) {
		this.ta_state_code = ta_state_code;
		this.ta_tax_pct = ta_tax_pct;
	}
	public Tax() {
	}
	
	public String getTa_state_code() {
		return ta_state_code;
	}
	
	public void setTa_state_code(String ta_state_code) {
		this.ta_state_code = ta_state_code;
	}
	
	public double getTa_tax_pct() {
		return ta_tax_pct;
	}
	
	public void setTa_tax_pct(double ta_tax_pct) {
		this.ta_tax_pct = ta_tax_pct;
	}
	
	
}
