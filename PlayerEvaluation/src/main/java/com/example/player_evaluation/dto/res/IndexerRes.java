package com.example.player_evaluation.dto.res;

public class IndexerRes {

    private Integer indexId;
    private String name;
    private Float valueMin;
    private Float valueMax;

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

    public Float getValueMin() {
        return valueMin;
    }

    public void setValueMin(Float valueMin) {
        this.valueMin = valueMin;
    }

    public Float getValueMax() {
        return valueMax;
    }

    public void setValueMax(Float valueMax) {
        this.valueMax = valueMax;
    }
}
