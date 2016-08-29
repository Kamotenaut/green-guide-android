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
//        expandableParentListItems.add(new ExpandableParentListItem("EGI Tower"));
//        List<ExpandableChildListItem> childItemList = new ArrayList<>();
//        childItemList.add(new ExpandableChildListItem("Wai Ying", "Wai Ying serves affordable Chinese food. Found in the 1st floor."));
//        childItemList.add(new ExpandableChildListItem("Orange and Spices", "Orange and Spices offer a variety of homemade dishes. Found at the 1st floor."));
//        expandableParentListItems.get(0).setChildItemList(childItemList);
//        parentListItems.add(expandableParentListItems.get(0));
//
//        expandableParentListItems.add(new ExpandableParentListItem("Agno"));
//        List<ExpandableChildListItem> childItemList2 = new ArrayList<>();
//        childItemList2.add(new ExpandableChildListItem("Ate Rica's Bacsilogan", "The iconic Bacsilog that every Lasallian loves."));
//        expandableParentListItems.get(1).setChildItemList(childItemList2);
//        parentListItems.add(expandableParentListItems.get(1));


        int index = 0;
        for(String s : EatingSpot.getInstance().getLocationList() ){
            expandableParentListItems.add( new ExpandableParentListItem(s));
            List<ExpandableChildListItem> itemList = new ArrayList<>();
            for(Spot spot : EatingSpot.getInstance().getEatingList(s)){
                itemList.add(new ExpandableChildListItem(spot.getName(), spot.getDescription()));
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
