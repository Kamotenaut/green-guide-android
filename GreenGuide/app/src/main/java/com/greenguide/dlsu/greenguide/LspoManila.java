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

public class LspoManila extends Fragment {

    RecyclerView recycler;
    ExpandableAltAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_lspo_manila, container, false);

        String fontPath = "fonts/Montserrat-Regular.ttf";
        Typeface tf = Typeface.createFromAsset(v.getContext().getAssets(), fontPath);

        recycler = (RecyclerView) v.findViewById(R.id.lspomanilalist);
        recycler.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        recycler.setHasFixedSize(true);

        List<ExpandableParentListItem> expandableParentListItems = new ArrayList<>();
        List<ParentListItem> parentListItems = new ArrayList<>();
        expandableParentListItems.add(new ExpandableParentListItem("Venue"));
        List<ExpandableChildListItem> childItemList = new ArrayList<>();
        childItemList.add(new ExpandableChildListItem("Location","Room 101, St. Joseph Hall, loc. 410/104"));
        expandableParentListItems.get(0).setChildItemList(childItemList);
        parentListItems.add(expandableParentListItems.get(0));

        expandableParentListItems.add(new ExpandableParentListItem("Daily Masses"));
        List<ExpandableChildListItem> childItemList1 = new ArrayList<>();
        childItemList1.add(new ExpandableChildListItem("Monday - Thursday", "12:10 p.m. and 5:30 p.m. Pearl of Great Price Chapel (except 5:30 p.m. Wednesday)"));
        childItemList1.add(new ExpandableChildListItem("Wednesday", "5:30 p.m. Chapel of Christ the Teacher (A1409)"));
        expandableParentListItems.get(1).setChildItemList(childItemList1);
        parentListItems.add(expandableParentListItems.get(1));

        expandableParentListItems.add(new ExpandableParentListItem("Confession"));
        List<ExpandableChildListItem> childItemList2 = new ArrayList<>();
        childItemList2.add(new ExpandableChildListItem("Monday - Friday", "During office hours Chaplain’s Office, SJ103"));
        expandableParentListItems.get(2).setChildItemList(childItemList1);
        parentListItems.add(expandableParentListItems.get(2));

        expandableParentListItems.add(new ExpandableParentListItem("Exposition and Benediction of the Blessed Sacrament"));
        List<ExpandableChildListItem> childItemList3 = new ArrayList<>();
        childItemList3.add(new ExpandableChildListItem("Monday - Friday", "10:40 a.m. except Thursday"));
        childItemList3.add(new ExpandableChildListItem("Thursday", "10:40 a.m. & immediately after 12:10 p.m. Mass Pearl of Great Price Chapel"));
        childItemList3.add(new ExpandableChildListItem("Thursday before the First Friday", "After 12:10 p.m. Mass Pearl of Great Price Chapel"));
        expandableParentListItems.get(3).setChildItemList(childItemList3);
        parentListItems.add(expandableParentListItems.get(3));


        adapter = new ExpandableAltAdapter(v.getContext(), parentListItems);
        recycler.setAdapter(adapter);

        return v;
    }


    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
