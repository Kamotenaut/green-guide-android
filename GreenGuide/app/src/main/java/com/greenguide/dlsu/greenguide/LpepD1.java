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

        ArrayList<Schedule> list = new ArrayList();
        list.add(new Schedule("Registration","7:00AM"));
        list.add(new Schedule("Movement to HSSH Grounds","7:30AM"));
        list.add(new Schedule("Introduction to Lasallian Prayers Eucharistic Celebration","7:45AM"));
        list.add(new Schedule("Entrance of Colors\n" +
                "National Anthem\n" +
                "Welcoming Remarks","9:00AM"));
        list.add(new Schedule("Movement to eating area","9:30AM"));
        list.add(new Schedule("AM Snacks","9:40AM"));
        list.add(new Schedule("Movement to classrooms","9:50AM"));
        list.add(new Schedule("Getting to Know You Activities\n" +
                "Institutional Video ","10:00AM"));
        list.add(new Schedule("Academic Concerns","10:40AM"));
        list.add(new Schedule("Movement to eating area","12:00PM"));
        list.add(new Schedule("Lunch","12:10PM"));
        list.add(new Schedule("Movement to classrooms","1:00PM"));
        list.add(new Schedule("Introduction to the Lasallian Formation and Action Framework ","1:10PM"));
        list.add(new Schedule("Counseling and Career Services","1:45PM"));
        list.add(new Schedule("Synthesis/Recap","3:00PM"));
        list.add(new Schedule("Campus Tour","3:15PM"));

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
