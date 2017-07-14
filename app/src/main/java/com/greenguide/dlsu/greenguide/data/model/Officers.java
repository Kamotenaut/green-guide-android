package com.greenguide.dlsu.greenguide.data.model;

public class Officers {

    private String name,
            position,
            office;

    public Officers(String name, String position, String office){
        this.name = name;
        this.position = position;
        this.office = office;
    }

    public Officers(String name, String position){
        this.name = name;
        this.position = position;
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

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }
}
