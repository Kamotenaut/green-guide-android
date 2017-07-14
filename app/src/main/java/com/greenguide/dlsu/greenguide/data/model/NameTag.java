package com.greenguide.dlsu.greenguide.data.model;

public class NameTag {

    String name, description;

    public NameTag(String name, String description){
        this.name = name;
        this.description = description;
    }

    public NameTag(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
