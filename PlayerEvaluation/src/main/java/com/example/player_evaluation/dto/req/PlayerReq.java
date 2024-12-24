package com.example.player_evaluation.dto.req;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class PlayerReq {

    @NotBlank(message = "Name is required")
    private String name;

    @NotBlank(message = "Full Name is required")
    private String fullName;

    @NotBlank(message = "Age is required")
    private String age;

    @NotNull(message = "Indexer is required")
    private Integer indexId;

    // Getters and setters

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

    public Integer getIndexId() {
        return indexId;
    }

    public void setIndexId(Integer indexId) {
        this.indexId = indexId;
    }
}
