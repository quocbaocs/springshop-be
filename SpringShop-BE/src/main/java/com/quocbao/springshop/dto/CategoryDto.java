package com.quocbao.springshop.dto;

import java.io.Serializable;

import com.quocbao.springshop.model.CategoryStatus;

import jakarta.validation.constraints.NotEmpty;


public class CategoryDto implements Serializable{
	private  Long id;
	
	@NotEmpty(message = "Category name is required")
	private  String name;
	private  CategoryStatus status;
	
	
	
	public CategoryDto() {
		
	}
	public CategoryDto(Long id, String name, CategoryStatus status) {
		
		this.id = id;
		this.name = name;
		this.status = status;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public CategoryStatus getStatus() {
		return status;
	}
	public void setStatus(CategoryStatus status) {
		this.status = status;
	}
	
	

}
