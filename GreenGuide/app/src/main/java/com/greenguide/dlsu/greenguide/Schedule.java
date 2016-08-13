package com.greenguide.dlsu.greenguide;

/**
 * Created by jasonsioco on 8/10/2016.
 */
public class Schedule {
    private String time;
    private String title;

    public Schedule(String title, String time){
        this.setTime(time);
        this.setTitle(title);

    }


    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
