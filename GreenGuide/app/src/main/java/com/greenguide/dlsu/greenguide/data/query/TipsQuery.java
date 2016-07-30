package com.greenguide.dlsu.greenguide.data.query;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.widget.Toast;

import com.greenguide.dlsu.greenguide.data.model.Tips;

public class TipsQuery {

    private static final String TEXT_TYPE = " STRING";
    private static final String COMMA_SEP = ",";

    public static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + Tips.TABLE_NAME + " (" +
            Tips.COLUMN_NAME_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
            Tips.COLUMN_NAME_DESC + TEXT_TYPE +
            " )";

    public static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + Tips.TABLE_NAME;

    public static void insertTips(SQLiteDatabase db){
        String[] tipList = new String[]{
            "Always visibly wear your ID whenever you’re inside the campus.",
            "You don’t always have to buy a new book, you can borrow from the Library or avail of the Pahiram Libro service of the USG.",
            "You can also buy second hand books from the Buy Back Books service of DLSU SCOOP.",
            "Familiarize yourself with the different policies of the school so that you can avoid having any offenses.",
            "“H” in your EAF mean Huwebes/ Thursday.')",
            "Maximize our computer laboratories and libraries.')",
            "For your classes, always make sure that you give leeway for elevator traffic in Andrew Building.",
            "Try the different food served by student entrepreneurs in Animo BIZ in the Taft Campus or The Entrep Hub in STC.",
            "Join student organizations, it’s a great way for your to meet new people.",
            "As you start off college, try to get really good grades so that you can become a Dean’s Lister."
        };

        for (String tip: tipList) {
            ContentValues values = new ContentValues();
            values.put(Tips.COLUMN_NAME_DESC, tip);
            db.insert(Tips.TABLE_NAME, null, values);
        }

    }

    public static Tips queryRandomTip(SQLiteDatabase db){
        Tips tips = new Tips();
        //Cursor cursor = sqLiteDatabase.query(tableName, tableColumns, whereClause, whereArgs, groupBy, having, orderBy);
        Cursor cursor = db.query(Tips.TABLE_NAME, null, null, null, null, null, "RANDOM() LIMIT 1");

        if(cursor.moveToFirst()){
            tips.setDescription(cursor.getString(cursor.getColumnIndex(Tips.COLUMN_NAME_DESC)));
        }

        return tips;
    }

}
