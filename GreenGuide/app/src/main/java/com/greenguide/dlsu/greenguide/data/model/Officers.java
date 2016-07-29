package com.greenguide.dlsu.greenguide.data.model;

public class Officers {

    public static final String TABLE_NAME = "officers";
    public static final String COLUMN_NAME_ID = "id";
    public static final String COLUMN_NAME_NAME = "name";
    public static final String COLUMN_NAME_POSITION = "position";
    public static final String COLUMN_NAME_OFFICE = "office";
    public static final String COLUMN_NAME_TYPE = "type";
    public static final String COLUMN_NAME_IMAGE_URL = "image_url";

    private int id;
    private String name;
    private String position;
    private String office;
    private String type;
    private String image_url;

    public Officers(){}

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
