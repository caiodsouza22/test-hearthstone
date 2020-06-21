package com.caiodesouza.hearthstoneapi.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.caiodesouza.hearthstoneapi.entities.Card;
import com.caiodesouza.hearthstoneapi.entities.enums.CardClass;
import com.caiodesouza.hearthstoneapi.entities.enums.CardType;

@RestController
@RequestMapping(value= "/cards")
public class CardResource {
	
	@GetMapping
	public ResponseEntity<Card> findAll(){
		Card c = new Card(1,"dragao","this card does something",7,9,CardType.Any,CardClass.Creature);
		return ResponseEntity.ok().body(c);
	}

}
