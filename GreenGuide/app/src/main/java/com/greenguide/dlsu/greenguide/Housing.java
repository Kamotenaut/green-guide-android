package com.greenguide.dlsu.greenguide;

import android.graphics.Typeface;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.bignerdranch.expandablerecyclerview.Model.ParentListItem;
import com.greenguide.dlsu.greenguide.data.model.Address;
import com.greenguide.dlsu.greenguide.data.stored.HousingFacilities;

import java.util.ArrayList;
import java.util.List;

public class Housing extends AppCompatActivity {

    private Toolbar toolbar;
    private TextView title;
    private RecyclerView recycler;
    private ExpandableAltAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_housing);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        recycler = (RecyclerView) findViewById(R.id.housinglist);
        recycler.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(getBaseContext());
        recycler.setLayoutManager(llm);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        String fontPath = "fonts/Montserrat-Regular.ttf";
        Typeface tf = Typeface.createFromAsset(getBaseContext().getAssets(), fontPath);
        title = (TextView) findViewById(R.id.housingtitle);
        title.setTypeface(tf);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        setTitle("");

        List<ExpandableParentListItem> expandableParentListItems = new ArrayList<>();
        List<ParentListItem> parentListItems = new ArrayList<>();
//        expandableParentListItems.add(new ExpandableParentListItem("University Pad"));
//        List<ExpandableChildListItem> childItemList = new ArrayList<>();
//        childItemList.add(new ExpandableChildListItem("Address","912 P. Ocampo St. Malate, Manila"));
//        childItemList.add(new ExpandableChildListItem("Contact Person","Ms. Marilyn Avila"));
//        childItemList.add(new ExpandableChildListItem("Contact Number","525-0001\n0917-566- 3795"));
//        childItemList.add(new ExpandableChildListItem("Website/Email","www.universitypad.com.ph\ninfo@universitypad.com.ph"));
//        expandableParentListItems.get(0).setChildItemList(childItemList);
//        parentListItems.add(expandableParentListItems.get(0));
//
//        expandableParentListItems.add(new ExpandableParentListItem("Torre Lorenzo 2"));
//        List<ExpandableChildListItem> childItemList1 = new ArrayList<>();
//        childItemList1.add(new ExpandableChildListItem("Address","912 P. Ocampo St. Malate, Manila"));
//        childItemList1.add(new ExpandableChildListItem("Contact Person","Ms. Marilyn Avila"));
//        childItemList1.add(new ExpandableChildListItem("Contact Number","525-0001\n0917-566- 3795"));
//        childItemList1.add(new ExpandableChildListItem("Website/Email","www.universitypad.com.ph\ninfo@universitypad.com.ph"));
//        expandableParentListItems.get(1).setChildItemList(childItemList1);
//        parentListItems.add(expandableParentListItems.get(1));
//
//        expandableParentListItems.add(new ExpandableParentListItem("WWW Residences"));
//        List<ExpandableChildListItem> childItemList2 = new ArrayList<>();
//        childItemList2.add(new ExpandableChildListItem("Address","912 P. Ocampo St. Malate, Manila"));
//        childItemList2.add(new ExpandableChildListItem("Contact Person","Ms. Marilyn Avila"));
//        childItemList2.add(new ExpandableChildListItem("Contact Number","525-0001\n0917-566- 3795"));
//        childItemList2.add(new ExpandableChildListItem("Website/Email","www.universitypad.com.ph\ninfo@universitypad.com.ph"));
//        expandableParentListItems.get(2).setChildItemList(childItemList1);
//        parentListItems.add(expandableParentListItems.get(2));
//
//        expandableParentListItems.add(new ExpandableParentListItem("Bellagio"));
//        List<ExpandableChildListItem> childItemList3 = new ArrayList<>();
//        childItemList3.add(new ExpandableChildListItem("Address","912 P. Ocampo St. Malate, Manila"));
//        childItemList3.add(new ExpandableChildListItem("Contact Person","Ms. Marilyn Avila"));
//        childItemList3.add(new ExpandableChildListItem("Contact Number","525-0001\n0917-566- 3795"));
//        childItemList3.add(new ExpandableChildListItem("Website/Email","www.universitypad.com.ph\ninfo@universitypad.com.ph"));
//        expandableParentListItems.get(3).setChildItemList(childItemList1);
//        parentListItems.add(expandableParentListItems.get(3));
//
//        expandableParentListItems.add(new ExpandableParentListItem("University College Residence"));
//        List<ExpandableChildListItem> childItemList4 = new ArrayList<>();
//        childItemList4.add(new ExpandableChildListItem("Address","912 P. Ocampo St. Malate, Manila"));
//        childItemList4.add(new ExpandableChildListItem("Contact Person","Ms. Marilyn Avila"));
//        childItemList4.add(new ExpandableChildListItem("Contact Number","525-0001\n0917-566- 3795"));
//        childItemList4.add(new ExpandableChildListItem("Website/Email","www.universitypad.com.ph\ninfo@universitypad.com.ph"));
//        expandableParentListItems.get(4).setChildItemList(childItemList1);
//        parentListItems.add(expandableParentListItems.get(4));
//
//        expandableParentListItems.add(new ExpandableParentListItem("Residencia De Dios"));
//        List<ExpandableChildListItem> childItemList5 = new ArrayList<>();
//        childItemList5.add(new ExpandableChildListItem("Address","912 P. Ocampo St. Malate, Manila"));
//        childItemList5.add(new ExpandableChildListItem("Contact Person","Ms. Marilyn Avila"));
//        childItemList5.add(new ExpandableChildListItem("Contact Number","525-0001\n0917-566- 3795"));
//        childItemList5.add(new ExpandableChildListItem("Website/Email","www.universitypad.com.ph\ninfo@universitypad.com.ph"));
//        expandableParentListItems.get(5).setChildItemList(childItemList1);
//        parentListItems.add(expandableParentListItems.get(5));
//
//        expandableParentListItems.add(new ExpandableParentListItem("Tahilan Residence and Study Center"));
//        List<ExpandableChildListItem> childItemList6 = new ArrayList<>();
//        childItemList6.add(new ExpandableChildListItem("Address","912 P. Ocampo St. Malate, Manila"));
//        childItemList6.add(new ExpandableChildListItem("Contact Person","Ms. Marilyn Avila"));
//        childItemList6.add(new ExpandableChildListItem("Contact Number","525-0001\n0917-566- 3795"));
//        childItemList6.add(new ExpandableChildListItem("Website/Email","www.universitypad.com.ph\ninfo@universitypad.com.ph"));
//        expandableParentListItems.get(6).setChildItemList(childItemList1);
//        parentListItems.add(expandableParentListItems.get(6));
//
//        expandableParentListItems.add(new ExpandableParentListItem("@HomeDormtel"));
//        List<ExpandableChildListItem> childItemList7 = new ArrayList<>();
//        childItemList7.add(new ExpandableChildListItem("Address","912 P. Ocampo St. Malate, Manila"));
//        childItemList7.add(new ExpandableChildListItem("Contact Person","Ms. Marilyn Avila"));
//        childItemList7.add(new ExpandableChildListItem("Contact Number","525-0001\n0917-566- 3795"));
//        childItemList7.add(new ExpandableChildListItem("Website/Email","www.universitypad.com.ph\ninfo@universitypad.com.ph"));
//        expandableParentListItems.get(7).setChildItemList(childItemList1);
//        parentListItems.add(expandableParentListItems.get(7));
//
//        expandableParentListItems.add(new ExpandableParentListItem("One Archer’s Place"));
//        List<ExpandableChildListItem> childItemList8 = new ArrayList<>();
//        childItemList8.add(new ExpandableChildListItem("Address","912 P. Ocampo St. Malate, Manila"));
//        childItemList8.add(new ExpandableChildListItem("Contact Person","Ms. Marilyn Avila"));
//        childItemList8.add(new ExpandableChildListItem("Contact Number","525-0001\n0917-566- 3795"));
//        childItemList8.add(new ExpandableChildListItem("Website/Email","www.universitypad.com.ph\ninfo@universitypad.com.ph"));
//        expandableParentListItems.get(8).setChildItemList(childItemList1);
//        parentListItems.add(expandableParentListItems.get(8));

        int index = 0;
        for(Address add : HousingFacilities.getInstance().getHousingList()){
            expandableParentListItems.add(new ExpandableParentListItem(add.getName()));
            List<ExpandableChildListItem> itemList = new ArrayList<>();
            itemList.add(new ExpandableChildListItem("Address", add.getAddress()));
            itemList.add(new ExpandableChildListItem("Contact Person", add.getContactPerson()));
            itemList.add(new ExpandableChildListItem("Contact Number", add.getContactNo()));
            itemList.add(new ExpandableChildListItem("Website/Email", add.getEmail()));
            expandableParentListItems.get(index).setChildItemList(itemList);
            parentListItems.add(expandableParentListItems.get(index));
            index++;
        }


        adapter = new ExpandableAltAdapter(getBaseContext(), parentListItems);
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
