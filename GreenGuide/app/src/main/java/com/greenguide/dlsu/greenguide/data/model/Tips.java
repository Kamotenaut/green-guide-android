package com.greenguide.dlsu.greenguide.data.model;

public class Tips {

    public static final String TABLE_NAME = "tips";
    public static final String COLUMN_NAME_ID = "id";
    public static final String COLUMN_NAME_DESC = "description";

    private int id;
    private String description;

    public Tips(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
