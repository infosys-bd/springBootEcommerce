package com.ecommerce.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Customer")
public class Customer {
	
	@Id
	@Column(name = "cu_customer_id")
	private Integer cu_customer_id;
	
	@Column
	private String cu_first_name;
	
	@Column
	private String cu_last_name;
	
	@Column
	private String cu_address;
	
	@Column
	private String cu_city;
	
	@Column
	private String cu_state;
	
	@Column
	private Integer cu_zip_code;
	
	@Column
	private String cu_telephone;
	
		
	public Customer() {
	}


	public Integer getCu_customer_id() {
		return cu_customer_id;
	}


	public void setCu_customer_id(Integer cu_customer_id) {
		this.cu_customer_id = cu_customer_id;
	}


	public String getCu_first_name() {
		return cu_first_name;
	}


	public void setCu_first_name(String cu_first_name) {
		this.cu_first_name = cu_first_name;
	}


	public String getCu_last_name() {
		return cu_last_name;
	}


	public void setCu_last_name(String cu_last_name) {
		this.cu_last_name = cu_last_name;
	}


	public String getCu_address() {
		return cu_address;
	}


	public void setCu_address(String cu_address) {
		this.cu_address = cu_address;
	}


	public String getCu_city() {
		return cu_city;
	}


	public void setCu_city(String cu_city) {
		this.cu_city = cu_city;
	}


	public String getCu_state() {
		return cu_state;
	}


	public void setCu_state(String cu_state) {
		this.cu_state = cu_state;
	}


	public Integer getCu_zip_code() {
		return cu_zip_code;
	}


	public void setCu_zip_code(Integer cu_zip_code) {
		this.cu_zip_code = cu_zip_code;
	}


	public String getCu_telephone() {
		return cu_telephone;
	}


	public void setCu_telephone(String cu_telephone) {
		this.cu_telephone = cu_telephone;
	}

	
	
	
}
