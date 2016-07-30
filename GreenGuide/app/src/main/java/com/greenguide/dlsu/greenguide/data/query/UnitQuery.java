package com.greenguide.dlsu.greenguide.data.query;

import android.content.ContentValues;
import android.database.Cursor;

import com.greenguide.dlsu.greenguide.data.model.Unit;

public class UnitQuery {


    private static final String TEXT_TYPE = " TEXT";
    private static final String COMMA_SEP = ",";

    public static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + Unit.TABLE_NAME + " (" +
            Unit.COLUMN_NAME_ID + " INTEGER PRIMARY KEY, " +
            Unit.COLUMN_NAME_COLLEGE +  TEXT_TYPE + COMMA_SEP +
            Unit.COLUMN_NAME_BATCH + TEXT_TYPE + COMMA_SEP +
            " )";

    public static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + Unit.TABLE_NAME;

    public static ContentValues insertUnit(Unit unit) {
        ContentValues values = new ContentValues();

        values.put(Unit.COLUMN_NAME_ID, unit.getId());
        values.put(Unit.COLUMN_NAME_COLLEGE, unit.getCollege());
        values.put(Unit.COLUMN_NAME_BATCH, unit.getBatch());

        return values;
    }

    public static Unit queryUnit(Cursor cursor){
        Unit unit = new Unit();

        if( cursor.moveToFirst() ) {

            unit.setId(cursor.getInt(cursor.getColumnIndex(Unit.COLUMN_NAME_ID)));
            unit.setCollege(cursor.getString(cursor.getColumnIndex(Unit.COLUMN_NAME_COLLEGE)));
            unit.setBatch(cursor.getString(cursor.getColumnIndex(Unit.COLUMN_NAME_BATCH)));
        }

        return unit;
    }


}
