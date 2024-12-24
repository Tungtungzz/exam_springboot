package com.example.player_evaluation.service;

import com.example.player_evaluation.dto.req.PlayerReq;
import com.example.player_evaluation.dto.res.PlayerRes;
import com.example.player_evaluation.entity.Player;
import com.example.player_evaluation.mapper.PlayerMapper;
import com.example.player_evaluation.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PlayerService {
    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    private PlayerMapper playerMapper;

    public List<PlayerRes> getAllPlayers() {
        return playerRepository.findAll().stream()
                .map(playerMapper::toRes)
                .collect(Collectors.toList());
    }

    public PlayerRes createPlayer(PlayerReq req) {
        Player player = playerMapper.toEntity(req);
        Player savedPlayer = playerRepository.save(player);
        return playerMapper.toRes(savedPlayer);
    }

    public PlayerRes updatePlayer(Integer id, PlayerReq req) {
        Player player = playerRepository.findById(id).orElseThrow();
        player.setName(req.getName());
        player.setFullName(req.getFullName());
        player.setAge(req.getAge());
        Player updatedPlayer = playerRepository.save(player);
        return playerMapper.toRes(updatedPlayer);
    }

    public void deletePlayer(Integer id) {
        playerRepository.deleteById(id);
    }
}
