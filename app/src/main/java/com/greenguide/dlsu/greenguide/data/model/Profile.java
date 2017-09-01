package com.greenguide.dlsu.greenguide.data.model;

/**
 * Created by jasonsioco on 8/13/2016.
 */
public class Profile {
    private String name;
    private String position;
    private String email;
    private String description;
    private int resid;

    public Profile(String name, String position, String description, int resid){
        this.setName(name);
        this.setPosition(position);
        this.setDescription(description);
        this.setResid(resid);
    }

    public Profile(String name, String position, String description){
        this(name, position, description, "");
    }

    public Profile(String name, String position, String description, String email){
        this.setName(name);
        this.setPosition(position);
        this.setDescription(description);
        this.setEmail(email);
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

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }
}
