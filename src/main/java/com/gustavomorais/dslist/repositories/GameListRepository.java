package com.gustavomorais.dslist.repositories;

import com.gustavomorais.dslist.entites.GameList;
import com.gustavomorais.dslist.entites.Games;
import org.springframework.data.jpa.repository.JpaRepository;

//Faz o acesso ao banco de dados, faz consulta no banco
public interface GameListRepository extends JpaRepository<GameList,Long> {
}
