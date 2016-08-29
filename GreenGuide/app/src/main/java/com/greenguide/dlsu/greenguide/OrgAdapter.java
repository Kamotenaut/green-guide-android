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
 * Created by jasonsioco on 8/13/2016.
 */
public class OrgAdapter extends RecyclerView.Adapter<OrgAdapter.OrgViewHolder>{

    private List<NameTag> list;

    public OrgAdapter(List<NameTag> list) {
        this.list = list;
    }

    public static class OrgViewHolder extends RecyclerView.ViewHolder{
        protected TextView vTitle;
        protected TextView vDescription;
        protected ImageView vPhoto;

        public OrgViewHolder(View v, List<NameTag> list) {
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
    public OrgViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.org_item, parent, false);

        return new OrgViewHolder(itemView,list);
    }

    @Override
    public void onBindViewHolder(OrgViewHolder holder, final int position) {
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
