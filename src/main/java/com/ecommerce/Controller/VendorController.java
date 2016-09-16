package com.ecommerce.Controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.Entity.Part;
import com.ecommerce.Entity.Vendor;
import com.ecommerce.Service.VendorService;

@RestController
@RequestMapping(value="/vendors")
public class VendorController {

	@Autowired
	private VendorService vendorService;
	
	@RequestMapping(method=RequestMethod.GET)
	public Collection<Vendor> getAllVendors(){
		return vendorService.getAllVendors();
	}
	
	@RequestMapping(value ="/{id}", method=RequestMethod.GET)
	public Vendor getVendorById(@PathVariable("id") int id){
		return vendorService.getVendorById(id);
	}
	
	@RequestMapping(value="/{id}", method= RequestMethod.DELETE)
	public void removeVendorById(@PathVariable("id") int id){
		this.vendorService.removeVendorById(id);
	}
	
	
}
