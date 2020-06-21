package com.caiodesouza.hearthstoneapi.entities;

import java.io.Serializable;

public class Card implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	private Integer id;
	private String name;
	private String description;
	private Integer attack;
	private Integer defense;
	
	public Card() {
		
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getAttack() {
		return attack;
	}

	public void setAttack(Integer attack) {
		this.attack = attack;
	}

	public Integer getDefense() {
		return defense;
	}

	public void setDefense(Integer defense) {
		this.defense = defense;
	}

	public Card(Integer id, String name, String description, Integer attack, Integer defense) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.attack = attack;
		this.defense = defense;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}

