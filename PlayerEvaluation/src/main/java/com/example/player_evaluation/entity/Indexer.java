package com.example.player_evaluation.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "indexer")
public class Indexer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer indexId;

    private String name;
    private float valueMin;
    private float valueMax;

    // Getters and setters
}
