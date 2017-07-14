package com.greenguide.dlsu.greenguide.data.model;

public class Schedule {

    private String time, description, label;

    public Schedule ( String description, String time, String label ){
        this.description = description;
        this.time = time;
        this.label = label;
    }

    public Schedule ( String description, String time ){
        this.description = description;
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
