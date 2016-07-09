package com.greenguide.dlsu.greenguide.data.model;

public class DressCode {

    public static final String TABLE_NAME = "dresscode";
    public static final String COLUMN_NAME_ID = "id";
    public static final String COLUMN_NAME_NAME = "name";
    public static final String COLUMN_NAME_DESC = "description";
    public static final String COLUMN_NAME_CLOTH_TYPE = "cloth_type";
    public static final String COLUMN_NAME_IMAGE_URL = "image_url";
    public static final String COLUMN_NAME_IS_ALLOWED = "isAllowed";

    private int id;
    private String name;
    private String description;
    private String cloth_type;
    private String image_url;
    private String isAllowed;

    public DressCode(){}

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

    public String getCloth_type() {
        return cloth_type;
    }

    public void setCloth_type(String cloth_type) {
        this.cloth_type = cloth_type;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getAllowed() {
        return isAllowed;
    }

    public void setAllowed(String allowed) {
        isAllowed = allowed;
    }
}
