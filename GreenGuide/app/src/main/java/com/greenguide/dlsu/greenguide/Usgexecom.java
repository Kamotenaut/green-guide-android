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
//        list.add(new Profile("Zed Laqui", "USG President", "USG president is the highest position of the USG"));
//        list.add(new Profile("Karl Ong", "Vice President for Internal Affairs", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec porttitor sed orci quis imperdiet. Aenean ac lorem non magna pellentesque molestie. "));
//        list.add(new Profile("Reigner Sanchez", "Vice President for External Affairs", "Lorem ipsum dolor sit amet, consectetur adipiscing elit."));
//        list.add(new Profile("Monica Otayza", "Executive Secretary", "Lorem ipsum dolor sit amet, consectetur adipiscing elit."));
//        list.add(new Profile("Brian Chen", "Executive Treasurer", "Lorem ipsum dolor sit amet, consectetur adipiscing elit."));

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
