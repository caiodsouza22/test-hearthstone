package com.caiodesouza.hearthstoneapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caiodesouza.hearthstoneapi.entities.Card;

public interface CardRepository extends JpaRepository<Card, Integer> {

}
