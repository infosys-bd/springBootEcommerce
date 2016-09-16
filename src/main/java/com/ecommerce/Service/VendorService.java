package com.ecommerce.Service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.Dao.VendorDao;
import com.ecommerce.Entity.Vendor;

@Service
public class VendorService {

	@Autowired
	private VendorDao vendorDao;
	
	public Collection<Vendor> getAllVendors(){
		return vendorDao.getAllVendors();
	}

	public Vendor getVendorById(int id) {
		return vendorDao.getVendorById(id);
	}
	
	public void removeVendorById(int id){
		this.vendorDao.removeVendorById(id);
	}
	
}
