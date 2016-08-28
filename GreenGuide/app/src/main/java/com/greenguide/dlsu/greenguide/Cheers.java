package com.greenguide.dlsu.greenguide;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class Cheers extends YouTubeBaseActivity
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
        setContentView(R.layout.activity_cheers);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        setTitle("");
        id=-1;
        header = (TextView) findViewById(R.id.cheerheader);
        title = (TextView) findViewById(R.id.cheertitle);
        content = (TextView) findViewById(R.id.cheertxt);
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ImageView toggle = (ImageView) findViewById(R.id.btn);
        ImageView back = (ImageView) findViewById(R.id.backbtn);
        final DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout_cheers);
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
        title.setText(R.string.la_salle_spelling_title);
        content.setText(R.string.la_salle_spelling);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout_cheers);
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
        if (id == R.id.nav_ls_spelling) {
            title.setText(R.string.la_salle_spelling_title);
            content.setText(R.string.la_salle_spelling);
            youTubeView.setVisibility(View.VISIBLE);
            mPlayer.cueVideo("UkxwimD4OFU");
        } else if (id == R.id.nav_who_win) {
            title.setText(R.string.who_win_title);
            content.setText(R.string.who_win);
            youTubeView.setVisibility(View.VISIBLE);
            mPlayer.cueVideo("mE81UhkWMg4");
        } else if (id == R.id.nav_zipa) {
            title.setText(R.string.zipa_title);
            content.setText(R.string.zipa);
            youTubeView.setVisibility(View.VISIBLE);
            mPlayer.cueVideo("fMtCfHJuIfk");
        } else if (id == R.id.nav_rekti) {
            title.setText(R.string.rekti_title);
            content.setText(R.string.rekti);
            youTubeView.setVisibility(View.VISIBLE);
            mPlayer.cueVideo("SdOjLEJKamA");
        } else if (id == R.id.nav_haydee) {
            title.setText(R.string.haydee_title);
            content.setText(R.string.haydee);
        } else if (id == R.id.nav_buma) {
            title.setText(R.string.buma_title);
            content.setText(R.string.buma);
            youTubeView.setVisibility(View.VISIBLE);
            mPlayer.cueVideo("vvrdAlMKyvc");
        } else if (id == R.id.nav_strawberry) {
            title.setText(R.string.strawberry_title);
            content.setText(R.string.strawberry);
        } else if (id == R.id.nav_derecho) {
            title.setText(R.string.derecho_title);
            content.setText(R.string.derecho);
        } else if (id == R.id.nav_yama) {
            title.setText(R.string.yama_title);
            content.setText(R.string.yama);
        } else if (id == R.id.nav_fans) {
            title.setText(R.string.fans_title);
            content.setText(R.string.fans);
        } else if (id == R.id.nav_anchors) {
            title.setText(R.string.anchors_title);
            content.setText(R.string.anchors);
        } else if (id == R.id.nav_men) {
            title.setText(R.string.men_title);
            content.setText(R.string.men);
        } else if (id == R.id.nav_onward) {
            title.setText(R.string.onward_title);
            content.setText(R.string.onward);
        } else if (id == R.id.nav_for_green) {
            title.setText(R.string.for_green_title);
            content.setText(R.string.for_green);
        } else if (id == R.id.nav_rally) {
            title.setText(R.string.rally_title);
            content.setText(R.string.rally);
        } else if (id == R.id.nav_green_white) {
            title.setText(R.string.green_white_title);
            content.setText(R.string.green_white);
        } else if (id == R.id.nav_hold) {
            title.setText(R.string.hold_title);
            content.setText(R.string.hold);
        } else if (id == R.id.nav_shoulder) {
            title.setText(R.string.shoulder_title);
            content.setText(R.string.shoulder);
        } else if (id == R.id.nav_animo) {
            title.setText(R.string.animo_title);
            content.setText(R.string.animo);
        } else if (id == R.id.nav_archer) {
            title.setText(R.string.archer_title);
            content.setText(R.string.archer);
        } else if (id == R.id.nav_fight_again) {
            title.setText(R.string.fight_again_title);
            content.setText(R.string.fight_again);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout_cheers);
        drawer.closeDrawer(Gravity.RIGHT);
        return true;
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer player, boolean b) {
        if (!b) {
            mPlayer = player;
            player.setShowFullscreenButton(false);
            mPlayer.cueVideo("UkxwimD4OFU");
        }
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
        if (youTubeInitializationResult.isUserRecoverableError()) {
            youTubeInitializationResult.getErrorDialog(this, RECOVERY_REQUEST).show();
        } else {
            String error = String.format(getString(R.string.player_error), youTubeInitializationResult.toString());
            Toast.makeText(this, error, Toast.LENGTH_LONG).show();
        }
    }
}
