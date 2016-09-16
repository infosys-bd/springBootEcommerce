package com.ecommerce.dao.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.ecommerce.Entity.Sale;
import com.ecommerce.dao.SaleDao;

@Repository
public class SaleDaoImpl extends BaseDaoImpl implements SaleDao{

//	private static Map<Integer, Sale> sales;
//	
//	static{
//		sales = new HashMap<Integer, Sale>(){
//			{
//				put(1,new Sale(567,123,3, 768,3.62));
//				put(2,new Sale(601,123,21, 792,3.62));
//				put(3,new Sale(603,125,21, 702,3.82));
//			}
//		};
//	}
	
	public Collection<Sale> getAllSales(){
//		return sales.values();
		return null;
	}
}
