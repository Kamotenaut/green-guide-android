package com.greenguide.dlsu.greenguide;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

public class AboutCso extends AppCompatActivity {

    private Toolbar toolbar;
    TextView whatcso;
    TextView visioncso;
    TextView missioncso;
    TextView header;
    TextView orgscso;
    TextView orgscsotxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_about_cso);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setTitle("");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        header = (TextView) findViewById(R.id.aboutcsoheader);
        whatcso = (TextView) findViewById(R.id.whatcso);
        visioncso = (TextView) findViewById(R.id.visioncso);
        missioncso = (TextView) findViewById(R.id.missioncso);
        orgscso = (TextView) findViewById(R.id.orgscso);
        orgscsotxt = (TextView) findViewById(R.id.orgscsotxt);
        String fontPath = "fonts/Montserrat-Regular.ttf";
        Typeface tf = Typeface.createFromAsset(getAssets(), fontPath);
        header.setTypeface(tf);
        whatcso.setTypeface(tf);
        visioncso.setTypeface(tf);
        missioncso.setTypeface(tf);
        orgscso.setTypeface(tf);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                // API 5+ solution
                onBackPressed();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
