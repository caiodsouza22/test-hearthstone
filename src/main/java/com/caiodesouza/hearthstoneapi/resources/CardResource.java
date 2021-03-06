package com.caiodesouza.hearthstoneapi.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.caiodesouza.hearthstoneapi.entities.Card;
import com.caiodesouza.hearthstoneapi.entities.enums.CardClass;
import com.caiodesouza.hearthstoneapi.entities.enums.CardType;
import com.caiodesouza.hearthstoneapi.services.CardService;

@RestController
@RequestMapping(value= "/cards")
public class CardResource {
	
	@Autowired
	private CardService service;
	
	@GetMapping
	public ResponseEntity<List<Card>> findAll(){
		List<Card> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/id={id}")
	public ResponseEntity<Card> findById(@PathVariable Integer id) {
		Card obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
		}
	
	@GetMapping(value = "/name={name}")
	public ResponseEntity<Card> findByName(@PathVariable String name){
		Card obj = service.findByName(name);
		return ResponseEntity.ok().body(obj);
	}
	
	@GetMapping(value = "/type={cardType}")
	public ResponseEntity<Card> findByType(@PathVariable CardType cardType){
		Card obj = service.findByCardType(cardType);
		return ResponseEntity.ok().body(obj);
	}
	

	@GetMapping(value = "/class={cardClass}")
	public ResponseEntity<Card> findByClass(@PathVariable CardClass cardClass){
		Card obj = service.findByCardClass(cardClass);
		return ResponseEntity.ok().body(obj);
	}
	
	@PostMapping
	public ResponseEntity<Card> insert(@RequestBody Card obj) {
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/id={id}")
				.buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).body(obj);
	}
	
	@DeleteMapping(value= "/id={id}")
	public ResponseEntity<Void> delete(@PathVariable Integer id) {
		service.delete(id);
		return ResponseEntity.noContent().build();
		
	}
	
	
}

