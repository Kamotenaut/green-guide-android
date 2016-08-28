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

public class StudentAffairs extends AppCompatActivity {

    private Toolbar toolbar;
    private RecyclerView recycler;
    private TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_affairs);
        recycler = (RecyclerView) findViewById(R.id.studentaffairslist);
        recycler.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recycler.setHasFixedSize(true);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        title = (TextView) findViewById(R.id.studentaffairstitle);
        String fontPath = "fonts/Montserrat-Regular.ttf";
        Typeface tf = Typeface.createFromAsset(getBaseContext().getAssets(), fontPath);
        title.setTypeface(tf);

        setTitle("");

        List<ExpandableParentListItem> expandableParentListItems = new ArrayList<>();
        List<ParentListItem> parentListItems = new ArrayList<>();
        expandableParentListItems.add(new ExpandableParentListItem("Center for Social Concern and Action (COSCA)"));
        List<ExpandableChildListItem> childItemList = new ArrayList<>();
        childItemList.add(new ExpandableChildListItem("Center for Social Concern and Action (COSCA-LOVE)", ""));
        childItemList.add(new ExpandableChildListItem("LasALLIANCE for Peace (LFP)", ""));
        expandableParentListItems.get(0).setChildItemList(childItemList);
        parentListItems.add(expandableParentListItems.get(0));

        expandableParentListItems.add(new ExpandableParentListItem("Culture and Arts Office (CAO)"));
        List<ExpandableChildListItem> childItemList2 = new ArrayList<>();
        childItemList2.add(new ExpandableChildListItem("Building 1", "2nd floor"));
        expandableParentListItems.get(1).setChildItemList(childItemList2);
        parentListItems.add(expandableParentListItems.get(1));

        expandableParentListItems.add(new ExpandableParentListItem("Student Discipline Formation Office (SDFO)"));
        List<ExpandableChildListItem> childItemList3 = new ArrayList<>();
        childItemList3.add(new ExpandableChildListItem("Building 1", "2nd floor"));
        expandableParentListItems.get(2).setChildItemList(childItemList3);
        parentListItems.add(expandableParentListItems.get(2));

        expandableParentListItems.add(new ExpandableParentListItem("Lasallian Pastoral Office (LSPO)"));
        List<ExpandableChildListItem> childItemList4 = new ArrayList<>();
        childItemList4.add(new ExpandableChildListItem("Building 1", "2nd floor"));
        expandableParentListItems.get(3).setChildItemList(childItemList4);
        parentListItems.add(expandableParentListItems.get(3));

        expandableParentListItems.add(new ExpandableParentListItem("Office of Counseling and Career Services (OCCS)"));
        List<ExpandableChildListItem> childItemList5 = new ArrayList<>();
        childItemList5.add(new ExpandableChildListItem("Building 1", "2nd floor"));
        expandableParentListItems.get(4).setChildItemList(childItemList5);
        parentListItems.add(expandableParentListItems.get(4));

        expandableParentListItems.add(new ExpandableParentListItem("Office of Sports Development"));
        List<ExpandableChildListItem> childItemList6 = new ArrayList<>();
        childItemList6.add(new ExpandableChildListItem("Building 1", "2nd floor"));
        expandableParentListItems.get(5).setChildItemList(childItemList5);
        parentListItems.add(expandableParentListItems.get(5));

        expandableParentListItems.add(new ExpandableParentListItem("Student Leadership, Involvement, Formation & Empowerment (SLIFE)"));
        List<ExpandableChildListItem> childItemList7 = new ArrayList<>();
        childItemList7.add(new ExpandableChildListItem("Building 1", "2nd floor"));
        expandableParentListItems.get(6).setChildItemList(childItemList5);
        parentListItems.add(expandableParentListItems.get(6));

        expandableParentListItems.add(new ExpandableParentListItem("Student Media Office"));
        List<ExpandableChildListItem> childItemList8 = new ArrayList<>();
        childItemList8.add(new ExpandableChildListItem("Building 1", "2nd floor"));
        expandableParentListItems.get(7).setChildItemList(childItemList5);
        parentListItems.add(expandableParentListItems.get(7));


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
