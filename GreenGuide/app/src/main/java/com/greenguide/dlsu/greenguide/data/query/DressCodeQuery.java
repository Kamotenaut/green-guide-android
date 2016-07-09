package com.greenguide.dlsu.greenguide.data.query;

import android.content.ContentValues;
import android.database.Cursor;

import com.greenguide.dlsu.greenguide.data.model.DressCode;

public class DressCodeQuery {

    private static final String TEXT_TYPE = " TEXT";
    private static final String COMMA_SEP = ",";

    public static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + DressCode.TABLE_NAME + " (" +
            DressCode.COLUMN_NAME_ID + " INTEGER PRIMARY KEY, " +
            DressCode.COLUMN_NAME_NAME + TEXT_TYPE + COMMA_SEP +
            DressCode.COLUMN_NAME_DESC + TEXT_TYPE + COMMA_SEP +
            DressCode.COLUMN_NAME_CLOTH_TYPE + TEXT_TYPE + COMMA_SEP +
            DressCode.COLUMN_NAME_IMAGE_URL + TEXT_TYPE + COMMA_SEP +
            DressCode.COLUMN_NAME_IS_ALLOWED + TEXT_TYPE + COMMA_SEP +
            " )";

    public static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + DressCode.TABLE_NAME;

    public static ContentValues insertDressCode(DressCode dressCode){
        ContentValues values = new ContentValues();
        values.put(DressCode.COLUMN_NAME_ID, dressCode.getId());
        values.put(DressCode.COLUMN_NAME_NAME, dressCode.getName());
        values.put(DressCode.COLUMN_NAME_DESC, dressCode.getDescription());
        values.put(DressCode.COLUMN_NAME_CLOTH_TYPE, dressCode.getCloth_type());
        values.put(DressCode.COLUMN_NAME_IMAGE_URL, dressCode.getImage_url());
        values.put(DressCode.COLUMN_NAME_IS_ALLOWED, dressCode.getAllowed());
        return values;
    }

    public static DressCode queryDressCode(Cursor cursor) {
        DressCode dressCode = new DressCode();

        if( cursor.moveToFirst() ){
            dressCode.setId(cursor.getInt(cursor.getColumnIndex(DressCode.COLUMN_NAME_ID)));
            dressCode.setName(cursor.getString(cursor.getColumnIndex(DressCode.COLUMN_NAME_NAME)));
            dressCode.setDescription(cursor.getString(cursor.getColumnIndex(DressCode.COLUMN_NAME_DESC)));
            dressCode.setCloth_type(cursor.getString(cursor.getColumnIndex(DressCode.COLUMN_NAME_CLOTH_TYPE)));
            dressCode.setImage_url(cursor.getString(cursor.getColumnIndex(DressCode.COLUMN_NAME_IMAGE_URL)));
            dressCode.setAllowed(cursor.getString(cursor.getColumnIndex(DressCode.COLUMN_NAME_IS_ALLOWED)));
        }

        return dressCode;
    }
}
