package com.greenguide.dlsu.greenguide;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bignerdranch.expandablerecyclerview.Model.ParentListItem;

import java.util.ArrayList;
import java.util.List;

public class LspoStc extends Fragment {
    RecyclerView recycler;
    ExpandableAltAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_lspo_stc, container, false);

        String fontPath = "fonts/Montserrat-Regular.ttf";
        Typeface tf = Typeface.createFromAsset(v.getContext().getAssets(), fontPath);

        recycler = (RecyclerView) v.findViewById(R.id.lspostclist);
        recycler.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        recycler.setHasFixedSize(true);

        List<ExpandableParentListItem> expandableParentListItems = new ArrayList<>();
        List<ParentListItem> parentListItems = new ArrayList<>();
        expandableParentListItems.add(new ExpandableParentListItem("Venue"));
        List<ExpandableChildListItem> childItemList = new ArrayList<>();
        childItemList.add(new ExpandableChildListItem("Location","Room E108, Milagros Del Rosario Bldg. Loc 104"));
        expandableParentListItems.get(0).setChildItemList(childItemList);
        parentListItems.add(expandableParentListItems.get(0));

        expandableParentListItems.add(new ExpandableParentListItem("Daily Masses"));
        List<ExpandableChildListItem> childItemList1 = new ArrayList<>();
        childItemList1.add(new ExpandableChildListItem("Monday - Friday", "12:10 p.m. St. John Baptist de La Salle Chapel, LC1 Building"));
        childItemList1.add(new ExpandableChildListItem("First Friday", "8:30 a.m. Covered Court"));
        expandableParentListItems.get(1).setChildItemList(childItemList1);
        parentListItems.add(expandableParentListItems.get(1));

        expandableParentListItems.add(new ExpandableParentListItem("Confession"));
        List<ExpandableChildListItem> childItemList2 = new ArrayList<>();
        childItemList2.add(new ExpandableChildListItem("Tuesday and Thursday", "9:00 a.m – 11:00a.m. St. John Baptist de La Salle Chapel, LC1 Building"));
        expandableParentListItems.get(2).setChildItemList(childItemList1);
        parentListItems.add(expandableParentListItems.get(2));


        adapter = new ExpandableAltAdapter(v.getContext(), parentListItems);
        recycler.setAdapter(adapter);

        return v;
    }


    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
