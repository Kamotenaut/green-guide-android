package com.greenguide.dlsu.greenguide.data.model;

public enum Location {

    Manila("Manila Campus"),
    Laguna("Laguna Campus"),
    Makati("Makati Campus"),
    OFF("Off-Campus");

    private String location;

    private Location(String location){
        this.location = location;
    }

    public String getLocation() {
        return location;
    }
}
