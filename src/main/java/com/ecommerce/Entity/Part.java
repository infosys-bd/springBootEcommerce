package com.ecommerce.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Part")
public class Part {
	
	
	@Id
	@Column
	private Integer pa_sku_number;
	
	@Column
	private String pa_part_number;
	
	@Column
	private String pa_category;
	
	@Column
	private String pa_description;
	
	@Column
	private Integer pa_vendor_number;
	
	@Column
	private Double pa_cost_amt;
	
	@Column
	private Double pa_price_amt;
	
	
	
	public Part() {
	}



	public Integer getPa_sku_number() {
		return pa_sku_number;
	}



	public void setPa_sku_number(Integer pa_sku_number) {
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



	public Integer getPa_vendor_number() {
		return pa_vendor_number;
	}



	public void setPa_vendor_number(Integer pa_vendor_number) {
		this.pa_vendor_number = pa_vendor_number;
	}



	public Double getPa_cost_amt() {
		return pa_cost_amt;
	}



	public void setPa_cost_amt(Double pa_cost_amt) {
		this.pa_cost_amt = pa_cost_amt;
	}



	public Double getPa_price_amt() {
		return pa_price_amt;
	}



	public void setPa_price_amt(Double pa_price_amt) {
		this.pa_price_amt = pa_price_amt;
	}



	public String toString(){
		return this.pa_sku_number + "-" + this.pa_part_number + "-" + this.pa_description + "-" + this.pa_vendor_number + "-" + this.pa_cost_amt + "-" + this.pa_price_amt;
	}
	

}	
	
