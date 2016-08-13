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

import org.w3c.dom.Text;

import java.util.ArrayList;


public class Aso extends Fragment {
    RecyclerView recycler;
    OrgAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_aso, container, false);

        ArrayList<Org> list = new ArrayList();
        String fontPath = "fonts/Montserrat-Regular.ttf";
        Typeface tf = Typeface.createFromAsset(v.getContext().getAssets(), fontPath);
        list.add(new Org("La Salle Computer Society","LSCS is an org under CCS that provides programs and seminars focused on computers."));
        list.add(new Org("Englicom","Englicom is an organization that aims to unite the Chinese community within DLSU"));
        list.add(new Org("AIESEC","AIESEC is an organization that aims to provide fun and engaging activities for the student body."));
        list.add(new Org("AIESEC","AIESEC is an organization that aims to provide fun and engaging activities for the student body."));
        adapter = new OrgAdapter(list);
        recycler = (RecyclerView) v.findViewById(R.id.asolist);
        recycler.setHasFixedSize(true);
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
