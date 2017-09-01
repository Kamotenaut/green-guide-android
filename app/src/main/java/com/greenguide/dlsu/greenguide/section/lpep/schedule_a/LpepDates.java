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
import com.greenguide.dlsu.greenguide.data.model.Schedule;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link LpepDates.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link LpepDates# newInstance} factory method to
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
        list.add(new Schedule("Sept 4, 2017\n(CED, COB, COS, SOE)","Day 1", ""));
        list.add(new Schedule("Sept 5, 2017\n(CED, COB, COS, SOE)","Day 2", ""));
        list.add(new Schedule("Sept 6, 2017\n(CLA, GCOE, CCS)","Day 1", ""));
        list.add(new Schedule("Sept 7, 2017\n(CLA, GCOE, CCS)","Day 2", ""));

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
