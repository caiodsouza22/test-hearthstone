package com.caiodesouza.hearthstoneapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caiodesouza.hearthstoneapi.entities.Card;
import com.caiodesouza.hearthstoneapi.repositories.CardRepository;

@Service
public class CardService {

	@Autowired
	private CardRepository repository;
	
	public List<Card> findAll(){
		return repository.findAll();
	}
	
	public Card findById(Integer id) {
		Optional<Card> obj = repository.findById(id);
		return obj.get();
	}
}


