package com.quocbao.springshop.exception;

public class CategoryExceptionResponse {
	private String message;

	public CategoryExceptionResponse(String message) {
		this.message = message;

	}

	public CategoryExceptionResponse() {
		super();
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
