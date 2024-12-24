package com.example.player_evaluation.dto.res;

public class IndexerRes {
    private Integer indexId;
    private String name;
    private float valueMin;
    private float valueMax;

    // Getters and setters
    public Integer getIndexId() {
        return indexId;
    }

    public void setIndexId(Integer indexId) {
        this.indexId = indexId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getValueMin() {
        return valueMin;
    }

    public void setValueMin(float valueMin) {
        this.valueMin = valueMin;
    }

    public float getValueMax() {
        return valueMax;
    }

    public void setValueMax(float valueMax) {
        this.valueMax = valueMax;
    }
}
