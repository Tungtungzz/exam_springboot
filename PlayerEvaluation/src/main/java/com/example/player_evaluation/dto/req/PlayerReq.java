package com.example.player_evaluation.dto.req;

public class PlayerReq {
    private String name;
    private String fullName;
    private String age;
    private Integer indexId;

    // Getters and Setters
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
