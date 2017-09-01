package com.greenguide.dlsu.greenguide.section.about;

import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.greenguide.dlsu.greenguide.section.about.adapter.DevAdapter;
import com.greenguide.dlsu.greenguide.data.model.Profile;
import com.greenguide.dlsu.greenguide.R;

import java.util.ArrayList;


public class About extends android.app.Fragment{

    RecyclerView recycler2016;
    RecyclerView recycler2017;
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

        LinearLayoutManager llm = new LinearLayoutManager(v.getContext());
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        title = (TextView) v.findViewById(R.id.devtitle2016);
        //title.setTypeface(tf);
        ArrayList<Profile> list2016 = new ArrayList();
        list2016.add(new Profile("Jeno Panganiban", "BS CS-ST", "Project Manager",R.drawable.panganiban));
        list2016.add(new Profile("Megan Avanceña", "BS CS-IST", "Designer",R.drawable.avancena));
        list2016.add(new Profile("Jason Sioco", "BS CS-ST", "Android UI Developer",R.drawable.sioco));
        list2016.add(new Profile("Jerrick Estioko", "BS CS-ST", "Android Backend Developer",R.drawable.estioko));
        list2016.add(new Profile("Gela Acorda", "BS CS-ST", "iOS UI Developer",R.drawable.acorda));
        list2016.add(new Profile("Chino Tapales", "BS CS-ST", "iOS UI/Backend Developer",R.drawable.tapales));
        list2016.add(new Profile("Miguel Sietereales", "BS CS-ST", "Web UI Developer",R.drawable.siete));
        list2016.add(new Profile("Marcus Ramos", "BS CS-ST", "Web Backend Developer",R.drawable.ramos));
        adapter = new DevAdapter(list2016);
        recycler2016 = (RecyclerView) v.findViewById(R.id.devlist2016);
        recycler2016.setHasFixedSize(true);
        recycler2016.setNestedScrollingEnabled(false);
        recycler2016.setLayoutManager(llm);
        recycler2016.setAdapter(adapter);
        recycler2016.setFocusable(false);

        /*Added 2017 Dev Team*/
        ArrayList<Profile> list2017 = new ArrayList();
        list2017.add(new Profile("Winfred Villaluna", "BS CS-ST", "Project Manager",R.drawable.avatar));
        list2017.add(new Profile("Gelo Reamon", "BS CS-ST", "Android App Development Lead",R.drawable.avatar));
        list2017.add(new Profile("Gaius Ambion", "BS CS-ST", "Android App Developer",R.drawable.avatar));
        list2017.add(new Profile("Brandon Peñaranda", "BS CS-ST", "Android App Developer",R.drawable.avatar));
        list2017.add(new Profile("Patrick Tobias", "BS CS-ST", "iOS App Development Lead",R.drawable.avatar));
        list2017.add(new Profile("Keith Gardose", "BS CS-ST", "iOS App Developer",R.drawable.avatar));
        list2017.add(new Profile("Nicolle Magpale", "BS CS-ST", "Web App Development Lead",R.drawable.avatar));
        list2017.add(new Profile("Dyan Nieva", "BS CS-ST", "Web App Developer",R.drawable.avatar));
        list2017.add(new Profile("Mavic Reccion", "BS CS-ST", "Web App Developer",R.drawable.avatar));
        adapter = new DevAdapter(list2017);
        recycler2017 = (RecyclerView) v.findViewById(R.id.devlist2017);

        recycler2017.setHasFixedSize(true);
        recycler2017.setNestedScrollingEnabled(false);
        //recycler.addItemDecoration(new DividerItemDecoration(v.getContext(), null));
        //recycler.setLayoutManager(layoutManager);
        //recycler.setAdapter(adapter);
        llm = new LinearLayoutManager(v.getContext());
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        recycler2017.setLayoutManager(llm);
        recycler2017.setAdapter(adapter);
        recycler2017.setFocusable(false);

        return v;
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
