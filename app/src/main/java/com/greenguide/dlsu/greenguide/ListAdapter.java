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

import com.greenguide.dlsu.greenguide.data.model.Schedule;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by jasonsioco on 8/10/2016.
 */
public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ListViewHolder>{

    private List<Schedule> list;

    public ListAdapter(List<Schedule> list) {
        this.list = list;
    }

    public static class ListViewHolder extends RecyclerView.ViewHolder{
        protected TextView vTime;
        protected TextView vName;

        public ListViewHolder(View v, List<Schedule> list) {
            super(v);
            vName = (TextView) v.findViewById(R.id.activitytitle) ;
            vTime =  (TextView) v.findViewById(R.id.activitytime);
            String fontPath = "fonts/Montserrat-Regular.ttf";
            Typeface tf = Typeface.createFromAsset(v.getContext().getAssets(), fontPath);
            vName.setTypeface(tf);
            vTime.setTypeface(tf);
        }


    }

    @Override
    public ListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.sched_item, parent, false);

        return new ListViewHolder(itemView,list);
    }

    @Override
    public void onBindViewHolder(ListViewHolder holder, final int position) {
        holder.vName.setText(list.get(position).getDescription());
        holder.vTime.setText(list.get(position).getTime());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }


}
