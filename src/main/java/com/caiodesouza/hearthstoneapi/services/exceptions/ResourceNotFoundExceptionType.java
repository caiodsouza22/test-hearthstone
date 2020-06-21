package com.caiodesouza.hearthstoneapi.services.exceptions;

public class ResourceNotFoundExceptionType extends RuntimeException{


	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundExceptionType(Object cardType) {
		super("Resource not found. CardType : " + cardType);
	}

}
