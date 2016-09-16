package com.ecommerce.dao;

import java.util.Collection;

import com.ecommerce.Entity.Vendor;

public interface VendorDao {
	Collection<Vendor> getAllVendors();
	Vendor getVendorById(int id);
	void removeVendorById(int id);
}
