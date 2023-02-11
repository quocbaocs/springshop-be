package com.quocbao.springshop.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class CategoryException extends RuntimeException {

	
	private static final long serialVersionUID = 7365424270329368722L;

	public CategoryException(String message) {
		super(message);

	}

}
