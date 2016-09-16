package com.ecommerce.Controller;

import java.util.Collection;

import org.apache.tomcat.util.http.parser.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.Entity.Part;
import com.ecommerce.Service.PartService;

@RestController
@RequestMapping(value="/parts")
public class PartController {
	
	@Autowired
	private PartService partService;

	@RequestMapping(method= RequestMethod.GET)
	public Collection<Part> getAllParts(){
		return this.partService.getAllParts();
	}
	
	@RequestMapping(value ="/{id}", method = RequestMethod.GET)
	public Part getPartById(@PathVariable("id") int id){
		return partService.getPartById(id);
	}
	
	@RequestMapping(value ="/{id}", method = RequestMethod.DELETE)
	public void deletePartById(@PathVariable("id") int id){
		this.partService.deletePartById(id);
	}
	
	@RequestMapping(method = RequestMethod.PUT, consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public void updatePart(@RequestBody Part part){
		this.partService.updatePart(part);
	}
	
	@RequestMapping(method = RequestMethod.POST, consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public void insertPart(@RequestBody Part part){
		this.partService.insertPart(part);
	}
	
}
