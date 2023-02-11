package com.quocbao.springshop.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "category")
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name", nullable = false, length = 100)
	private String name;

	@Enumerated
	@Column(name = "status", nullable = false)
	private CategoryStatus status;

	public Category() {

	}

	public Category(Long id, String name, CategoryStatus status) {

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
