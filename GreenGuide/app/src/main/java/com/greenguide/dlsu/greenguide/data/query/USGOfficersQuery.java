package com.greenguide.dlsu.greenguide.data.query;

import android.content.ContentValues;
import android.database.Cursor;

import com.greenguide.dlsu.greenguide.data.model.USGOfficers;

public class USGOfficersQuery {

    private static final String TEXT_TYPE = " TEXT";
    private static final String COMMA_SEP = ",";

    public static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + USGOfficers.TABLE_NAME + " (" +
            USGOfficers.COLUMN_NAME_ID + " INTEGER PRIMARY KEY, " +
            USGOfficers.COLUMN_NAME_ID_NUMBER + TEXT_TYPE + COMMA_SEP +
            USGOfficers.COLUMN_NAME_NAME + TEXT_TYPE + COMMA_SEP +
            USGOfficers.COLUMN_NAME_POSITION + TEXT_TYPE + COMMA_SEP +
            USGOfficers.COLUMN_NAME_COLLEGE + TEXT_TYPE + COMMA_SEP +
            USGOfficers.COLUMN_NAME_BATCH + TEXT_TYPE + COMMA_SEP +
            USGOfficers.COLUMN_NAME_IMAGE_URL + TEXT_TYPE + COMMA_SEP +
            " )";

    public static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + USGOfficers.TABLE_NAME;

    public static ContentValues insertUSGOfficers(USGOfficers usgofficers){
        ContentValues values = new ContentValues();
        values.put(USGOfficers.COLUMN_NAME_ID, usgofficers.getId());
        values.put(USGOfficers.COLUMN_NAME_ID_NUMBER, usgofficers.getId_number());
        values.put(USGOfficers.COLUMN_NAME_NAME, usgofficers.getName());
        values.put(USGOfficers.COLUMN_NAME_POSITION, usgofficers.getPosition());
        values.put(USGOfficers.COLUMN_NAME_COLLEGE, usgofficers.getCollege());
        values.put(USGOfficers.COLUMN_NAME_BATCH, usgofficers.getBatch());
        values.put(USGOfficers.COLUMN_NAME_IMAGE_URL, usgofficers.getImage_url());
        return values;
    }

    public static USGOfficers queryUSGOfficers(Cursor cursor){
        USGOfficers usgofficers = new USGOfficers();

        if( cursor.moveToFirst() ){
            usgofficers.setId(cursor.getInt(cursor.getColumnIndex(USGOfficers.COLUMN_NAME_ID)));
            usgofficers.setId_number(cursor.getString(cursor.getColumnIndex(USGOfficers.COLUMN_NAME_ID_NUMBER)));
            usgofficers.setName(cursor.getString(cursor.getColumnIndex(USGOfficers.COLUMN_NAME_NAME)));
            usgofficers.setPosition(cursor.getString(cursor.getColumnIndex(USGOfficers.COLUMN_NAME_POSITION)));
            usgofficers.setCollege(cursor.getString(cursor.getColumnIndex(USGOfficers.COLUMN_NAME_COLLEGE)));
            usgofficers.setBatch(cursor.getString(cursor.getColumnIndex(USGOfficers.COLUMN_NAME_BATCH)));
            usgofficers.setImage_url(cursor.getString(cursor.getColumnIndex(USGOfficers.COLUMN_NAME_IMAGE_URL)));
        }

        return usgofficers;
    }
}
