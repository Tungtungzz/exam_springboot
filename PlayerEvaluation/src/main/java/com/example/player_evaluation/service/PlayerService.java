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

    public PlayerRes getPlayerById(Integer id) {
        Player player = playerRepository.findById(id).orElseThrow(() -> new RuntimeException("Player not found"));
        return playerMapper.toRes(player);
    }

    public PlayerRes createPlayer(PlayerReq req) {
        validatePlayerReq(req);
        Player player = playerMapper.toEntity(req);
        Player savedPlayer = playerRepository.save(player);
        return playerMapper.toRes(savedPlayer);
    }

    public PlayerRes updatePlayer(Integer id, PlayerReq req) {
        validatePlayerReq(req);
        Player player = playerRepository.findById(id).orElseThrow(() -> new RuntimeException("Player not found"));
        player.setName(req.getName());
        player.setFullName(req.getFullName());
        player.setAge(req.getAge());
        Player updatedPlayer = playerRepository.save(player);
        return playerMapper.toRes(updatedPlayer);
    }

    public void deletePlayer(Integer id) {
        playerRepository.deleteById(id);
    }

    private void validatePlayerReq(PlayerReq req) {
        if (req.getName() == null || req.getName().isEmpty()) {
            throw new RuntimeException("Name is required");
        }
        if (req.getFullName() == null || req.getFullName().isEmpty()) {
            throw new RuntimeException("Full Name is required");
        }
        if (req.getAge() == null || req.getAge().isEmpty()) {
            throw new RuntimeException("Age is required");
        }
        if (req.getIndexId() == null) {
            throw new RuntimeException("Indexer is required");
        }
    }
}
