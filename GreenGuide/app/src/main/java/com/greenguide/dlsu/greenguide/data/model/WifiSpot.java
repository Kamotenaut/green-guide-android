package com.greenguide.dlsu.greenguide.data.model;

public class WifiSpot {

    public static final String TABLE_NAME = "wifispot";
    public static final String COLUMN_NAME_ID = "id";
    public static final String COLUMN_NAME_BLDG_NAME = "building_name";
    public static final String COLUMN_NAME_BLDG_LOCATION = "building_location";
    public static final String COLUMN_NAME_IMAGE_URL = "image_url";

    private int id;
    private String building_name;
    private String building_location;
    private String image_url;

    public WifiSpot(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBuilding_name() {
        return building_name;
    }

    public void setBuilding_name(String building_name) {
        this.building_name = building_name;
    }

    public String getBuilding_location() {
        return building_location;
    }

    public void setBuilding_location(String building_location) {
        this.building_location = building_location;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }
}
