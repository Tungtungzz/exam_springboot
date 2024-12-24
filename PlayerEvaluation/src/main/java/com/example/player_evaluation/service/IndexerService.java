package com.example.player_evaluation.service;

import com.example.player_evaluation.entity.Indexer;
import com.example.player_evaluation.repository.IndexerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndexerService {

    @Autowired
    private IndexerRepository indexerRepository;

    public List<Indexer> getAllIndexers() {
        return indexerRepository.findAll();
    }
}
