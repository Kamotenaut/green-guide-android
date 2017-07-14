package com.greenguide.dlsu.greenguide.section.student_orgs.section.cso_orgs;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.greenguide.dlsu.greenguide.R;
import com.greenguide.dlsu.greenguide.section.student_orgs.section.cso_orgs.fragment.Aso;
import com.greenguide.dlsu.greenguide.section.student_orgs.section.cso_orgs.fragment.Aspire;
import com.greenguide.dlsu.greenguide.section.student_orgs.section.cso_orgs.fragment.Cap11;
import com.greenguide.dlsu.greenguide.section.student_orgs.section.cso_orgs.fragment.Engage;
import com.greenguide.dlsu.greenguide.section.student_orgs.section.cso_orgs.fragment.Probe;

import java.util.ArrayList;
import java.util.List;

public class Organizations extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_organizations);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        String fontPath = "fonts/Montserrat-Regular.ttf";
        Typeface tf = Typeface.createFromAsset(getBaseContext().getAssets(), fontPath);
        title = (TextView) findViewById(R.id.organizationstitle);
        title.setTypeface(tf);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        setTitle("");

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new Aso(), "ASO");
        adapter.addFragment(new Aspire(), "ASPIRE");
        /*Changed CAP11 into CULTURA CAP12*/
        adapter.addFragment(new Cap11(), "CULTURA CAP12");
        adapter.addFragment(new Probe(), "PROBE");
        adapter.addFragment(new Engage(), "ENGAGE");
        viewPager.setAdapter(adapter);
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

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(android.support.v4.app.FragmentManager manager) {
            super(manager);
        }

        @Override
        public android.support.v4.app.Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(android.support.v4.app.Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }
}
