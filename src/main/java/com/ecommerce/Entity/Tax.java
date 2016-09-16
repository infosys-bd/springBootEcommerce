package com.ecommerce.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Tax")
public class Tax {

	@Id
	@Column(name="ta_state_code")
	private String ta_state_code;
	
	@Column(name="ta_category")
	private String ta_category;
	
	@Column
	private Double ta_tax_pct;
	
	
	public Tax() {
	}


	public String getTa_state_code() {
		return ta_state_code;
	}


	public void setTa_state_code(String ta_state_code) {
		this.ta_state_code = ta_state_code;
	}


	public String getTa_category() {
		return ta_category;
	}


	public void setTa_category(String ta_category) {
		this.ta_category = ta_category;
	}


	public Double getTa_tax_pct() {
		return ta_tax_pct;
	}


	public void setTa_tax_pct(Double ta_tax_pct) {
		this.ta_tax_pct = ta_tax_pct;
	}
	
	
	
}
