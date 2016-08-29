package com.greenguide.dlsu.greenguide.data.model;

public enum Location {

    Manila("Manila Campus"),
    STC("STC Campus"),
    Makati("Makati Campus"),
    OFF("Outside DLSU");

    private String location;

    private Location(String location){
        this.location = location;
    }

    public String getLocation() {
        return location;
    }
}
