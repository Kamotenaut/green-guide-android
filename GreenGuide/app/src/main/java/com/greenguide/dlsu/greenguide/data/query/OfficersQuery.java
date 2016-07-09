package com.greenguide.dlsu.greenguide.data.query;

import android.content.ContentValues;
import android.database.Cursor;

import com.greenguide.dlsu.greenguide.data.model.Officers;

public class OfficersQuery {

    private static final String TEXT_TYPE = " TEXT";
    private static final String COMMA_SEP = ",";

    public static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + Officers.TABLE_NAME + " (" +
            Officers.COLUMN_NAME_ID + " INTEGER PRIMARY KEY, " +
            Officers.COLUMN_NAME_NAME + TEXT_TYPE + COMMA_SEP +
            Officers.COLUMN_NAME_POSITION + TEXT_TYPE + COMMA_SEP +
            Officers.COLUMN_NAME_OFFICE + TEXT_TYPE + COMMA_SEP +
            Officers.COLUMN_NAME_IMAGE_URL + TEXT_TYPE + COMMA_SEP +
            " )";

    public static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + Officers.TABLE_NAME;

    public static ContentValues insertOfficers(Officers officers){
        ContentValues values = new ContentValues();
        values.put(Officers.COLUMN_NAME_ID, officers.getId());
        values.put(Officers.COLUMN_NAME_NAME, officers.getName());
        values.put(Officers.COLUMN_NAME_POSITION, officers.getPosition());
        values.put(Officers.COLUMN_NAME_OFFICE, officers.getOffice());
        values.put(Officers.COLUMN_NAME_IMAGE_URL, officers.getImage_url());
        return values;
    }

    public static Officers queryOfficers(Cursor cursor) {
        Officers officers = new Officers();

        if( cursor.moveToFirst() ){
            officers.setId(cursor.getInt(cursor.getColumnIndex(Officers.COLUMN_NAME_ID)));
            officers.setName(cursor.getString(cursor.getColumnIndex(Officers.COLUMN_NAME_NAME)));
            officers.setPosition(cursor.getString(cursor.getColumnIndex(Officers.COLUMN_NAME_POSITION)));
            officers.setOffice(cursor.getString(cursor.getColumnIndex(Officers.COLUMN_NAME_OFFICE)));
            officers.setImage_url(cursor.getString(cursor.getColumnIndex(Officers.COLUMN_NAME_IMAGE_URL)));
        }

        return officers;

    }
}
