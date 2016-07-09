package com.greenguide.dlsu.greenguide.data.query;

import android.content.ContentValues;
import android.database.Cursor;

import com.greenguide.dlsu.greenguide.data.model.WifiSpot;

public class WifiSpotQuery {

    private static final String TEXT_TYPE = " TEXT";
    private static final String COMMA_SEP = ",";

    public static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + WifiSpot.TABLE_NAME + " (" +
            WifiSpot.COLUMN_NAME_ID + " INTEGER PRIMARY KEY, " +
            WifiSpot.COLUMN_NAME_BLDG_NAME + TEXT_TYPE + COMMA_SEP +
            WifiSpot.COLUMN_NAME_BLDG_LOCATION+ TEXT_TYPE + COMMA_SEP +
            WifiSpot.COLUMN_NAME_IMAGE_URL + TEXT_TYPE + COMMA_SEP +
            " )";

    public static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + WifiSpot.TABLE_NAME;

    public static ContentValues insertWifiSpot(WifiSpot wifispot){
        ContentValues values = new ContentValues();
        values.put(WifiSpot.COLUMN_NAME_ID, wifispot.getId());
        values.put(WifiSpot.COLUMN_NAME_BLDG_NAME, wifispot.getBuilding_name());
        values.put(WifiSpot.COLUMN_NAME_BLDG_LOCATION, wifispot.getBuilding_location());
        values.put(WifiSpot.COLUMN_NAME_IMAGE_URL, wifispot.getImage_url());
        return values;
    }

    public static WifiSpot queryWifiSpot(Cursor cursor){
        WifiSpot wifispot = new WifiSpot();

        if( cursor.moveToFirst() ){
            wifispot.setId(cursor.getInt(cursor.getColumnIndex(WifiSpot.COLUMN_NAME_ID)));
            wifispot.setBuilding_name(cursor.getString(cursor.getColumnIndex(WifiSpot.COLUMN_NAME_BLDG_NAME)));
            wifispot.setBuilding_location(cursor.getString(cursor.getColumnIndex(WifiSpot.COLUMN_NAME_BLDG_LOCATION)));
            wifispot.setImage_url(cursor.getString(cursor.getColumnIndex(WifiSpot.COLUMN_NAME_IMAGE_URL)));
        }

        return wifispot;
    }
}
