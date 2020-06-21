package com.caiodesouza.hearthstoneapi.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caiodesouza.hearthstoneapi.entities.Card;
import com.caiodesouza.hearthstoneapi.entities.enums.CardClass;
import com.caiodesouza.hearthstoneapi.entities.enums.CardType;

public interface CardRepository extends JpaRepository<Card, Integer> {
	
	Optional<Card> findByName(String name);

	Optional<Card> findByCardType(CardType cardType);
	
	Optional<Card> findByCardClass(CardClass cardClass);
}
