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
import com.greenguide.dlsu.greenguide.data.model.USGOfficers;
import com.greenguide.dlsu.greenguide.data.model.WifiSpot;

import com.greenguide.dlsu.greenguide.data.query.ActivityQuery;
import com.greenguide.dlsu.greenguide.data.query.DressCodeQuery;
import com.greenguide.dlsu.greenguide.data.query.OfficersQuery;
import com.greenguide.dlsu.greenguide.data.query.SongsAndPrayersQuery;
import com.greenguide.dlsu.greenguide.data.query.SpotQuery;
import com.greenguide.dlsu.greenguide.data.query.TipsQuery;
import com.greenguide.dlsu.greenguide.data.query.USGOfficersQuery;
import com.greenguide.dlsu.greenguide.data.query.WifiSpotQuery;

public class DatabaseHelper extends SQLiteOpenHelper{

    public static final int VERSION = 0;
    public static final String SCHEMA = "greenguide";

    public DatabaseHelper (Context context){
        super (context, SCHEMA, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(ActivityQuery.SQL_CREATE_ENTRIES);
        db.execSQL(DressCodeQuery.SQL_CREATE_ENTRIES);
        db.execSQL(OfficersQuery.SQL_CREATE_ENTRIES);
        db.execSQL(SongsAndPrayersQuery.SQL_CREATE_ENTRIES);
        db.execSQL(SpotQuery.SQL_CREATE_ENTRIES);
        db.execSQL(TipsQuery.SQL_CREATE_ENTRIES);
        db.execSQL(USGOfficersQuery.SQL_CREATE_ENTRIES);
        db.execSQL(WifiSpotQuery.SQL_CREATE_ENTRIES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(ActivityQuery.SQL_DELETE_ENTRIES);
        db.execSQL(DressCodeQuery.SQL_DELETE_ENTRIES);
        db.execSQL(OfficersQuery.SQL_DELETE_ENTRIES);
        db.execSQL(SongsAndPrayersQuery.SQL_DELETE_ENTRIES);
        db.execSQL(SpotQuery.SQL_DELETE_ENTRIES);
        db.execSQL(TipsQuery.SQL_DELETE_ENTRIES);
        db.execSQL(USGOfficersQuery.SQL_DELETE_ENTRIES);
        db.execSQL(WifiSpotQuery.SQL_DELETE_ENTRIES);
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

    public void insertTips(Tips tips){
        SQLiteDatabase db = getWritableDatabase();
        db.insert(Tips.TABLE_NAME, null, TipsQuery.insertTips(tips));
        db.close();
    }

    public void insertUSGOfficers(USGOfficers usgofficers){
        SQLiteDatabase db = getWritableDatabase();
        db.insert(USGOfficers.TABLE_NAME, null, USGOfficersQuery.insertUSGOfficers(usgofficers));
        db.close();
    }

    public void insertWifiSpot(WifiSpot wifispot){
        SQLiteDatabase db = getWritableDatabase();
        db.insert(WifiSpot.TABLE_NAME, null, WifiSpotQuery.insertWifiSpot(wifispot));
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

    public Tips queryTips(int id){
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.query(Tips.TABLE_NAME, null,
                Tips.COLUMN_NAME_ID + " =? ", new String[]{String.valueOf(id)},
                null, null, null);
        Tips tips = TipsQuery.queryTips(cursor);
        cursor.close();
        db.close();
        return tips;
    }

    public USGOfficers queryUSGOfficers(int id){
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.query(USGOfficers.TABLE_NAME, null,
                USGOfficers.COLUMN_NAME_ID + " =? ", new String[]{String.valueOf(id)},
                null, null, null);
        USGOfficers usgofficers = USGOfficersQuery.queryUSGOfficers(cursor);
        cursor.close();
        db.close();
        return usgofficers;
    }

    public WifiSpot queryWifiSpot(int id){
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.query(WifiSpot.TABLE_NAME, null,
                WifiSpot.COLUMN_NAME_ID + " =? ", new String[]{String.valueOf(id)},
                null, null, null);
        WifiSpot wifispot = WifiSpotQuery.queryWifiSpot(cursor);
        cursor.close();
        db.close();
        return wifispot;
    }
}
