package com.greenguide.dlsu.greenguide.adapter;

import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.greenguide.dlsu.greenguide.R;
import com.greenguide.dlsu.greenguide.data.model.Schedule;

import java.util.List;

/**
 * Created by jasonsioco on 8/10/2016.
 */
public class ListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    private List<Schedule> list;

    public ListAdapter(List<Schedule> list) {
        this.list = list;
    }

    public static class ListViewHolder extends RecyclerView.ViewHolder{
        protected TextView vTime;
        protected TextView vName;

        public ListViewHolder(View v) {
            super(v);
            vName = (TextView) v.findViewById(R.id.activitytitle) ;
            vTime =  (TextView) v.findViewById(R.id.activitytime);
            String fontPath = "fonts/Montserrat-Regular.ttf";
            Typeface tf = Typeface.createFromAsset(v.getContext().getAssets(), fontPath);
            vName.setTypeface(tf);
            vTime.setTypeface(tf);
        }
    }

    public static class HeaderHolder extends RecyclerView.ViewHolder{
        protected TextView tvHeader;
        public HeaderHolder(View v) {
            super(v);
            tvHeader = (TextView) v.findViewById(R.id.tv_header) ;
            String fontPath = "fonts/Montserrat-Regular.ttf";
            Typeface tf = Typeface.createFromAsset(v.getContext().getAssets(), fontPath);
            tvHeader.setTypeface(tf);
        }
    }


    @Override
    public int getItemViewType(int position) {
        return list.get(position).getTime().trim().isEmpty() ? 1 : 0;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = null;
        switch (viewType)
        {
            case 0:
                itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.sched_item, parent, false);
                return new ListViewHolder(itemView);
            case 1:
                itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.sched_header, parent, false);
                return new HeaderHolder(itemView);
        }

        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        int type = getItemViewType(position);

        switch (type)
        {
            case 0:
                ListViewHolder listHolder = (ListViewHolder) holder;
                listHolder.vName.setText(list.get(position).getDescription());
                listHolder.vTime.setText(list.get(position).getTime());
                break;
            case 1:
                HeaderHolder h = (HeaderHolder) holder;
                h.tvHeader.setText(list.get(position).getDescription());
                break;
        }

    }

    @Override
    public int getItemCount() {
        return list.size();
    }


}
