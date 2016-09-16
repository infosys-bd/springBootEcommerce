package com.ecommerce.Controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.Entity.Sale;
import com.ecommerce.Service.SaleService;

@RestController
@RequestMapping(value="/sales")
public class SaleController {
	
	@Autowired
	private SaleService saleService;
	
	@RequestMapping(method= RequestMethod.GET)
	public Collection<Sale> getAllSales(){
		return saleService.getAllSales();
	}
}
