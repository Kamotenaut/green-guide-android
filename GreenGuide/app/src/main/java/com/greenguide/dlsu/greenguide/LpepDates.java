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


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link LpepDates.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link LpepDates#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LpepDates extends Fragment {
    RecyclerView recycler;
    ListAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_lpep_dates, container, false);

        ArrayList<Schedule> list = new ArrayList();
        list.add(new Schedule("CCS/SOE",""));
        list.add(new Schedule("September 11, 2016","Day 1"));
        list.add(new Schedule("September 12, 2016","Day 2"));
        list.add(new Schedule("September 14, 2016","Day 3"));
        list.add(new Schedule("COB/COE",""));
        list.add(new Schedule("September 15, 2016","Day 1"));
        list.add(new Schedule("September 16, 2016","Day 2"));
        list.add(new Schedule("September 17, 2016","Day 3"));

        adapter = new ListAdapter(list);
        recycler = (RecyclerView) v.findViewById(R.id.lpepdateslist);
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
