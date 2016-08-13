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
import java.util.List;

public class Csoexecom extends AppCompatActivity {


    TextView title;
    private Toolbar toolbar;
    RecyclerView recycler;
    ProfileAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_csoexecom);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setTitle("");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        title = (TextView) findViewById(R.id.csoexecomheader);
        String fontPath = "fonts/Montserrat-Regular.ttf";
        Typeface tf = Typeface.createFromAsset(getAssets(), fontPath);
        title.setTypeface(tf);


        ArrayList<Profile> list = new ArrayList();
        list.add(new Profile("John Doe", "Vice Chair", "The chairperson is the overall coordinator of the activities in CSO; enforce all policies passed by the CSO executive board and the council; and establish and promote common good relations among the different organizations of CSO. The chairperson also sets a vision and direction for the council and helps form the council leaders who then form other organization leaders of the lasallian community."));
        list.add(new Profile("John Doe", "Vice Chair", "The chairperson is the overall coordinator of the activities in CSO; enforce all policies passed by the CSO executive board and the council; and establish and promote common good relations among the different organizations of CSO. The chairperson also sets a vision and direction for the council and helps form the council leaders who then form other organization leaders of the lasallian community."));
        list.add(new Profile("John Doe", "Vice Chair", "The chairperson is the overall coordinator of the activities in CSO; enforce all policies passed by the CSO executive board and the council; and establish and promote common good relations among the different organizations of CSO. The chairperson also sets a vision and direction for the council and helps form the council leaders who then form other organization leaders of the lasallian community."));

        adapter = new ProfileAdapter(list);
        recycler = (RecyclerView) findViewById(R.id.csoexecomlist);
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
