package com.greenguide.dlsu.greenguide;

/**
 * Created by jasonsioco on 8/13/2016.
 */
public class Profile {
    private String name;
    private String position;
    private String description;
    private int resid;

    public Profile(String name, String position, String description,int resid){
        this.setName(name);
        this.setPosition(position);
        this.setDescription(description);
        this.setResid(resid);
    }

    public Profile(String name, String position, String description){
        this.setName(name);
        this.setPosition(position);
        this.setDescription(description);

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getResid() {
        return resid;
    }

    public void setResid(int resid) {
        this.resid = resid;
    }
}
