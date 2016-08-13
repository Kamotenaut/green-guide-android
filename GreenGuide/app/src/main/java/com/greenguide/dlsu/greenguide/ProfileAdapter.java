package com.greenguide.dlsu.greenguide;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.uncopt.android.widget.text.justify.JustifiedTextView;

import java.util.List;

/**
 * Created by jasonsioco on 8/13/2016.
 */
public class ProfileAdapter extends RecyclerView.Adapter<ProfileAdapter.ProfileViewHolder>{


    private List<Profile> list;

    public ProfileAdapter(List<Profile> list) {
        this.list = list;
    }

    public static class ProfileViewHolder extends RecyclerView.ViewHolder{
        protected TextView vName;
        protected TextView vPosition;
        protected JustifiedTextView vDescription;
        protected ImageView vPhoto;

        public ProfileViewHolder(View v, List<Profile> list) {
            super(v);
            vName =  (TextView) v.findViewById(R.id.profilename);
            vPosition = (TextView) v.findViewById(R.id.profileposition);
            vDescription = (JustifiedTextView) v.findViewById(R.id.profiledescription);
            vPhoto = (ImageView)v.findViewById(R.id.profileimg);
            String fontPath = "fonts/Montserrat-Regular.ttf";
            Typeface tf = Typeface.createFromAsset(v.getContext().getAssets(), fontPath);
            vName.setTypeface(tf);
            vPosition.setTypeface(tf);
            vDescription.setTypeface(tf);
        }


    }

    @Override
    public ProfileViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.profile_item, parent, false);

        return new ProfileViewHolder(itemView,list);
    }

    @Override
    public void onBindViewHolder(ProfileViewHolder holder, final int position) {
        holder.vName.setText(list.get(position).getName());
        holder.vDescription.setText(list.get(position).getDescription());
        holder.vPosition.setText(list.get(position).getPosition());
        switch(list.get(position).getPosition()){
            case "":;break;
        }


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

}
