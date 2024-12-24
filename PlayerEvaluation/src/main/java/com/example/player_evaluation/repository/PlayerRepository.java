package com.example.player_evaluation.repository;

import com.example.player_evaluation.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Integer> {
}
