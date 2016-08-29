package com.greenguide.dlsu.greenguide.data.stored;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.widget.Toast;

import com.greenguide.dlsu.greenguide.data.model.Tips;

import java.util.ArrayList;

public class TipsQuery {

    private static TipsQuery instance = null;

    private ArrayList<Tips> tipList;

    private TipsQuery(){}

    public static TipsQuery getInstance(){
        if (instance == null){
            instance = new TipsQuery();
        }
        return instance;
    }

    private void insertTips(){
        String[] strList = new String[]{
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

        tipList = new ArrayList<>();
        for (String tip: strList) {
            tipList.add( new Tips( tipList.size() + 1 , tip ) );
        }

    }

    public ArrayList<Tips> getTipList(){
        return tipList;
    }
}
