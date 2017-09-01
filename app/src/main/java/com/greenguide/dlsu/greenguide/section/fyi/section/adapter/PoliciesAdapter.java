package com.greenguide.dlsu.greenguide.section.fyi.section.adapter;

import android.graphics.Typeface;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.greenguide.dlsu.greenguide.R;
import com.greenguide.dlsu.greenguide.data.model.Policy;
import com.greenguide.dlsu.greenguide.helper.PdfUtil;

import java.util.List;

public class PoliciesAdapter extends RecyclerView.Adapter<PoliciesAdapter.PoliciesViewHolder>{

    public static final String TAG = "PoliciesAdapter";

        private List<Policy> list;

        public PoliciesAdapter(List<Policy> list) {
            this.list = list;
        }

        public static class PoliciesViewHolder extends RecyclerView.ViewHolder{
            protected TextView vTitle;
            protected CardView vCard;
            protected ImageView vImage;

            public PoliciesViewHolder(View v) {
                super(v);
                vTitle =  (TextView) v.findViewById(R.id.itemtitle);
                vCard = (CardView) v.findViewById(R.id.card_view);
                vImage = (ImageView)v.findViewById(R.id.img);
                String fontPath = "fonts/Montserrat-Regular.ttf";
                Typeface tf = Typeface.createFromAsset(v.getContext().getAssets(), fontPath);
                vTitle.setTypeface(tf);
            }


        }

        @Override
        public PoliciesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);

            return new PoliciesViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(PoliciesViewHolder holder, final int position) {
            holder.vTitle.setText(list.get(position).getName());
            holder.vCard.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    PdfUtil.OpenPdfIntent(v.getContext(), list.get(position).getInfographicPath());
                }
            });

            holder.vImage.setImageResource(list.get(position).getResId());
        }

        @Override
        public int getItemCount() {
            return list.size();
        }


    }
