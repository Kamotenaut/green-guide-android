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

public class ProgramsServices extends AppCompatActivity {


    TextView title;
    private Toolbar toolbar;
    RecyclerView recycler;
    OrgAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_programs_services);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setTitle("");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        title = (TextView) findViewById(R.id.progservexecomheader);
        String fontPath = "fonts/Montserrat-Regular.ttf";
        Typeface tf = Typeface.createFromAsset(getAssets(), fontPath);
        title.setTypeface(tf);


        ArrayList<Org> list = new ArrayList();
        list.add(new Org("Locker Rentals", "A program allows students to rent lockers during the whole term. Locker reservation and confirmation is done via lockerrentals. dlsu-usg.com during specified dates announced by the USG."));
        list.add(new Org("Pahiram Libro", "A program that allows students to borrow textbooks for one whole term, free of charge. Book reservation is done via libro.dlsu-usg.com during specified dates announced by the USG."));
        list.add(new Org("Pahiram Payong", "A program that enables students to borrow an umbrella, free of charge. Umbrella stations are located at North Gate, Agno Gate and Br. Andrew Gonzales, FSC Hall in the Taft Campus and East Wing Canopy in the Science and Technology Complex"));

        adapter = new OrgAdapter(list);
        recycler = (RecyclerView) findViewById(R.id.progservlist);
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
