package com.example.player_evaluation.controller;

import com.example.player_evaluation.entity.Indexer;
import com.example.player_evaluation.service.IndexerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Controller
@RequestMapping("/indexers")
public class IndexController {

    private final IndexerService indexerService;

    @Autowired
    public IndexController(IndexerService indexerService) {
        this.indexerService = indexerService;
    }

    @GetMapping
    public String getAllIndexers(Model model) {
        List<Indexer> indexers = indexerService.getAllIndexers();
        model.addAttribute("indexers", indexers);
        return "indexers"; // Trả về tệp indexers.html (nếu có)
    }

    // Bạn có thể thêm các phương thức để thêm, chỉnh sửa, xóa Indexer nếu cần
}
