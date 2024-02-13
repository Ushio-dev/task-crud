package com.franco.todoapp.exception;

public class NotFoundResponseException extends RuntimeException {
	public NotFoundResponseException(String message) {
		super(message);
	}
	
}
