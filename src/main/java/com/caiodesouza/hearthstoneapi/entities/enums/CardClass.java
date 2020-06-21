package com.caiodesouza.hearthstoneapi.entities.enums;

public enum CardClass {
	
	Mage(1),
	Paladin(2),
	Hunter(3),
	Druid(4),
	Any(5);
	
	
	private int code;
	
	private CardClass(int code) {
		this.code = code;
	}
	
	
	public int getCode() {
		return code;
	}
	
	public static CardClass valueOf(int code) {
		for (CardClass value : CardClass.values()) {
			if (value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid CardClass code");
	}
}