package com.greenguide.dlsu.greenguide.section.student_orgs.section.usg_officers;

import android.graphics.Typeface;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.greenguide.dlsu.greenguide.R;

public class AboutUsg extends Fragment {

    private Toolbar toolbar;
    TextView whatusg;
    TextView dousg;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_about_usg, container, false);

        toolbar = (Toolbar) v.findViewById(R.id.toolbar);

        whatusg = (TextView) v.findViewById(R.id.whatusg);
        dousg = (TextView) v.findViewById(R.id.dousg);
        String fontPath = "fonts/Montserrat-Regular.ttf";
        Typeface tf = Typeface.createFromAsset(v.getContext().getAssets(), fontPath);
        whatusg.setTypeface(tf);
        dousg.setTypeface(tf);

        return v;
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
