package com.caiodesouza.hearthstoneapi.services.exceptions;

public class ResourceNotFoundExceptionName extends RuntimeException{


	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundExceptionName(Object name) {
		super("Resource not found. Name: " + name);
	}

}
