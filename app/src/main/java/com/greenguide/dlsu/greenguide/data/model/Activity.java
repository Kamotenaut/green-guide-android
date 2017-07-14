package com.greenguide.dlsu.greenguide.data.model;

public class Activity {

    private String title, time, day, venue;

    public Activity(String title, String time, String day, String venue){
        this.title = title;
        this.time = time;
        this.day = day;
        this.venue = venue;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }
}
