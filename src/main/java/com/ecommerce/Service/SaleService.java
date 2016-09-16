package com.ecommerce.Service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.Dao.SaleDao;
import com.ecommerce.Entity.Sale;

@Service
public class SaleService {

	@Autowired
	private SaleDao saleDao;
	
	public Collection<Sale> getAllSales(){
		return saleDao.getAllSales();
	}
}
