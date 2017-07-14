package com.greenguide.dlsu.greenguide.data.model;

public class Spot {

    private String name, description, location;

    public Spot(String name, String description, String location){
        this.name = name;
        this.description = description;
        this.location = location;
    }

    public Spot(String name, String description){
        this.name = name;
        this.description = description;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
