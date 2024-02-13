package com.franco.todoapp.exception;

import org.springframework.http.HttpStatus;

public class NotFoundException {
	private final String message;
	private final HttpStatus httpStatus;
	
	public NotFoundException(String message, HttpStatus httpStatus) {
		super();
		this.message = message;
		this.httpStatus = httpStatus;
	}
	public String getMessage() {
		return message;
	}
	public HttpStatus getHttpStatus() {
		return httpStatus;
	}
	
	
}
