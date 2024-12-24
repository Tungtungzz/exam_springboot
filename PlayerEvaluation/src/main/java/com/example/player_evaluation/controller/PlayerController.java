package com.example.player_evaluation.controller;

import com.example.player_evaluation.dto.req.PlayerReq;
import com.example.player_evaluation.dto.res.PlayerRes;
import com.example.player_evaluation.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/players")
public class PlayerController {
    private final PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping
    public List<PlayerRes> getAllPlayers() {
        return playerService.getAllPlayers();
    }

    @PostMapping
    public PlayerRes createPlayer(@RequestBody PlayerReq req) {
        return playerService.createPlayer(req);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PlayerRes> updatePlayer(@PathVariable Integer id, @RequestBody PlayerReq req) {
        PlayerRes updatedPlayer = playerService.updatePlayer(id, req);
        return ResponseEntity.ok(updatedPlayer);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePlayer(@PathVariable Integer id) {
        playerService.deletePlayer(id);
        return ResponseEntity.noContent().build();
    }
}
