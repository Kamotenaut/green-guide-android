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
import com.greenguide.dlsu.greenguide.data.model.NameTag;
import com.greenguide.dlsu.greenguide.data.stored.SAOOrganizations;

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

        expandableParentListItems.add(new ExpandableParentListItem("Culture and Arts Office (CAO)"));
        List<ExpandableChildListItem> childItemList = new ArrayList<>();
        for(NameTag name : SAOOrganizations.getInstance().getCao()){
            childItemList.add(new ExpandableChildListItem(name.getName(), ""));
        }
        expandableParentListItems.get(0).setChildItemList(childItemList);
        parentListItems.add(expandableParentListItems.get(0));

        expandableParentListItems.add(new ExpandableParentListItem("Student Discipline Formation Office (SDFO)"));
        List<ExpandableChildListItem> childItemList1 = new ArrayList<>();
        for(NameTag name : SAOOrganizations.getInstance().getSdfo()){
            childItemList1.add(new ExpandableChildListItem(name.getName(), ""));
        }
        expandableParentListItems.get(1).setChildItemList(childItemList1);
        parentListItems.add(expandableParentListItems.get(1));


        expandableParentListItems.add(new ExpandableParentListItem("Office of Counseling and Career Services (OCCS)"));
        List<ExpandableChildListItem> childItemList2 = new ArrayList<>();
        for(NameTag name : SAOOrganizations.getInstance().getOccs()){
            childItemList2.add(new ExpandableChildListItem(name.getName(), ""));
        }
        expandableParentListItems.get(2).setChildItemList(childItemList2);
        parentListItems.add(expandableParentListItems.get(2));

        expandableParentListItems.add(new ExpandableParentListItem("Office of Sports Development"));
        List<ExpandableChildListItem> childItemList3 = new ArrayList<>();
        for(NameTag name : SAOOrganizations.getInstance().getOsd()){
            childItemList3.add(new ExpandableChildListItem(name.getName(), ""));
        }
        expandableParentListItems.get(3).setChildItemList(childItemList3);
        parentListItems.add(expandableParentListItems.get(3));

        expandableParentListItems.add(new ExpandableParentListItem("Student Leadership, Involvement, Formation & Empowerment (SLIFE)"));
        List<ExpandableChildListItem> childItemList4 = new ArrayList<>();
        for(NameTag name : SAOOrganizations.getInstance().getSlife()){
            childItemList4.add(new ExpandableChildListItem(name.getName(), ""));
        }
        expandableParentListItems.get(4).setChildItemList(childItemList4);
        parentListItems.add(expandableParentListItems.get(4));

        expandableParentListItems.add(new ExpandableParentListItem("Student Media Office"));
        List<ExpandableChildListItem> childItemList5 = new ArrayList<>();
        for(NameTag name : SAOOrganizations.getInstance().getSmo()){
            childItemList5.add(new ExpandableChildListItem(name.getName(), ""));
        }
        expandableParentListItems.get(5).setChildItemList(childItemList5);
        parentListItems.add(expandableParentListItems.get(5));


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
