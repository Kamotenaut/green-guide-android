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
import com.greenguide.dlsu.greenguide.data.model.Officers;
import com.greenguide.dlsu.greenguide.data.stored.AdministrativeOffices;

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

        expandableParentListItems.add(new ExpandableParentListItem("Central Administration"));
        List<ExpandableChildListItem> childItemList = new ArrayList<>();
        for( Officers o : AdministrativeOffices.getInstance().getAdmin()){
            childItemList.add( new ExpandableChildListItem(o.getPosition(), o.getName()));
        }
        expandableParentListItems.get(0).setChildItemList(childItemList);
        parentListItems.add(expandableParentListItems.get(0));

        int index = 0;
        for(String s : AdministrativeOffices.getInstance().getColleges()){
            expandableParentListItems.add(new ExpandableParentListItem(s));
            index++;
            List<ExpandableChildListItem> itemList = new ArrayList<>();
            for(Officers o : AdministrativeOffices.getInstance().getOfficers(s)){
                itemList.add(new ExpandableChildListItem(o.getPosition(), o.getName()));
            }
            expandableParentListItems.get(index).setChildItemList(itemList);
            parentListItems.add(expandableParentListItems.get(index));
        }


        ExpandableAltAdapter adapter = new ExpandableAltAdapter(getBaseContext(), parentListItems);
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
