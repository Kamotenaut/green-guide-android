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


public class CollegePresidents extends Fragment {    RecyclerView recycler;
    ProfileAdapter adapter;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_college_presidents, container, false);

        ArrayList<Profile> list = new ArrayList();
        list.add(new Profile("Jorge Francisco", "CCS College President", "President to the College of Computer Studies"));
        list.add(new Profile("Karl Ong", "COE College President", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec porttitor sed orci quis imperdiet. Aenean ac lorem non magna pellentesque molestie. "));
        list.add(new Profile("Reigner Sanchez", "SOE College President", "Lorem ipsum dolor sit amet, consectetur adipiscing elit."));
        list.add(new Profile("Monica Otayza", "COB College President", "Lorem ipsum dolor sit amet, consectetur adipiscing elit."));
        list.add(new Profile("Brian Chen", "COS College President", "Lorem ipsum dolor sit amet, consectetur adipiscing elit."));
        list.add(new Profile("Brian Chen", "CLA College President", "Lorem ipsum dolor sit amet, consectetur adipiscing elit."));
        adapter = new ProfileAdapter(list);
        recycler = (RecyclerView) v.findViewById(R.id.collegepresidentslist);
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
