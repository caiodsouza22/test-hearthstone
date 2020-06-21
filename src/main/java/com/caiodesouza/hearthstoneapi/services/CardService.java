package com.caiodesouza.hearthstoneapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caiodesouza.hearthstoneapi.entities.Card;
import com.caiodesouza.hearthstoneapi.entities.enums.CardClass;
import com.caiodesouza.hearthstoneapi.entities.enums.CardType;
import com.caiodesouza.hearthstoneapi.repositories.CardRepository;
import com.caiodesouza.hearthstoneapi.services.exceptions.ResourceNotFoundExceptionClass;
import com.caiodesouza.hearthstoneapi.services.exceptions.ResourceNotFoundExceptionId;
import com.caiodesouza.hearthstoneapi.services.exceptions.ResourceNotFoundExceptionName;
import com.caiodesouza.hearthstoneapi.services.exceptions.ResourceNotFoundExceptionType;

@Service
public class CardService {

	@Autowired
	private CardRepository repository;
	
	public List<Card> findAll(){
		return repository.findAll();
	}
	
	public Card findById(Integer id) {
		Optional<Card> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundExceptionId(id));
	}
	

	public Card findByName(String name) {
		Optional<Card> obj = repository.findByName(name);
		return obj.orElseThrow(() -> new ResourceNotFoundExceptionName(name));
		
	}
	
	public Card findByCardClass(CardClass cardClass) {
		Optional<Card> obj = repository.findByCardClass(cardClass);
		return obj.orElseThrow(() -> new ResourceNotFoundExceptionClass(cardClass));
		
	}
	
	public Card findByCardType(CardType cardType) {
		Optional<Card> obj = repository.findByCardType(cardType);
		return obj.orElseThrow(() -> new ResourceNotFoundExceptionType(cardType));

		
	}
	
	public Card insert(Card obj) {
		return repository.save(obj);
	}
	
	public void delete(Integer id) {
		repository.deleteById(id);
	}
}


