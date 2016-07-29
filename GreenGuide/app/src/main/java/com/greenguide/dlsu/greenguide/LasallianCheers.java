package com.greenguide.dlsu.greenguide;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class LasallianCheers extends AppCompatActivity {

    TextView title;
    TextView content;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_lasallian_cheers);
        setTitle("Lasallian Cheers");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        title = (TextView) findViewById(R.id.cheertitle);
        content = (TextView) findViewById(R.id.cheertxt);
        String fontPath = "fonts/Montserrat-Regular.ttf";
        Typeface tf = Typeface.createFromAsset(getAssets(), fontPath);

        title.setTypeface(tf);
        content.setTypeface(tf);

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
