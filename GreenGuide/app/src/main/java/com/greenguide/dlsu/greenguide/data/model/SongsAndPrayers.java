package com.greenguide.dlsu.greenguide.data.model;

public class SongsAndPrayers {

    public static final String TABLE_NAME = "songsandprayers";
    public static final String COLUMN_NAME_ID = "id";
    public static final String COLUMN_NAME_NAME = "name";
    public static final String COLUMN_NAME_DESC = "description";
    public static final String COLUMN_NAME_TYPE = "type";

    private int id;
    private String name;
    private String description;
    private String type;

    public SongsAndPrayers(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
