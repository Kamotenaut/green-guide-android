package com.greenguide.dlsu.greenguide.data.model;

public class USGOfficers {

    public static final String TABLE_NAME = "usgofficers";
    public static final String COLUMN_NAME_ID = "id";
    public static final String COLUMN_NAME_ID_NUMBER = "id_number";
    public static final String COLUMN_NAME_NAME = "name";
    public static final String COLUMN_NAME_POSITION = "position";
    public static final String COLUMN_NAME_COLLEGE = "college";
    public static final String COLUMN_NAME_BATCH = "batch";
    public static final String COLUMN_NAME_IMAGE_URL = "image_url";

    private int id;
    private String id_number;
    private String name;
    private String position;
    private String college;
    private String batch;
    private String image_url;

    public USGOfficers(){}

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getId_number() {
        return id_number;
    }

    public void setId_number(String id_number) {
        this.id_number = id_number;
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

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }
}
