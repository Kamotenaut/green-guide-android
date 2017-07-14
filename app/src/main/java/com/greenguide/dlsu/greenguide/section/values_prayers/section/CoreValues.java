package com.greenguide.dlsu.greenguide.section.values_prayers.section;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.greenguide.dlsu.greenguide.R;

public class CoreValues extends AppCompatActivity {

    private Toolbar toolbar;
    private TextView titletxt1;
    private TextView titletxt2;
    private TextView titletxt3;
    private TextView txt1;
    private TextView txt2;
    private TextView txt3;
    private TextView header;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_core_values);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        header = (TextView) findViewById(R.id.vpheader);
        titletxt1 = (TextView) findViewById(R.id.vptitle1);
        titletxt2 = (TextView) findViewById(R.id.vptitle2);
        titletxt3 = (TextView) findViewById(R.id.vptitle3);
        txt1 = (TextView) findViewById(R.id.vptxt1);
        txt2 = (TextView) findViewById(R.id.vptxt2);
        txt3 = (TextView) findViewById(R.id.vptxt3);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("");
        String fontPath = "fonts/Montserrat-Regular.ttf";
        Typeface tf = Typeface.createFromAsset(getBaseContext().getAssets(), fontPath);
        header.setTypeface(tf);
        titletxt1.setTypeface(tf);
        titletxt2.setTypeface(tf);
        titletxt3.setTypeface(tf);
        //txt1.setTypeface(tf);
        //txt2.setTypeface(tf);
        //txt3.setTypeface(tf);

    }


    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
