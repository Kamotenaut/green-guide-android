package com.greenguide.dlsu.greenguide.section.fyi.section.arrows_express.fragment;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.greenguide.dlsu.greenguide.R;
import com.greenguide.dlsu.greenguide.data.model.Schedule;
import com.greenguide.dlsu.greenguide.data.stored.ArrowsExpressScheduler;
import com.greenguide.dlsu.greenguide.section.fyi.section.arrows_express.adapter.ScheduleAdapter;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link TaftToStc.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link TaftToStc# newInstance} factory method to
 * create an instance of this fragment.
 */
public class TaftToStc extends Fragment {
    RecyclerView recycler;
    ScheduleAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_taft_to_stc, container, false);

        ArrayList<Schedule> list = ArrowsExpressScheduler.getInstance().getDlsuToLaguna();
        adapter = new ScheduleAdapter(list);
        recycler = (RecyclerView) v.findViewById(R.id.tafttostclist);
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
