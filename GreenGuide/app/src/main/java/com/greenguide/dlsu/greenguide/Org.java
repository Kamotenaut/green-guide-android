package com.greenguide.dlsu.greenguide;

/**
 * Created by jasonsioco on 8/13/2016.
 */
public class Org {


    private String title;
    private String description;

    public Org( String title, String description){
        this.setTitle(title);
        this.setDescription(description);

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String position) {
        this.title = position;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
