package com.greenguide.dlsu.greenguide;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class Home extends android.app.Fragment{

        RecyclerView recycler;
        CommonAdapter adapter;

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View v = inflater.inflate(R.layout.fragment_hymns_and_cheers, container, false);

            List list = new ArrayList();
            list.add("LPEP Schedule");
            list.add("Lasallian Pledge");
            list.add("Values and Prayers");
            list.add("Dress Code");
            list.add("Tips and Tidbits");
            adapter = new CommonAdapter(list);
            recycler = (RecyclerView) v.findViewById(R.id.hymncheerlist);
            recycler.setHasFixedSize(true);
            LinearLayoutManager llm = new LinearLayoutManager(v.getContext());
            recycler.setLayoutManager(llm);
            llm.setOrientation(LinearLayoutManager.VERTICAL);
            recycler.setAdapter(adapter);

            return v;
        }


        /**
         * This interface must be implemented by activities that contain this
         * fragment to allow an interaction in this fragment to be communicated
         * to the activity and potentially other fragments contained in that
         * activity.
         * <p>
         * See the Android Training lesson <a href=
         * "http://developer.android.com/training/basics/fragments/communicating.html"
         * >Communicating with Other Fragments</a> for more information.
         */
        public interface OnFragmentInteractionListener {
            // TODO: Update argument type and name
            void onFragmentInteraction(Uri uri);
        }
    }

