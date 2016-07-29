package com.greenguide.dlsu.greenguide.data.query;

import android.content.ContentValues;
import android.database.Cursor;

import com.greenguide.dlsu.greenguide.data.model.Activity;

public class ActivityQuery {

    private static final String TEXT_TYPE = " TEXT";
    private static final String COMMA_SEP = ",";

    public static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + Activity.TABLE_NAME + " (" +
            Activity.COLUMN_NAME_ID + " INTEGER PRIMARY KEY, " +
            Activity.COLUMN_NAME_NAME + TEXT_TYPE + COMMA_SEP +
            Activity.COLUMN_NAME_DAY + TEXT_TYPE + COMMA_SEP +
            Activity.COLUMN_NAME_START_TIME + TEXT_TYPE + COMMA_SEP +
            Activity.COLUMN_NAME_END_TIME + TEXT_TYPE + COMMA_SEP +
            " )";

    public static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + Activity.TABLE_NAME;

    public static ContentValues insertActivity(Activity activity){
        ContentValues values = new ContentValues();
        values.put(Activity.COLUMN_NAME_ID, activity.getId());
        values.put(Activity.COLUMN_NAME_NAME, activity.getName());
        values.put(Activity.COLUMN_NAME_DAY, activity.getDay());
        values.put(Activity.COLUMN_NAME_START_TIME, activity.getStart_time());
        values.put(Activity.COLUMN_NAME_END_TIME, activity.getEnd_time());
        return values;
    }

    public static Activity queryActivity(Cursor cursor){
        Activity activity = new Activity();

        if( cursor.moveToFirst() ){
            activity.setId(cursor.getInt(cursor.getColumnIndex(Activity.COLUMN_NAME_ID)));
            activity.setName(cursor.getString(cursor.getColumnIndex(Activity.COLUMN_NAME_NAME)));
            activity.setDay(cursor.getString(cursor.getColumnIndex(Activity.COLUMN_NAME_DAY)));
            activity.setStart_time(cursor.getString(cursor.getColumnIndex(Activity.COLUMN_NAME_START_TIME)));
            activity.setEnd_time(cursor.getString(cursor.getColumnIndex(Activity.COLUMN_NAME_END_TIME)));
        }

        return activity;

    }

}
