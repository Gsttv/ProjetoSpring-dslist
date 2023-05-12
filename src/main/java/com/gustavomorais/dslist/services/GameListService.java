package com.gustavomorais.dslist.services;

import com.gustavomorais.dslist.dto.GameDTO;
import com.gustavomorais.dslist.dto.GameListDTO;
import com.gustavomorais.dslist.dto.GameMinDTO;
import com.gustavomorais.dslist.entites.GameList;
import com.gustavomorais.dslist.entites.Games;
import com.gustavomorais.dslist.repositories.GameListRepository;
import com.gustavomorais.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//Implementa a rega de negocio
@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;
    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll(); // faz uma consulta no banco e retorna todos os objetos,
        return result.stream().map(x -> new GameListDTO(x)).toList(); // convertendo cada objeto para um objeto do tipo GameMinDTO

    }

}
