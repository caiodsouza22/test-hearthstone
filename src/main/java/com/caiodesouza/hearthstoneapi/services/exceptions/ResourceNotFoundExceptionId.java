package com.caiodesouza.hearthstoneapi.services.exceptions;

public class ResourceNotFoundExceptionId extends RuntimeException{


	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundExceptionId(Object id) {
		super("Resource not found. Id: " + id);
	}

}
