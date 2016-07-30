package com.greenguide.dlsu.greenguide.data;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.greenguide.dlsu.greenguide.data.model.Activity;
import com.greenguide.dlsu.greenguide.data.model.DressCode;
import com.greenguide.dlsu.greenguide.data.model.Officers;
import com.greenguide.dlsu.greenguide.data.model.SongsAndPrayers;
import com.greenguide.dlsu.greenguide.data.model.Spot;
import com.greenguide.dlsu.greenguide.data.model.Tips;

import com.greenguide.dlsu.greenguide.data.model.Unit;
import com.greenguide.dlsu.greenguide.data.query.ActivityQuery;
import com.greenguide.dlsu.greenguide.data.query.DressCodeQuery;
import com.greenguide.dlsu.greenguide.data.query.OfficersQuery;
import com.greenguide.dlsu.greenguide.data.query.SongsAndPrayersQuery;
import com.greenguide.dlsu.greenguide.data.query.SpotQuery;
import com.greenguide.dlsu.greenguide.data.query.TipsQuery;
import com.greenguide.dlsu.greenguide.data.query.UnitQuery;

public class DatabaseHelper extends SQLiteOpenHelper{

    public static final int VERSION = 1;
    public static final String SCHEMA = "greenguide";

    private static DatabaseHelper instance = null;

    public static DatabaseHelper getInstance (Context context){
        if (instance == null){
            instance = new DatabaseHelper(context.getApplicationContext());
        }
        return instance;
    }

    public DatabaseHelper (Context context){
        super (context, SCHEMA, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
//        db.execSQL(ActivityQuery.SQL_CREATE_ENTRIES);
//        db.execSQL(DressCodeQuery.SQL_CREATE_ENTRIES);
//        db.execSQL(OfficersQuery.SQL_CREATE_ENTRIES);
//        db.execSQL(SongsAndPrayersQuery.SQL_CREATE_ENTRIES);
//        db.execSQL(SpotQuery.SQL_CREATE_ENTRIES);
        db.execSQL(TipsQuery.SQL_CREATE_ENTRIES);
        TipsQuery.insertTips(db);
//        db.execSQL(UnitQuery.SQL_CREATE_ENTRIES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
//        db.execSQL(ActivityQuery.SQL_DELETE_ENTRIES);
//        db.execSQL(DressCodeQuery.SQL_DELETE_ENTRIES);
//        db.execSQL(OfficersQuery.SQL_DELETE_ENTRIES);
//        db.execSQL(SongsAndPrayersQuery.SQL_DELETE_ENTRIES);
//        db.execSQL(SpotQuery.SQL_DELETE_ENTRIES);
        db.execSQL(TipsQuery.SQL_DELETE_ENTRIES);
//        db.execSQL(UnitQuery.SQL_DELETE_ENTRIES);
        onCreate(db);
    }

    public void insertActivity(Activity activity){
        SQLiteDatabase db = getWritableDatabase();
        db.insert(Activity.TABLE_NAME, null, ActivityQuery.insertActivity(activity));
        db.close();
    }

    public void insertDressCode(DressCode dressCode){
        SQLiteDatabase db = getWritableDatabase();
        db.insert(DressCode.TABLE_NAME, null, DressCodeQuery.insertDressCode(dressCode));
        db.close();
    }

    public void insertSongAndPrayer(SongsAndPrayers songAndPrayer){
        SQLiteDatabase db = getWritableDatabase();
        db.insert(SongsAndPrayers.TABLE_NAME, null, SongsAndPrayersQuery.insertSongsAndPrayers(songAndPrayer));
        db.close();
    }

    public void insertSpot(Spot spot){
        SQLiteDatabase db = getWritableDatabase();
        db.insert(Spot.TABLE_NAME, null, SpotQuery.insertSpot(spot));
        db.close();
    }

    public void insertUnits(Unit unit){
        SQLiteDatabase db = getWritableDatabase();
        db.insert(Unit.TABLE_NAME, null, UnitQuery.insertUnit(unit));
        db.close();
    }

    public Activity queryActivty(int id){
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.query(Activity.TABLE_NAME, null,
                Activity.COLUMN_NAME_ID + " =? ", new String[]{String.valueOf(id)},
                null, null, null);
        Activity activity = ActivityQuery.queryActivity(cursor);
        cursor.close();
        db.close();
        return activity;
    }

    public DressCode queryDressCode(int id){
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.query(DressCode.TABLE_NAME, null,
                DressCode.COLUMN_NAME_ID + " =? ", new String[]{String.valueOf(id)},
                null, null, null);
        DressCode dressCode = DressCodeQuery.queryDressCode(cursor);
        cursor.close();
        db.close();
        return dressCode;
    }

    public Officers queryOfficers(int id){
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.query(Officers.TABLE_NAME, null,
                Officers.COLUMN_NAME_ID + " =? ", new String[]{String.valueOf(id)},
                null, null, null);
        Officers officers = OfficersQuery.queryOfficers(cursor);
        cursor.close();
        db.close();
        return officers;
    }

    public SongsAndPrayers querySongsAndPrayers(int id){
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.query(SongsAndPrayers.TABLE_NAME, null,
                SongsAndPrayers.COLUMN_NAME_ID + " =? ", new String[]{String.valueOf(id)},
                null, null, null);
        SongsAndPrayers songsAndPrayers = SongsAndPrayersQuery.querySongsAndPrayers(cursor);
        cursor.close();
        db.close();
        return songsAndPrayers;
    }

    public Spot querySpot(int id){
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.query(Spot.TABLE_NAME, null,
                Spot.COLUMN_NAME_ID + " =? ", new String[]{String.valueOf(id)},
                null, null, null);
        Spot spot = SpotQuery.querySpot(cursor);
        cursor.close();
        db.close();
        return spot;
    }

    public Tips queryRandomTip(){
        SQLiteDatabase db = getReadableDatabase();
        Tips tips = TipsQuery.queryRandomTip(db);
        db.close();
        return tips;
    }

    public Unit queryUnit(int id){
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.query(Unit.TABLE_NAME , null,
                Unit.COLUMN_NAME_ID + " =? ", new String[]{String.valueOf(id)},
                null, null, null) ;

        Unit unit = UnitQuery.queryUnit(cursor);
        cursor.close();
        db.close();
        return unit;
    }
}
