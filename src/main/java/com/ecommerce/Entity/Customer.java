package com.ecommerce.Entity;

public class Customer {
	
	private int cu_customer_id;
	private String cu_first_name;
	private String cu_last_name;
	private String cu_address;
	private String cu_city;
	private String cu_state;
	private int cu_zip_code;
	private String cu_telephone;
	public Customer(int cu_customer_id, String cu_first_name,
			String cu_last_name, String cu_address, String cu_city,
			String cu_state, int cu_zip_code, String cu_telephone) {
		this.cu_customer_id = cu_customer_id;
		this.cu_first_name = cu_first_name;
		this.cu_last_name = cu_last_name;
		this.cu_address = cu_address;
		this.cu_city = cu_city;
		this.cu_state = cu_state;
		this.cu_zip_code = cu_zip_code;
		this.cu_telephone = cu_telephone;
	}
	
	public Customer() {
	}

	public int getCu_customer_id() {
		return cu_customer_id;
	}

	public void setCu_customer_id(int cu_customer_id) {
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

	public int getCu_zip_code() {
		return cu_zip_code;
	}

	public void setCu_zip_code(int cu_zip_code) {
		this.cu_zip_code = cu_zip_code;
	}

	public String getCu_telephone() {
		return cu_telephone;
	}

	public void setCu_telephone(String cu_telephone) {
		this.cu_telephone = cu_telephone;
	}
	
	
}
