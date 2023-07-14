package com.devSuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devSuperior.dslist.entities.GameList;


public interface GameListRepository extends JpaRepository<GameList, Long> {
    
}