package com.greenguide.dlsu.greenguide.section.student_orgs.section.usg_officers;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.greenguide.dlsu.greenguide.data.model.Profile;
import com.greenguide.dlsu.greenguide.section.student_orgs.section.adapter.ProfileAdapter;
import com.greenguide.dlsu.greenguide.R;
import com.greenguide.dlsu.greenguide.data.model.Officers;
import com.greenguide.dlsu.greenguide.data.stored.StudentOffices;

import java.util.ArrayList;


public class Usgexecom extends Fragment {
    RecyclerView recycler;
    ProfileAdapter adapter;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_usg_execom, container, false);

        ArrayList<Profile> list = new ArrayList();

        for(Officers o : StudentOffices.getInstance().getUsgEB()){
            list.add(new Profile(o.getName(), o.getPosition(), ""));
        }

        adapter = new ProfileAdapter(list);
        recycler = (RecyclerView) v.findViewById(R.id.usgexecomlist);
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
