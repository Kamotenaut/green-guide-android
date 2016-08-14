package com.greenguide.dlsu.greenguide;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.ArrayList;

public class Usgexecom extends AppCompatActivity {


    TextView title;
    private Toolbar toolbar;
    RecyclerView recycler;
    ProfileAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_usgexecom);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setTitle("");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        title = (TextView) findViewById(R.id.usgexecomheader);
        String fontPath = "fonts/Montserrat-Regular.ttf";
        Typeface tf = Typeface.createFromAsset(getAssets(), fontPath);
        title.setTypeface(tf);


        ArrayList<Profile> list = new ArrayList();
        list.add(new Profile("Zed Laqui", "USG President", "USG president is the highest position of the USG"));
        list.add(new Profile("Karl Ong", "Vice President for Internal Affairs", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec porttitor sed orci quis imperdiet. Aenean ac lorem non magna pellentesque molestie. "));
        list.add(new Profile("Reigner Sanchez", "Vice President for External Affairs", "Lorem ipsum dolor sit amet, consectetur adipiscing elit."));
        list.add(new Profile("Monica Otayza", "Executive Secretary", "Lorem ipsum dolor sit amet, consectetur adipiscing elit."));
        list.add(new Profile("Brian Chen", "Executive Treasurer", "Lorem ipsum dolor sit amet, consectetur adipiscing elit."));
        adapter = new ProfileAdapter(list);
        recycler = (RecyclerView) findViewById(R.id.usgexecomlist);
        recycler.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(getBaseContext());
        recycler.setLayoutManager(llm);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recycler.setAdapter(adapter);

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
