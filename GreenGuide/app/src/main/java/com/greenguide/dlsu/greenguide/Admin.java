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

import java.util.ArrayList;
import java.util.List;

public class Admin extends AppCompatActivity {



    private Toolbar toolbar;
    private RecyclerView recycler;
    private TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_offices);
        recycler = (RecyclerView) findViewById(R.id.adminlist);
        recycler.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recycler.setHasFixedSize(true);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        title = (TextView) findViewById(R.id.admintitle);
        String fontPath = "fonts/Montserrat-Regular.ttf";
        Typeface tf = Typeface.createFromAsset(getBaseContext().getAssets(), fontPath);
        title.setTypeface(tf);

        setTitle("");

        List<ExpandableParentListItem> expandableParentListItems = new ArrayList<>();
        List<ParentListItem> parentListItems = new ArrayList<>();
        expandableParentListItems.add(new ExpandableParentListItem("Central Admin Offices"));
        List<ExpandableChildListItem> childItemList = new ArrayList<>();
        childItemList.add(new ExpandableChildListItem("Integrated Office of the President and Chancellor", ""));
        childItemList.add(new ExpandableChildListItem("Office of the Vice Chancellor for Academics (VCA)", ""));
        expandableParentListItems.get(0).setChildItemList(childItemList);
        parentListItems.add(expandableParentListItems.get(0));

        expandableParentListItems.add(new ExpandableParentListItem("Integrated Office of the President & Chancellor"));
        List<ExpandableChildListItem> childItemList2 = new ArrayList<>();
        childItemList2.add(new ExpandableChildListItem("Building 1", "2nd floor"));
        expandableParentListItems.get(1).setChildItemList(childItemList2);
        parentListItems.add(expandableParentListItems.get(1));

        expandableParentListItems.add(new ExpandableParentListItem("Office of the Vice Chancellor for Academics"));
        List<ExpandableChildListItem> childItemList3 = new ArrayList<>();
        childItemList3.add(new ExpandableChildListItem("Building 1", "2nd floor"));
        expandableParentListItems.get(2).setChildItemList(childItemList3);
        parentListItems.add(expandableParentListItems.get(2));
        expandableParentListItems.add(new ExpandableParentListItem("Office of the Vice Chancellor for Research & Innovation"));
        List<ExpandableChildListItem> childItemList4 = new ArrayList<>();
        childItemList4.add(new ExpandableChildListItem("Building 1", "2nd floor"));
        expandableParentListItems.get(3).setChildItemList(childItemList4);
        parentListItems.add(expandableParentListItems.get(3));
        expandableParentListItems.add(new ExpandableParentListItem("Office of the Vice Chancellor for La Sallian Mission"));
        List<ExpandableChildListItem> childItemList5 = new ArrayList<>();
        childItemList5.add(new ExpandableChildListItem("Building 1", "2nd floor"));
        expandableParentListItems.get(4).setChildItemList(childItemList5);
        parentListItems.add(expandableParentListItems.get(4));


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
