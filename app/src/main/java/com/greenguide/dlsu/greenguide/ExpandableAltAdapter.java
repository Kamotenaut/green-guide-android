package com.greenguide.dlsu.greenguide;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bignerdranch.expandablerecyclerview.Adapter.ExpandableRecyclerAdapter;
import com.bignerdranch.expandablerecyclerview.Model.ParentListItem;
import com.bignerdranch.expandablerecyclerview.ViewHolder.ChildViewHolder;
import com.bignerdranch.expandablerecyclerview.ViewHolder.ParentViewHolder;

import java.util.List;

/**
 * Created by jasonsioco on 8/14/2016.
 */
public class ExpandableAltAdapter extends ExpandableRecyclerAdapter<ExpandableAltAdapter.MyParentViewHolder, ExpandableAltAdapter.MyChildViewHolder> {
    private LayoutInflater mInflater;

    public ExpandableAltAdapter(Context context, List<ParentListItem> itemList) {
        super(itemList);
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public MyParentViewHolder onCreateParentViewHolder(ViewGroup viewGroup) {
        View view = mInflater.inflate(R.layout.expandable_item, viewGroup, false);
        return new MyParentViewHolder(view);
    }

    @Override
    public MyChildViewHolder onCreateChildViewHolder(ViewGroup viewGroup) {
        View view = mInflater.inflate(R.layout.expandable_child_alt, viewGroup, false);
        return new MyChildViewHolder(view);
    }

    @Override
    public void onBindParentViewHolder(MyParentViewHolder parentViewHolder, int position, ParentListItem parentListItem) {
        ExpandableParentListItem expandableParentListItem = (ExpandableParentListItem) parentListItem;
        parentViewHolder.lblListHeader.setText(expandableParentListItem.getmTitle());

    }

    @Override
    public void onBindChildViewHolder(MyChildViewHolder childViewHolder, int position, Object childListItem) {
        ExpandableChildListItem expandableChildListItem = (ExpandableChildListItem) childListItem;
        childViewHolder.ChildTitle.setText(expandableChildListItem.getmTitle());
        childViewHolder.ChildDetails.setText(expandableChildListItem.getmDetails());
        //childViewHolder.ChildCategory.setText(expandableChildListItem.getmCategory());
    }

    public class MyParentViewHolder extends ParentViewHolder {

        public TextView lblListHeader;

        public MyParentViewHolder(View itemView) {
            super(itemView);
            lblListHeader = (TextView) itemView.findViewById(R.id.parent_title);
            String fontPath = "fonts/Montserrat-Regular.ttf";
            Typeface tf = Typeface.createFromAsset(itemView.getContext().getAssets(), fontPath);
            lblListHeader.setTypeface(tf);
        }
    }


    public class MyChildViewHolder extends ChildViewHolder {

        public TextView ChildTitle;
        public TextView ChildDetails;
        //public TextView ChildCategory;

        public MyChildViewHolder(View itemView) {
            super(itemView);

            ChildTitle = (TextView) itemView.findViewById(R.id.child_title);
            ChildDetails = (TextView) itemView.findViewById(R.id.child_details);
            //ChildCategory = (TextView) itemView.findViewById(R.id.child_category);
            String fontPath = "fonts/Montserrat-Regular.ttf";
            Typeface tf = Typeface.createFromAsset(itemView.getContext().getAssets(), fontPath);
            ChildTitle.setTypeface(tf);
            ChildDetails.setTypeface(tf);
            //ChildCategory.setTypeface(tf);
        }
    }
}
