package com.caiodesouza.hearthstoneapi.resources.exceptions;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.caiodesouza.hearthstoneapi.services.exceptions.ResourceNotFoundExceptionClass;
import com.caiodesouza.hearthstoneapi.services.exceptions.ResourceNotFoundExceptionId;
import com.caiodesouza.hearthstoneapi.services.exceptions.ResourceNotFoundExceptionName;
import com.caiodesouza.hearthstoneapi.services.exceptions.ResourceNotFoundExceptionType;

@ControllerAdvice
public class ResourceExceptionsHandler {
	
	@ExceptionHandler(ResourceNotFoundExceptionId.class)
	public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundExceptionId e, HttpServletRequest request) {
		String error = "Resource not found";	
		HttpStatus status = HttpStatus.NOT_FOUND;
		StandardError err = new StandardError(Instant.now(),status.value(), error,e.getMessage(), request.getRequestURI());
	    return ResponseEntity.status(status).body(err);
	}
	
	@ExceptionHandler(ResourceNotFoundExceptionName.class)
	public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundExceptionName e, HttpServletRequest request) {
		String error = "Resource not found";	
		HttpStatus status = HttpStatus.NOT_FOUND;
		StandardError err = new StandardError(Instant.now(),status.value(), error,e.getMessage(), request.getRequestURI());
	    return ResponseEntity.status(status).body(err);
	}
	
	@ExceptionHandler(ResourceNotFoundExceptionClass.class)
	public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundExceptionClass e, HttpServletRequest request) {
		String error = "Resource not found";	
		HttpStatus status = HttpStatus.NOT_FOUND;
		StandardError err = new StandardError(Instant.now(),status.value(), error,e.getMessage(), request.getRequestURI());
	    return ResponseEntity.status(status).body(err);
	}
	
	@ExceptionHandler(ResourceNotFoundExceptionType.class)
	public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundExceptionType e, HttpServletRequest request) {
		String error = "Resource not found";	
		HttpStatus status = HttpStatus.NOT_FOUND;
		StandardError err = new StandardError(Instant.now(),status.value(), error,e.getMessage(), request.getRequestURI());
	    return ResponseEntity.status(status).body(err);
	}
}
