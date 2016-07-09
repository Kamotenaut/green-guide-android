package com.greenguide.dlsu.greenguide.data.query;

import android.content.ContentValues;
import android.database.Cursor;

import com.greenguide.dlsu.greenguide.data.model.Tips;

public class TipsQuery {

    private static final String TEXT_TYPE = " TEXT";
    private static final String COMMA_SEP = ",";

    public static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + Tips.TABLE_NAME + " (" +
            Tips.COLUMN_NAME_ID + " INTEGER PRIMARY KEY, " +
            Tips.COLUMN_NAME_DESC + TEXT_TYPE + COMMA_SEP +
            " )";

    public static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + Tips.TABLE_NAME;

    public static ContentValues insertTips(Tips tips){
        ContentValues values = new ContentValues();
        values.put(Tips.COLUMN_NAME_ID, tips.getId());
        values.put(Tips.COLUMN_NAME_DESC, tips.getDescription());
        return values;
    }

    public static Tips queryTips(Cursor cursor) {
        Tips tips = new Tips();

        if( cursor.moveToFirst() ){
            tips.setId(cursor.getInt(cursor.getColumnIndex(Tips.COLUMN_NAME_ID)));
            tips.setDescription(cursor.getString(cursor.getColumnIndex(Tips.COLUMN_NAME_DESC)));
        }

        return tips;
    }
}
