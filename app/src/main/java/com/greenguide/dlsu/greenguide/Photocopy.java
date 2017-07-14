package com.greenguide.dlsu.greenguide;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.bignerdranch.expandablerecyclerview.Model.ParentListItem;
import com.greenguide.dlsu.greenguide.data.model.Spot;
import com.greenguide.dlsu.greenguide.data.stored.PrintingSpot;

import java.util.ArrayList;
import java.util.List;


public class Photocopy extends AppCompatActivity {

    private Toolbar toolbar;
    private RecyclerView recycler;
    private TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photocopy);
        recycler = (RecyclerView) findViewById(R.id.photocopylist);
        recycler.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recycler.setHasFixedSize(true);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        title = (TextView) findViewById(R.id.photocopytitle);
        String fontPath = "fonts/Montserrat-Regular.ttf";
        Typeface tf = Typeface.createFromAsset(getBaseContext().getAssets(), fontPath);
        title.setTypeface(tf);

        setTitle("");

        List<ExpandableParentListItem> expandableParentListItems = new ArrayList<>();
        List<ParentListItem> parentListItems = new ArrayList<>();
        expandableParentListItems.add(new ExpandableParentListItem("Manila Campus"));
        List<ExpandableChildListItem> itemList = new ArrayList<>();
        for(Spot s : PrintingSpot.getInstance().getPhotocopyMnlList()){
            itemList.add( new ExpandableChildListItem(s.getName(), s.getDescription()));
        }
        expandableParentListItems.get(0).setChildItemList(itemList);
        parentListItems.add(expandableParentListItems.get(0));

        expandableParentListItems.add(new ExpandableParentListItem("Laguna Campus"));
        List<ExpandableChildListItem> itemList1 = new ArrayList<>();
        for(Spot s : PrintingSpot.getInstance().getPhotocopyLagunaList()){
            itemList1.add( new ExpandableChildListItem(s.getName(), s.getDescription()));
        }
        expandableParentListItems.get(1).setChildItemList(itemList1);
        parentListItems.add(expandableParentListItems.get(1));



        ExpandableAdapter adapter = new ExpandableAdapter(getBaseContext(), parentListItems);
        recycler.setAdapter(adapter);


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
