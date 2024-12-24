package com.example.player_evaluation.dto.res;

public class PlayerRes {

    private Integer playerId;
    private String name;
    private String fullName;
    private String age;
    private IndexerRes indexer;

    // Getters and setters

    public Integer getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public IndexerRes getIndexer() {
        return indexer;
    }

    public void setIndexer(IndexerRes indexer) {
        this.indexer = indexer;
    }
}
