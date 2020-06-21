package com.caiodesouza.hearthstoneapi.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.caiodesouza.hearthstoneapi.entities.Card;
import com.caiodesouza.hearthstoneapi.repositories.CardRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private CardRepository cardRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Card c1 = new Card(null,"white dragon","do something",10,6);
		Card c2 = new Card(null,"monster","do something",6,9);
		
		cardRepository.saveAll(Arrays.asList(c1,c2));
		
	}
	

	
	
}
