package com.greenguide.dlsu.greenguide;

import android.app.Fragment;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

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
        fragmentManager.beginTransaction().replace(R.id.content_frame, new Home()).commit();
        title = (TextView) findViewById(R.id.navtitle);
        String fontPath = "fonts/Montserrat-Regular.ttf";
        Typeface tf = Typeface.createFromAsset(getBaseContext().getAssets(), fontPath);
        title.setTypeface(tf);
        title.setText("Home");
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
        if (id == R.id.nav_home) {
            fragmentManager.beginTransaction().replace(R.id.content_frame, new Home()).commit();
            title.setText("Home");
        } else if (id == R.id.nav_lpep) {
            fragmentManager.beginTransaction().replace(R.id.content_frame, new Lpep()).commit();
            title.setText("LPEP");
        } else if (id == R.id.nav_hymncheers) {
            fragmentManager.beginTransaction().replace(R.id.content_frame, new HymnsAndCheers()).commit();
            title.setText("Hymns and Cheers");
        } else if (id == R.id.nav_USG) {
            fragmentManager.beginTransaction().replace(R.id.content_frame, new Usg()).commit();
            title.setText("USG");
        } else if (id == R.id.nav_admin) {
            fragmentManager.beginTransaction().replace(R.id.content_frame, new AdminOffices()).commit();
            title.setText("Admin Offices");
        } else if (id == R.id.nav_cso) {
            fragmentManager.beginTransaction().replace(R.id.content_frame, new Cso()).commit();
            title.setText("CSO");
        } else if (id == R.id.nav_around) {
            fragmentManager.beginTransaction().replace(R.id.content_frame, new AroundDLSU()).commit();
            title.setText("Around DLSU");
        } else if (id == R.id.nav_services) {
            fragmentManager.beginTransaction().replace(R.id.content_frame, new CampusServices()).commit();
            title.setText("Campus Services");
        } else if (id == R.id.nav_lspo) {
            fragmentManager.beginTransaction().replace(R.id.content_frame, new Lspo()).commit();
            title.setText("LSPO");
        } else if (id == R.id.nav_about) {
            fragmentManager.beginTransaction().replace(R.id.content_frame, new About()).commit();
            title.setText("About");
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
