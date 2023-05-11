package com.gustavomorais.dslist.repositories;

import com.gustavomorais.dslist.entites.Games;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Games,Long> {
}
