package com.ecommerce.dao.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.ecommerce.Entity.Part;
import com.ecommerce.dao.PartDao;

@Repository
public class PartDaoImpl extends BaseDaoImpl implements PartDao{

//	private static Map<Integer, Part> parts;
//	
//	static{
//		
//		parts = new HashMap<Integer, Part>(){
//			{
//				put(123, new Part(123,"AZ123","Spark Plug",612368,2.53, 3.62));
//				put(124, new Part(124,"AZ124","Spark Plug2",663823,2.72, 2.91));
//				put(125, new Part(125,"AZ125","Spark Plug3",683728,3.01, 3.82));
//			}
//		};
//	}
	
	public Collection<Part> getAllParts(){
		
//		return parts.values();
		getCurrentSession().get(Part.class, null);
		return null;
	}
	
	public Part getPartById(int id){
//		return this.parts.get(id);
		getCurrentSession().get(Part.class, id);
		return null;
	}
	
	public void deletePartById(int id){
//		this.parts.remove(id);
	}
	
	public void updatePart(Part part){
		
//		Part p = parts.get(part.getPa_sku_number());
//		
//		p.setPa_part_number(part.getPa_part_number());
//		p.setPa_description(part.getPa_description());
//		p.setPa_vendor_number(part.getPa_vendor_number());
//		p.setPa_cost_amt(part.getPa_cost_amt());
//		p.setPa_price_amt(part.getPa_price_amt());
//		
//		parts.put(part.getPa_sku_number(), p);
	}

	public void insertPart(Part part) {
//		parts.put(part.getPa_sku_number(), part);
		
	}
	
}
