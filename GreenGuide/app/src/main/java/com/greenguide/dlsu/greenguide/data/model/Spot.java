package com.greenguide.dlsu.greenguide.data.model;

public class Spot {

    public static final String TABLE_NAME = "spot";
    public static final String COLUMN_NAME_ID = "id";
    public static final String COLUMN_NAME_NAME = "name";
    public static final String COLUMN_NAME_DESC = "description";
    public static final String COLUMN_NAME_LOCATION = "location";
    public static final String COLUMN_NAME_TYPE = "type";
    public static final String COLUMN_NAME_IMAGE_URL = "image_url";

    private int id;
    private String name;
    private String description;
    private String location;
    private String type;
    private String image_url;

    public Spot(){}

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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }
}
