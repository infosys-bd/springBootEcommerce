package com.ecommerce.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Vendor")
public class Vendor {
	
	@Id
	@Column(name="ve_vendor_number")
	private Integer ve_vendor_number;
	
	@Column
	private String ve_vendor_name;
	
	@Column
	private String ve_address;
	
	@Column
	private String ve_city;
	
	@Column
	private String ve_state;
	
	@Column
	private Integer ve_zip_code;
	
	@Column
	private String ve_telephone;
	
	
	public Vendor() {
	}


	public Integer getVe_vendor_number() {
		return ve_vendor_number;
	}


	public void setVe_vendor_number(Integer ve_vendor_number) {
		this.ve_vendor_number = ve_vendor_number;
	}


	public String getVe_vendor_name() {
		return ve_vendor_name;
	}


	public void setVe_vendor_name(String ve_vendor_name) {
		this.ve_vendor_name = ve_vendor_name;
	}


	public String getVe_address() {
		return ve_address;
	}


	public void setVe_address(String ve_address) {
		this.ve_address = ve_address;
	}


	public String getVe_city() {
		return ve_city;
	}


	public void setVe_city(String ve_city) {
		this.ve_city = ve_city;
	}


	public String getVe_state() {
		return ve_state;
	}


	public void setVe_state(String ve_state) {
		this.ve_state = ve_state;
	}


	public Integer getVe_zip_code() {
		return ve_zip_code;
	}


	public void setVe_zip_code(Integer ve_zip_code) {
		this.ve_zip_code = ve_zip_code;
	}


	public String getVe_telephone() {
		return ve_telephone;
	}


	public void setVe_telephone(String ve_telephone) {
		this.ve_telephone = ve_telephone;
	}

	

}


