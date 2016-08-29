package com.greenguide.dlsu.greenguide;

import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.greenguide.dlsu.greenguide.data.model.NameTag;

import java.util.List;

/**
 * Created by jasonsioco on 8/30/2016.
 */
public class ProgramsAdapter extends RecyclerView.Adapter<ProgramsAdapter.ProgramsViewHolder>{


    private List<NameTag> list;

    public ProgramsAdapter(List<NameTag> list) {
        this.list = list;
    }

    public static class ProgramsViewHolder extends RecyclerView.ViewHolder{
        protected TextView vTitle;
        protected TextView vDescription;
        protected ImageView vPhoto;

        public ProgramsViewHolder(View v, List<NameTag> list) {
            super(v);
            vTitle = (TextView) v.findViewById(R.id.orgtitle);
            vDescription = (TextView) v.findViewById(R.id.orgdescription);
            vPhoto = (ImageView)v.findViewById(R.id.orgimg);
            String fontPath = "fonts/Montserrat-Regular.ttf";
            Typeface tf = Typeface.createFromAsset(v.getContext().getAssets(), fontPath);
            vTitle.setTypeface(tf);
            //vDescription.setTypeface(tf);
        }


    }

    @Override
    public ProgramsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.prog_item, parent, false);

        return new ProgramsViewHolder(itemView,list);
    }

    @Override
    public void onBindViewHolder(ProgramsViewHolder holder, final int position) {
        holder.vTitle.setText(list.get(position).getName());
        holder.vDescription.setText(list.get(position).getDescription());
        switch(list.get(position).getName()){
            case "":;break;
        }


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

}
