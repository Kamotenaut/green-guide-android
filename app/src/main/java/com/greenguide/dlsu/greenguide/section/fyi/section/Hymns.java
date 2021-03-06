package com.greenguide.dlsu.greenguide.section.fyi.section;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;
import com.greenguide.dlsu.greenguide.api.Config;
import com.greenguide.dlsu.greenguide.R;

public class Hymns extends YouTubeBaseActivity
        implements NavigationView.OnNavigationItemSelectedListener,YouTubePlayer.OnInitializedListener{

    TextView title;
    TextView header;
    TextView content;
    YouTubePlayer mPlayer;
    int id;
    private static final int RECOVERY_REQUEST = 1;
    private YouTubePlayerView youTubeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hymns);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        setTitle("");
        id=-1;
        header = (TextView) findViewById(R.id.hymnheader);
        title = (TextView) findViewById(R.id.hymntitle);
        content = (TextView) findViewById(R.id.hymntxt);
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ImageView toggle = (ImageView) findViewById(R.id.btn);
        ImageView back = (ImageView) findViewById(R.id.backbtn);
        final DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        toggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawer.openDrawer(Gravity.RIGHT);
            }
        });
        youTubeView = (YouTubePlayerView) findViewById(R.id.youtube_view);
        youTubeView.initialize(Config.YOUTUBE_API_KEY, this);
        youTubeView.setVisibility(View.VISIBLE);
        String fontPath = "fonts/Montserrat-Regular.ttf";
        Typeface tf = Typeface.createFromAsset(getAssets(), fontPath);
        header.setTypeface(tf);
        title.setTypeface(tf);
        title.setText("Alma Mater Song");
        content.setText(R.string.alma_mater_song);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(Gravity.RIGHT)) {
            drawer.closeDrawer(Gravity.RIGHT);
        } else {
            super.onBackPressed();
        }
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        id = item.getItemId();
        youTubeView.setVisibility(View.GONE);
        if (id == R.id.nav_alma_mater) {
            title.setText(R.string.alma_mater_song_title);
            content.setText(R.string.alma_mater_song);
            youTubeView.setVisibility(View.VISIBLE);
            mPlayer.cueVideo("ZgBEsw1BERI");
        } else if (id == R.id.nav_live_jesus) {
            title.setText(R.string.live_jesus_title);
            content.setText(R.string.live_jesus);

            youTubeView.setVisibility(View.VISIBLE);
            mPlayer.cueVideo("GfyTXcdH-zg");
        }



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(Gravity.RIGHT);
        return true;
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer player, boolean b) {
        if (!b) {
            mPlayer = player;
            player.setShowFullscreenButton(false);
            mPlayer.cueVideo("ZgBEsw1BERI");
        }
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
        if (youTubeInitializationResult.isUserRecoverableError()) {
            youTubeInitializationResult.getErrorDialog(this, RECOVERY_REQUEST).show();
        } else {
            String error = getString(R.string.player_error);
            Toast.makeText(this, error, Toast.LENGTH_LONG).show();
        }
    }
}
