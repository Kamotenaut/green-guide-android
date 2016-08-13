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
 * {@link LpepD3.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link LpepD3#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LpepD3 extends Fragment {

    RecyclerView recycler;
    ListAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_lpep_d3, container, false);

        ArrayList<Schedule> list = new ArrayList();
        list.add(new Schedule("Opening Prayer","7:30AM"));
        list.add(new Schedule("Opening Remarks","9:30AM"));
        list.add(new Schedule("Ice Breaker","11:00AM"));
        list.add(new Schedule("Lunch","12:30PM"));
        list.add(new Schedule("SDFO Orientation","3:30PM"));
        list.add(new Schedule("Closing Remarks","5:00PM"));

        adapter = new ListAdapter(list);
        recycler = (RecyclerView) v.findViewById(R.id.lpepd3list);
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
