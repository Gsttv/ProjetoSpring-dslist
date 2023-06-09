package com.gustavomorais.dslist.controllers;

import com.gustavomorais.dslist.dto.GameDTO;
import com.gustavomorais.dslist.dto.GameMinDTO;
import com.gustavomorais.dslist.entites.Games;
import com.gustavomorais.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//Disponibiliza o ednpoint na API
@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping(value = "/{id}")
    public GameDTO findByID(@PathVariable Long id){
        GameDTO result = gameService.findByID(id);
        return result;
    }
    @GetMapping
    public List<GameMinDTO> findAll(){
        List<GameMinDTO> result = gameService.findAll();
        return result;
    }
}
