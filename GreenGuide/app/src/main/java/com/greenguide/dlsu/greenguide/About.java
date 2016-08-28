package com.greenguide.dlsu.greenguide;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.solovyev.android.views.llm.DividerItemDecoration;

import java.util.ArrayList;
import java.util.List;


public class About extends android.app.Fragment{

    RecyclerView recycler;
    DevAdapter adapter;
    TextView title;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_about, container, false);
        String fontPath = "fonts/Montserrat-Regular.ttf";
        Typeface tf = Typeface.createFromAsset(v.getContext().getAssets(), fontPath);
        //final LinearLayoutManager layoutManager = new org.solovyev.android.views.llm.LinearLayoutManager(v.getContext(), LinearLayoutManager.VERTICAL, false);

        title = (TextView) v.findViewById(R.id.devtitle);
        title.setTypeface(tf);
        ArrayList<Profile> list = new ArrayList();
        list.add(new Profile("Jeno Panganiban", "BS-CS-ST", "Project Manager",R.drawable.panganiban));
        list.add(new Profile("Megan Avanceña", "BS-CS-IST", "Designer",R.drawable.avancena));
        list.add(new Profile("Jason Sioco", "BS-CS-ST", "Android UI Developer",R.drawable.sioco));
        list.add(new Profile("Jerrick Estioko", "BS-CS-ST", "Android Backend Developer",R.drawable.estioko));
        list.add(new Profile("Gela Acorda", "BS-CS-ST", "iOS UI Developer",R.drawable.acorda));
        list.add(new Profile("Chino Tapales", "BS-CS-ST", "iOS UI/Backend Developer",R.drawable.tapales));
        list.add(new Profile("Miguel Sietereales", "BS-CS-ST", "Web UI Developer",R.drawable.siete));
        list.add(new Profile("Marcus Ramos", "BS-CS-ST", "Web Backend Developer",R.drawable.ramos));
        adapter = new DevAdapter(list);
        recycler = (RecyclerView) v.findViewById(R.id.devlist);
        recycler.setHasFixedSize(true);
        recycler.setNestedScrollingEnabled(false);
        //recycler.addItemDecoration(new DividerItemDecoration(v.getContext(), null));
        //recycler.setLayoutManager(layoutManager);
        //recycler.setAdapter(adapter);
        LinearLayoutManager llm = new LinearLayoutManager(v.getContext());
        recycler.setLayoutManager(llm);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recycler.setAdapter(adapter);

        return v;
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
