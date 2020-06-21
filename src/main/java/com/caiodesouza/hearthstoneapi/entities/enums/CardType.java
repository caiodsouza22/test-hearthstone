package com.caiodesouza.hearthstoneapi.entities.enums;

public enum CardType {

	Magic(1),
	Creature(2);
	
	
	private int code;
	
	private CardType(int code) {
		this.code = code;
	}
	
	
	public int getCode() {
		return code;
	}
	
	public static CardType valueOf(int code) {
		for (CardType value : CardType.values()) {
			if (value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid CardType code");
	}
}
