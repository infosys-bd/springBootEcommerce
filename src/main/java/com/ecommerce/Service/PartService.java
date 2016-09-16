package com.ecommerce.Service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.Dao.PartDao;
import com.ecommerce.Entity.Part;

@Service
public class PartService {
	
	@Autowired
	private PartDao partDao;
	
	public Collection<Part> getAllParts(){
		
		return this.partDao.getAllParts();
		
	}
	
	public Part getPartById(int id){
		return partDao.getPartById(id);
	}
	
	public void deletePartById(int id){
		this.partDao.deletePartById(id);
	}

	public void updatePart(Part part){
		this.partDao.updatePart(part);
	}

	public void insertPart(Part part) {
		this.partDao.insertPart(part);
		
	}
}
