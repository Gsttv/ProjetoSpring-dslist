package com.gustavomorais.dslist.services;

import com.gustavomorais.dslist.dto.GameDTO;
import com.gustavomorais.dslist.dto.GameMinDTO;
import com.gustavomorais.dslist.entites.Games;
import com.gustavomorais.dslist.projections.GameMinProjection;
import com.gustavomorais.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//Implementa a rega de negocio
@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findByID(Long id){
        Games result = gameRepository.findById(id).get();
        return new GameDTO(result);

    }
    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        List<Games> result = gameRepository.findAll(); // faz uma consulta no banco e retorna todos os objetos,
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList(); // convertendo cada objeto para um objeto do tipo GameMinDTO
        return dto;
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listId){
        List<GameMinProjection> result = gameRepository.searchByList(listId); // faz uma consulta no banco e retorna a lisat pelo id,
        return result.stream().map(x -> new GameMinDTO(x)).toList();

    }

}
