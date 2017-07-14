package com.greenguide.dlsu.greenguide;

import android.content.Context;
import android.graphics.Typeface;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bignerdranch.expandablerecyclerview.Adapter.ExpandableRecyclerAdapter;
import com.bignerdranch.expandablerecyclerview.Model.ParentListItem;
import com.bignerdranch.expandablerecyclerview.ViewHolder.ChildViewHolder;
import com.bignerdranch.expandablerecyclerview.ViewHolder.ParentViewHolder;

import java.util.List;

/**
 * Created by jasonsioco on 8/10/2016.
 */
public class ExpandableAdapter extends ExpandableRecyclerAdapter<ExpandableAdapter.MyParentViewHolder, ExpandableAdapter.MyChildViewHolder> {
        private LayoutInflater mInflater;

        public ExpandableAdapter(Context context, List<ParentListItem> itemList) {
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
            View view = mInflater.inflate(R.layout.expandable_child, viewGroup, false);
            return new MyChildViewHolder(view);
        }

        @Override
        public void onBindParentViewHolder(MyParentViewHolder parentViewHolder, int position, ParentListItem parentListItem) {
            ExpandableParentListItem expandableParentListItem = (ExpandableParentListItem) parentListItem;
            parentViewHolder.lblListHeader.setText(expandableParentListItem.getmTitle());
            switch(expandableParentListItem.getmTitle()){
                case "Manila Campus":parentViewHolder.headerImg.setImageResource(R.drawable.generic1);break;
                case "Laguna Campus":parentViewHolder.headerImg.setImageResource(R.drawable.stccampus);break;
                case "Off-Campus Parking":parentViewHolder.headerImg.setImageResource(R.drawable.outsidedlsu);break;
                case "Makati Campus":parentViewHolder.headerImg.setImageResource(R.drawable.generic2);break;
            }
        }

        @Override
        public void onBindChildViewHolder(MyChildViewHolder childViewHolder, int position, Object childListItem) {
            ExpandableChildListItem expandableChildListItem = (ExpandableChildListItem) childListItem;
            childViewHolder.ChildTitle.setText(expandableChildListItem.getmTitle());
            childViewHolder.ChildDetails.setText(expandableChildListItem.getmDetails());
        }

        public class MyParentViewHolder extends ParentViewHolder {

            public TextView lblListHeader;
            public ImageView headerImg;

            public MyParentViewHolder(View itemView) {
                super(itemView);
                lblListHeader = (TextView) itemView.findViewById(R.id.parent_title);
                headerImg = (ImageView) itemView.findViewById(R.id.img);
                String fontPath = "fonts/Montserrat-Regular.ttf";
                Typeface tf = Typeface.createFromAsset(itemView.getContext().getAssets(), fontPath);
                lblListHeader.setTypeface(tf);
            }
        }


        public class MyChildViewHolder extends ChildViewHolder {

            public TextView ChildTitle;
            public TextView ChildDetails;

            public MyChildViewHolder(View itemView) {
                super(itemView);

                ChildTitle = (TextView) itemView.findViewById(R.id.child_title);
                ChildDetails = (TextView) itemView.findViewById(R.id.child_details);
                String fontPath = "fonts/Montserrat-Regular.ttf";
                Typeface tf = Typeface.createFromAsset(itemView.getContext().getAssets(), fontPath);
                ChildTitle.setTypeface(tf);
                ChildDetails.setTypeface(tf);
            }
        }
    }
