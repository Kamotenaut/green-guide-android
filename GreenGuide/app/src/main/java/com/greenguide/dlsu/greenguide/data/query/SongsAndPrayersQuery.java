package com.greenguide.dlsu.greenguide.data.query;

import android.content.ContentValues;
import android.database.Cursor;

import com.greenguide.dlsu.greenguide.data.model.SongsAndPrayers;

public class SongsAndPrayersQuery {

    private static final String TEXT_TYPE = " TEXT";
    private static final String COMMA_SEP = ",";

    public static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + SongsAndPrayers.TABLE_NAME + " (" +
            SongsAndPrayers.COLUMN_NAME_ID + " INTEGER PRIMARY KEY, " +
            SongsAndPrayers.COLUMN_NAME_NAME + TEXT_TYPE + COMMA_SEP +
            SongsAndPrayers.COLUMN_NAME_DESC + TEXT_TYPE + COMMA_SEP +
            SongsAndPrayers.COLUMN_NAME_TYPE + TEXT_TYPE + COMMA_SEP +
            SongsAndPrayers.COLUMN_NAME_URL + TEXT_TYPE + COMMA_SEP +
            " )";

    public static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + SongsAndPrayers.TABLE_NAME;

    public static ContentValues insertSongsAndPrayers(SongsAndPrayers songsandprayers){
        ContentValues values = new ContentValues();
        values.put(SongsAndPrayers.COLUMN_NAME_ID, songsandprayers.getId());
        values.put(SongsAndPrayers.COLUMN_NAME_NAME, songsandprayers.getName());
        values.put(SongsAndPrayers.COLUMN_NAME_DESC, songsandprayers.getDescription());
        values.put(SongsAndPrayers.COLUMN_NAME_TYPE, songsandprayers.getType());
        values.put(SongsAndPrayers.COLUMN_NAME_URL, songsandprayers.getFile_url());
        return values;
    }

    public static SongsAndPrayers querySongsAndPrayers(Cursor cursor) {
        SongsAndPrayers songsAndPrayers = new SongsAndPrayers();

        if( cursor.moveToFirst() ){
            songsAndPrayers.setId(cursor.getInt(cursor.getColumnIndex(SongsAndPrayers.COLUMN_NAME_ID)));
            songsAndPrayers.setName(cursor.getString(cursor.getColumnIndex(SongsAndPrayers.COLUMN_NAME_NAME)));
            songsAndPrayers.setDescription(cursor.getString(cursor.getColumnIndex(SongsAndPrayers.COLUMN_NAME_DESC)));
            songsAndPrayers.setType(cursor.getString(cursor.getColumnIndex(SongsAndPrayers.COLUMN_NAME_TYPE)));
            songsAndPrayers.setFile_url(cursor.getString(cursor.getColumnIndex(SongsAndPrayers.COLUMN_NAME_URL)));
        }

        return songsAndPrayers;
    }
}
