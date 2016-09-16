package com.ecommerce.dao;

import java.util.Collection;

import com.ecommerce.Entity.Part;

public interface PartDao {

	Collection<Part> getAllParts();
	Part getPartById(int id);
	void deletePartById(int id);
	void updatePart(Part part);
	void insertPart(Part part);
}
