package com.greenguide.dlsu.greenguide.section.fyi.section;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.greenguide.dlsu.greenguide.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tips extends AppCompatActivity {

    private Toolbar toolbar;
    TextView title;
    TextView header;
    TextView content;
    Button tipbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_tips);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setTitle("");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        header = (TextView) findViewById(R.id.tipsheader);
        title = (TextView) findViewById(R.id.tipstitle);
        content = (TextView) findViewById(R.id.tipstxt);
        tipbtn = (Button) findViewById(R.id.tipbtn);
        String fontPath = "fonts/Montserrat-Regular.ttf";
        Typeface tf = Typeface.createFromAsset(getAssets(), fontPath);
        header.setTypeface(tf);
        title.setTypeface(tf);
        content.setTypeface(tf);

        final List<String> list = new ArrayList();
        list.add("You must always visibly wear your ID whenever you’re inside the campus.");
        list.add("You don’t always have to buy a new book. You can borrow from the Library or avail of the Pahiram Libro service of the USG.");
        list.add("You can also buy second hand books from the Buy Back Books service of DLSU SCOOP.");
        list.add("Be informed. Familiarize yourself with the different University policies by reading the Student Handbook.");
        list.add("“H” in your EAF mean Huwebes/Thursday.");
        list.add("Maximize our computer laboratories and libraries.");
        list.add("Make sure to give leeway for elevator traffic if you have classes in Br. Andrew Gonzalez Hall.");
        list.add("Try the different food served by student entrepreneurs in Animo BIZ in the Manila Campus or The Entrep Hub in Laguna Campus.");
        list.add("Join student organizations. It’s a great way for your to meet new people.");
        list.add("As you start off college, try to get really good grades so that you can become a Dean’s Lister.");
        Random rand = new Random();
        int num = rand.nextInt(list.size());
        title.setText("Tip #"+(num+1));
        content.setText(list.get(num));

        tipbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rand = new Random();
                int num = rand.nextInt(list.size());
                title.setText("Tip #"+(num+1));
                content.setText(list.get(num));

            }
        });


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
