package com.greenguide.dlsu.greenguide.data.model;

public class Unit {

    public static final String TABLE_NAME = "unit";
    public static final String COLUMN_NAME_ID = "id";
    public static final String COLUMN_NAME_COLLEGE = "college";
    public static final String COLUMN_NAME_BATCH = "batch";

    private int id;
    private String college;
    private String batch;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
