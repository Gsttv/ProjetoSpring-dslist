package com.gustavomorais.dslist.controllers;

import com.gustavomorais.dslist.dto.GameDTO;
import com.gustavomorais.dslist.dto.GameListDTO;
import com.gustavomorais.dslist.dto.GameMinDTO;
import com.gustavomorais.dslist.services.GameListService;
import com.gustavomorais.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//Disponibiliza o ednpoint na API
@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListDTO> findAll(){
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }
}
