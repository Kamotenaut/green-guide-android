package com.greenguide.dlsu.greenguide;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link CampusServices.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link CampusServices#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CampusServices extends android.app.Fragment {
    RecyclerView recycler;
    CommonAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_campus_services, container, false);

        List list = new ArrayList();
        list.add("Arrows Express");
        list.add("Photocopy Services");
        list.add("Printing Services");
        list.add("School Supplies");
        adapter = new CommonAdapter(list);
        recycler = (RecyclerView) v.findViewById(R.id.campusserviceslist);
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
