package com.greenguide.dlsu.greenguide.data.model;

public class Activity {

    public static final String TABLE_NAME = "activity";
    public static final String COLUMN_NAME_ID = "id";
    public static final String COLUMN_NAME_DAY = "day";
    public static final String COLUMN_NAME_START_TIME = "start_time";
    public static final String COLUMN_NAME_END_TIME = "end_time";
    public static final String COLUMN_NAME_NAME = "name";
    public static final String COLUMN_NAME_TYPE = "type";

    private int id;
    private String name;
    private String day;
    private String start_time;
    private String end_time;
    private String type;

    public Activity(){}

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

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
