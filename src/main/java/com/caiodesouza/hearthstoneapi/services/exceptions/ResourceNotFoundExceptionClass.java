package com.caiodesouza.hearthstoneapi.services.exceptions;

public class ResourceNotFoundExceptionClass extends RuntimeException{


	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundExceptionClass(Object cardClass) {
		super("Resource not found. CardClass: " + cardClass);
	}

}
