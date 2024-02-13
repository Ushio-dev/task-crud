package com.franco.todoapp.exception;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ApiExceptionHandler {
	
	@ExceptionHandler(value = {ApiRequestException.class})
	public ResponseEntity<Object> handleApiRequestException(ApiRequestException e) {
		// 1, Create payload cntaing exception details
		HttpStatus badRequest = HttpStatus.BAD_REQUEST;
		ApiException apiException =  new ApiException(e.getMessage(), e, HttpStatus.BAD_REQUEST, ZonedDateTime.now(ZoneId.of("Z")));
		// 2. Return response entity
		return new ResponseEntity<Object>(apiException, badRequest);
	}
	
	@ExceptionHandler(value = {NotFoundResponseException.class})
	public ResponseEntity<Object> handleNotFoundException(NotFoundResponseException e) {
		HttpStatus notFound = HttpStatus.NOT_FOUND;
		NotFoundException notFoundException = new NotFoundException(e.getMessage(), notFound);
		
		return new ResponseEntity<Object>(notFoundException, notFound);
	}
}
