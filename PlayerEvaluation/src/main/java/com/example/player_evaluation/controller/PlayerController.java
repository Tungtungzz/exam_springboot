package com.example.player_evaluation.controller;

import com.example.player_evaluation.dto.req.PlayerReq;
import com.example.player_evaluation.dto.res.PlayerRes;
import com.example.player_evaluation.entity.Indexer;
import com.example.player_evaluation.service.IndexerService;
import com.example.player_evaluation.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/players")
public class PlayerController {

    private final PlayerService playerService;
    private final IndexerService indexerService;

    @Autowired
    public PlayerController(PlayerService playerService, IndexerService indexerService) {
        this.playerService = playerService;
        this.indexerService = indexerService;
    }

    @GetMapping
    public String getAllPlayers(Model model) {
        List<PlayerRes> players = playerService.getAllPlayers();
        model.addAttribute("players", players);
        return "players"; // Trả về tệp players.html
    }

    @GetMapping("/add")
    public String showAddPlayerForm(Model model) {
        model.addAttribute("player", new PlayerReq());
        List<Indexer> indexers = indexerService.getAllIndexers();
        model.addAttribute("indexers", indexers);
        return "add-player"; // Trả về tệp add-player.html
    }

    @PostMapping
    public String createPlayer(@Valid @ModelAttribute("player") PlayerReq req, BindingResult result, Model model) {
        if (result.hasErrors()) {
            List<Indexer> indexers = indexerService.getAllIndexers();
            model.addAttribute("indexers", indexers);
            return "add-player";
        }
        playerService.createPlayer(req);
        return "redirect:/players";
    }

    @GetMapping("/edit/{id}")
    public String showEditPlayerForm(@PathVariable Integer id, Model model) {
        PlayerRes player = playerService.getPlayerById(id);
        model.addAttribute("player", player);
        List<Indexer> indexers = indexerService.getAllIndexers();
        model.addAttribute("indexers", indexers);
        return "edit-player"; // Trả về tệp edit-player.html
    }

    @PostMapping("/edit/{id}")
    public String updatePlayer(@PathVariable Integer id, @Valid @ModelAttribute("player") PlayerReq req, BindingResult result, Model model) {
        if (result.hasErrors()) {
            List<Indexer> indexers = indexerService.getAllIndexers();
            model.addAttribute("indexers", indexers);
            return "edit-player";
        }
        playerService.updatePlayer(id, req);
        return "redirect:/players";
    }

    @GetMapping("/delete/{id}")
    public String deletePlayer(@PathVariable Integer id) {
        playerService.deletePlayer(id);
        return "redirect:/players";
    }
}
