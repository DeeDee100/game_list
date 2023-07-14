package com.devSuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devSuperior.dslist.dto.GameDTO;
import com.devSuperior.dslist.dto.GameMinDTO;
import com.devSuperior.dslist.entities.Game;
import com.devSuperior.dslist.repositories.GameRepository;

@Service
public class GameService {
    
    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();

        return dto;
    }

    @Transactional(readOnly = true)
    public GameDTO findByID(Long id){
        Game result = gameRepository.findById(id).get();
        GameDTO dto = new GameDTO(result);
        return dto;

    }
}
