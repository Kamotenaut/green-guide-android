package com.greenguide.dlsu.greenguide;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
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

public class Navigation extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private android.app.FragmentManager fragmentManager;
    final static String KEY_MESSAGE_IS_READ = "message_is_read";
    final static String DEAN_PREF = "dean_message_pref";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.content_frame, new Home()).commit();

        setTitle("");

        SharedPreferences sharedPreferences = getSharedPreferences(DEAN_PREF, Context.MODE_PRIVATE);
        String message = sharedPreferences.getString(KEY_MESSAGE_IS_READ, null);

        if( message == null ){
            Intent i = new Intent(getBaseContext(),DeanMessage.class);
            startActivity(i);
        }

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
        } else if (id == R.id.nav_admin) {
            // Handle the camera action
        } else if (id == R.id.nav_arrow_express) {

        } else if (id == R.id.nav_hymn) {
            fragmentManager.beginTransaction().replace(R.id.content_frame, new HymnsAndCheers()).commit();
        } else if (id == R.id.nav_lpep) {

        } else if (id == R.id.nav_pledge) {

        } else if (id == R.id.nav_services) {

        } else if (id == R.id.nav_usg) {

        } else if (id == R.id.nav_values) {

        } else if (id == R.id.nav_view) {

        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
