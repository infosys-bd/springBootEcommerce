package com.ecommerce.Service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.Entity.Sale;
import com.ecommerce.dao.impl.SaleDaoImpl;

@Service
public class SaleService {

	@Autowired
	private SaleDaoImpl saleDao;
	
	public Collection<Sale> getAllSales(){
		return saleDao.getAllSales();
	}
}
