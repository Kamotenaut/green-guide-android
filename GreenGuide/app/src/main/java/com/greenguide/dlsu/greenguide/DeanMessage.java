package com.greenguide.dlsu.greenguide;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import com.greenguide.dlsu.greenguide.data.DatabaseHelper;

public class DeanMessage extends AppCompatActivity {

    private Button btnbegin;
    private TextView deantxt;
    private TextView messagetxt;
    private TextView welcometxt;
    private TextView titletxt;

    final static String KEY_MESSAGE_IS_READ = "message_is_read";
    final static String DEAN_PREF = "dean_message_pref";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dean_message);

        String fontPath = "fonts/Montserrat-Regular.ttf";
        SharedPreferences sharedPreferences = getSharedPreferences(DEAN_PREF, Context.MODE_PRIVATE);

        messagetxt = (TextView) findViewById(R.id.messagetxt);
        welcometxt = (TextView) findViewById(R.id.welcometxt);
        deantxt = (TextView) findViewById(R.id.deantxt);
        titletxt= (TextView) findViewById(R.id.titletxt);
        Typeface tf = Typeface.createFromAsset(getAssets(), fontPath);

        messagetxt.setTypeface(tf);
        welcometxt.setTypeface(tf);
        deantxt.setTypeface(tf);
        titletxt.setTypeface(tf);

        String message = sharedPreferences.getString(KEY_MESSAGE_IS_READ, null);
        if(message == null) {
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString(KEY_MESSAGE_IS_READ, "true");
            editor.commit();
        }
        else {
            messagetxt.setText(DatabaseHelper.getInstance(getBaseContext()).queryRandomTip().getDescription());
            deantxt.setText("");
            titletxt.setText("");
        }


        setStatusBarTranslucent(true);
        btnbegin = (Button)findViewById(R.id.btnbegin);
        btnbegin.setTypeface(tf);

        btnbegin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO disable dean's message on startup
                finish();
            }
        });

    }

    protected void setStatusBarTranslucent(boolean makeTranslucent) {
        if (makeTranslucent) {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        } else {
            getWindow().clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }
    }
}
