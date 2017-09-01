package com.greenguide.dlsu.greenguide.section.student_orgs.section;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.greenguide.dlsu.greenguide.R;
import com.greenguide.dlsu.greenguide.data.model.Profile;
import com.greenguide.dlsu.greenguide.section.student_orgs.section.adapter.ProfileAdapter;

import java.util.ArrayList;

public class AboutCso extends AppCompatActivity {

    private Toolbar toolbar;
    TextView whatcso;
    TextView visioncso;
    TextView missioncso;
    TextView header;
    TextView csoexec;

    RecyclerView recycler;
    ProfileAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_about_cso);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setTitle("");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        header = (TextView) findViewById(R.id.aboutcsoheader);
        whatcso = (TextView) findViewById(R.id.whatcso);
        visioncso = (TextView) findViewById(R.id.visioncso);
        missioncso = (TextView) findViewById(R.id.missioncso);
        csoexec = (TextView) findViewById(R.id.csoexec);
        String fontPath = "fonts/Montserrat-Regular.ttf";
        Typeface tf = Typeface.createFromAsset(getAssets(), fontPath);
        header.setTypeface(tf);
        whatcso.setTypeface(tf);
        visioncso.setTypeface(tf);
        missioncso.setTypeface(tf);
        csoexec.setTypeface(tf);

        ArrayList<Profile> list = new ArrayList();
        list.add(new Profile("Jayrene Rya Cruz", "Council Chairperson", "The chairperson is the overall coordinator of the activities in CSO; enforce all policies passed by the CSO executive board and the council; and establish and promote common good relations among the different organizations of CSO. The chairperson also sets a vision and direction for the council and helps form the council leaders who then form other organization leaders of the lasallian community."));
        list.add(new Profile("Ma. Jerica Beatrix Santos", "Executive Vice Chairperson for Externals", "The Executive Vice Chairperson - Externals handles all official announcements of CSO to the external community, coordinates all activities held in conjunction with organizations outside CSO; and establishes and maintains linkages with various institutions, offices and units outside CSO."));
        list.add(new Profile("Jashia Caila Chua", "Executive Vice Chairperson for Internals","The Executive Vice Chairperson - Internals coordinates all internal operations of Council of Student Organizations; conduct training and developmental activities; and establish and promote common good relations among different Executive Teams of the CSO."));
        list.add(new Profile("Rica Culata", "Executive Vice Chairperson for Activities and Documentations", "The Executive Vice Chairperson - Activities and Documentations collects, maintains, and updates the documents of all accredited organizations and has the authority to approve activities of the accredited organizations."));
        list.add(new Profile("Margreth Vasquez", "Executive Vice Chairperson for Finance", "The Executive Vice Chairperson - Finance maintains and updates the complete record of all receipts and disbursements in CSO; and issue funds under the jurisdiction of the CSO; collect all financial documents submitted by the Organization Treasurers; and maintains a record of all deposits made to the account of CSO and its member organizations."));
        list.add(new Profile("Daphne Erin Razo", "Executive Vice Chairperson for Laguna Campus", "The EVC for STC acts as the main representative of the Laguna Campus of DLSU to CSO, supervises all operations and activities of the Council in the Laguna Campus, and assists the CSO Chairperson in aiding, guiding and evaluating the different accredited organizations in the Laguna Campus."));

        adapter = new ProfileAdapter(list);
        recycler = (RecyclerView) findViewById(R.id.csoexecomlist);
        recycler.setHasFixedSize(true);

//        recycler.setItemViewCacheSize(20);
//        recycler.setDrawingCacheEnabled(true);
//        recycler.setDrawingCacheQuality(View.DRAWING_CACHE_QUALITY_HIGH);
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
