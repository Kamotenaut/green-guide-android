package com.greenguide.dlsu.greenguide.section.fyi.section;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.bignerdranch.expandablerecyclerview.Model.ParentListItem;
import com.greenguide.dlsu.greenguide.adapter.expandable.ExpandableAdapter;
import com.greenguide.dlsu.greenguide.adapter.expandable.ExpandableChildListItem;
import com.greenguide.dlsu.greenguide.adapter.expandable.ExpandableParentListItem;
import com.greenguide.dlsu.greenguide.R;
import com.greenguide.dlsu.greenguide.data.model.Spot;
import com.greenguide.dlsu.greenguide.data.stored.EatingSpot;

import java.util.ArrayList;
import java.util.List;

public class EatingPlaces extends AppCompatActivity {


    private Toolbar toolbar;
    private RecyclerView recycler;
    private TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eating_places);
        recycler = (RecyclerView) findViewById(R.id.eatinglist);
        recycler.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recycler.setHasFixedSize(true);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        title = (TextView) findViewById(R.id.eatingtitle);
        String fontPath = "fonts/Montserrat-Regular.ttf";
        Typeface tf = Typeface.createFromAsset(getBaseContext().getAssets(), fontPath);
        title.setTypeface(tf);

        setTitle("");

        List<ExpandableParentListItem> expandableParentListItems = new ArrayList<>();
        List<ParentListItem> parentListItems = new ArrayList<>();

        int index = 0;
        for( Spot s : EatingSpot.getInstance().getEatingList() ){
            expandableParentListItems.add( new ExpandableParentListItem(s.getName()));
            List<ExpandableChildListItem> itemList = new ArrayList<>();
            for( String str : s.getDescription().split(";")) {
                itemList.add(new ExpandableChildListItem(str, ""));
            }
            expandableParentListItems.get(index).setChildItemList(itemList);
            parentListItems.add(expandableParentListItems.get(index));
            index++;
        }


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
