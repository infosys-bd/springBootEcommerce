package com.ecommerce.dao.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.ecommerce.Entity.Vendor;
import com.ecommerce.dao.VendorDao;

@Repository
public class VendorDaoImpl extends BaseDaoImpl implements VendorDao{
	
//	private static Map<Integer, Vendor> vendors;
//	
//	static {
//		vendors = new HashMap<Integer, Vendor>(){
//			{
//				put(1,new Vendor(612368,"AC Delco", "Calle del Arbol Seco","Lyon","TX", 69000,"(33) 68-23-43-23"));
//				put(2,new Vendor(663823,"NGK", "Villa Verder 9734","Chihuahua","GA", 38456,"(828) 882-563-123"));
//				put(3,new Vendor(683728,"Bosh", "1101 Natchez Point","Memphis","TN", 38103,"(901) 123-456-789"));
//				
//			}
//		};
//	}
	
	public Collection<Vendor> getAllVendors(){
//		return this.vendors.values();
		return null;
	}

	public Vendor getVendorById(int id) {
//		return this.vendors.get(id);
		return null;
	}
	
	public void removeVendorById(int id){
//		this.vendors.remove(id);
	}
	
}
