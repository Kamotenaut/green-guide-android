package com.greenguide.dlsu.greenguide.data.query;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.greenguide.dlsu.greenguide.data.model.Spot;

public class SpotQuery {

    private static final String TEXT_TYPE = " TEXT";
    private static final String COMMA_SEP = ",";

    public static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + Spot.TABLE_NAME + " (" +
            Spot.COLUMN_NAME_ID + " INTEGER PRIMARY KEY, " +
            Spot.COLUMN_NAME_NAME + TEXT_TYPE + COMMA_SEP +
            Spot.COLUMN_NAME_DESC + TEXT_TYPE + COMMA_SEP +
            Spot.COLUMN_NAME_LOCATION + TEXT_TYPE + COMMA_SEP +
            Spot.COLUMN_NAME_TYPE + TEXT_TYPE + COMMA_SEP +
            Spot.COLUMN_NAME_IMAGE_URL + TEXT_TYPE + COMMA_SEP +
            " )";

    public static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + Spot.TABLE_NAME;

    public static ContentValues insertSpot(Spot spot){
        ContentValues values = new ContentValues();
        values.put(Spot.COLUMN_NAME_ID, spot.getId());
        values.put(Spot.COLUMN_NAME_NAME, spot.getName());
        values.put(Spot.COLUMN_NAME_DESC, spot.getDescription());
        values.put(Spot.COLUMN_NAME_LOCATION, spot.getLocation());
        values.put(Spot.COLUMN_NAME_TYPE, spot.getType());
        values.put(Spot.COLUMN_NAME_IMAGE_URL, spot.getImage_url());
        return values;
    }

    public static Spot querySpot(Cursor cursor) {
        Spot spot = new Spot();

        if( cursor.moveToFirst() ){
            spot.setId(cursor.getInt(cursor.getColumnIndex(Spot.COLUMN_NAME_ID)));
            spot.setName(cursor.getString(cursor.getColumnIndex(Spot.COLUMN_NAME_NAME)));
            spot.setDescription(cursor.getString(cursor.getColumnIndex(Spot.COLUMN_NAME_DESC)));
            spot.setLocation(cursor.getString(cursor.getColumnIndex(Spot.COLUMN_NAME_LOCATION)));
            spot.setType(cursor.getString(cursor.getColumnIndex(Spot.COLUMN_NAME_TYPE)));
            spot.setImage_url(cursor.getString(cursor.getColumnIndex(Spot.COLUMN_NAME_IMAGE_URL)));
        }

        return spot;
    }
}
