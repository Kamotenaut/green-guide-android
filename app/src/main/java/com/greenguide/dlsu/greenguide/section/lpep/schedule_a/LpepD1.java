package com.greenguide.dlsu.greenguide.section.lpep.schedule_a;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.greenguide.dlsu.greenguide.adapter.ListAdapter;
import com.greenguide.dlsu.greenguide.R;
import com.greenguide.dlsu.greenguide.data.model.*;
import com.greenguide.dlsu.greenguide.data.stored.LPEPScheduler;

import java.util.ArrayList;


public class LpepD1 extends Fragment{

    RecyclerView recycler;
    ListAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_lpep_d1, container, false);


        ArrayList<Schedule> list = LPEPScheduler.getInstance().getScheduleA("Day 1");

        adapter = new ListAdapter(list);
        recycler = (RecyclerView) v.findViewById(R.id.lpepd1list);
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
