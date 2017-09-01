package com.greenguide.dlsu.greenguide.section.fyi.section;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.greenguide.dlsu.greenguide.R;
import com.greenguide.dlsu.greenguide.data.model.Policy;
import com.greenguide.dlsu.greenguide.section.fyi.section.adapter.PoliciesAdapter;

import java.util.ArrayList;
import java.util.List;

public class Policies extends AppCompatActivity {


    private Toolbar toolbar;
    private RecyclerView recycler;
    private TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_policies);
        recycler = (RecyclerView) findViewById(R.id.rv_list);
        recycler.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recycler.setHasFixedSize(true);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        title = (TextView) findViewById(R.id.tv_title);
        String fontPath = "fonts/Montserrat-Regular.ttf";
        Typeface tf = Typeface.createFromAsset(getBaseContext().getAssets(), fontPath);
        title.setTypeface(tf);

        setTitle("");

        List<Policy> list = new ArrayList();
        list.add(new Policy("Helplines", R.drawable.sdfo_helplines, "dlsu_helplines.pdf"));
        list.add(new Policy("Academic Dishonesty", R.drawable.sdfo_acad_dishonesty, "policies_acad_dishonesty.pdf"));
        list.add(new Policy("Acts of Disrespect", R.drawable.sdfo_disrespect, "policies_disrespect.pdf"));
        list.add(new Policy("Bullying", R.drawable.sdfo_bullying, "policies_bullying.pdf"));
        list.add(new Policy("Classroom Policy", R.drawable.sdfo_classroom_policy, "policies_classroom_policy.pdf"));
        list.add(new Policy("Cleanliness", R.drawable.sdfo_cleanliness, "policies_cleanliness.pdf"));
        list.add(new Policy("Dress Code", R.drawable.sdfo_dresscode, "policies_dresscode.pdf"));
        list.add(new Policy("Drugs", R.drawable.sdfo_drug, "policies_drug.pdf"));
        list.add(new Policy("Drug Test", R.drawable.sdfo_drugtest, "policies_drugtest.pdf"));
        list.add(new Policy("Eating", R.drawable.sdfo_no_eating, "policies_no_eating.pdf"));
        list.add(new Policy("Fraternity", R.drawable.sdfo_frat, "policies_frat.pdf"));
        list.add(new Policy("Fraud", R.drawable.sdfo_fraud, "policies_fraud.pdf"));
        list.add(new Policy("Gambling", R.drawable.sdfo_gambling, "policies_gambling.pdf"));
        list.add(new Policy("ID Policy", R.drawable.sdfo_id_policy, "policies_id_101.pdf"));
        list.add(new Policy("Lewdness", R.drawable.sdfo_lewdness, "policies_lewdness.pdf"));
        list.add(new Policy("Liquor", R.drawable.sdfo_liquor, "policies_liquor.pdf"));
        list.add(new Policy("Smoking", R.drawable.sdfo_no_smoking, "policies_no_smoking.pdf"));
        list.add(new Policy("Scalping", R.drawable.sdfo_scalping, "policies_scalping.pdf"));
        list.add(new Policy("Staff", R.drawable.sdfo_staff, "policies_staff.pdf"));
        list.add(new Policy("Unjust Enrichment", R.drawable.sdfo_unjust_enrichment, "policies_unjust_enrichment.pdf"));

        PoliciesAdapter adapter = new PoliciesAdapter(list);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        recycler.setLayoutManager(llm);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
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
