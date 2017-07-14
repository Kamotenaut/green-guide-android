package com.greenguide.dlsu.greenguide.section;

import android.app.Fragment;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

import com.greenguide.dlsu.greenguide.R;
import com.greenguide.dlsu.greenguide.section.about.About;
import com.greenguide.dlsu.greenguide.section.fyi.ForYourInformation;
import com.greenguide.dlsu.greenguide.section.lpep.DeanMessage;
import com.greenguide.dlsu.greenguide.section.lpep.Lpep;
import com.greenguide.dlsu.greenguide.section.offices.Offices;
import com.greenguide.dlsu.greenguide.section.student_orgs.StudentOrgs;
import com.greenguide.dlsu.greenguide.section.values_prayers.ValuesAndPrayers;

public class Navigation extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private android.app.FragmentManager fragmentManager;
    private TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.content_frame, new Lpep()).commit();
        title = (TextView) findViewById(R.id.navtitle);
        String fontPath = "fonts/Montserrat-Regular.ttf";
        Typeface tf = Typeface.createFromAsset(getBaseContext().getAssets(), fontPath);
        title.setTypeface(tf);
        title.setText("LPEP");
        setTitle("");

        Intent i = new Intent(getBaseContext(),DeanMessage.class);
        startActivity(i);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        Fragment fragment = null;
        if (id == R.id.nav_lpep) {
            fragmentManager.beginTransaction().replace(R.id.content_frame, new Lpep()).commit();
            title.setText("LPEP");
        } else  if (id == R.id.nav_valuesandprayers) {
            fragmentManager.beginTransaction().replace(R.id.content_frame, new ValuesAndPrayers()).commit();
            title.setText("Values and Prayers");
        } else if (id == R.id.nav_offices) {
            fragmentManager.beginTransaction().replace(R.id.content_frame, new Offices()).commit();
            title.setText("Offices");
        } else if (id == R.id.nav_studentorgs) {
            fragmentManager.beginTransaction().replace(R.id.content_frame, new StudentOrgs()).commit();
            title.setText("Student Organizations");
        } else if (id == R.id.nav_fyi) {
            fragmentManager.beginTransaction().replace(R.id.content_frame, new ForYourInformation()).commit();
            title.setText("For Your Information");
        } else if (id == R.id.nav_about) {
            fragmentManager.beginTransaction().replace(R.id.content_frame, new About()).commit();
            title.setText("About");
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
