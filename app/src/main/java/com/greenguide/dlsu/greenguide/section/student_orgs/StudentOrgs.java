package com.greenguide.dlsu.greenguide.section.student_orgs;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.greenguide.dlsu.greenguide.adapter.CommonAdapter;
import com.greenguide.dlsu.greenguide.R;

import java.util.ArrayList;
import java.util.List;


public class StudentOrgs extends android.app.Fragment {
    RecyclerView recycler;
    CommonAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_studentorgs, container, false);

        List list = new ArrayList();
        list.add("The Council of Student Organizations");
        list.add("Accredited Organizations");
        list.add("The University Student Government");
        list.add("Programs and Services");

        adapter = new CommonAdapter(list);
        recycler = (RecyclerView) v.findViewById(R.id.studentorgslist);
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
